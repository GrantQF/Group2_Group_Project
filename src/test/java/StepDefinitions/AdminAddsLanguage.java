package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminAddsLanguage extends CommonMethods {

    @When("Admin navigates to Qualifications and Selects Language")
    public void admin_navigates_to_qualifications_and_selects_language(){
        doClick(mainLanding.adminTab);
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30));
        wait.until(ExpectedConditions.visibilityOf(mainLanding.qualDropdown));
        action.moveToElement(mainLanding.qualDropdown).perform();
        doClick(mainLanding.langMenu);

    }
    @When("Clicks Add")
    public void clicks_add() {
        doClick(mainLanding.addBtn);

    }
    @Then("Enters the Language")
    public void enters_the_language() {
        sendText(mainLanding.languageTxtBar, ConfigReader.getPropertyValue("language"));

    }
    @Then("Clicks Save")
    public void clicks_save() {
        doClick(mainLanding.langSaveBtn);

    }
    @Then("The Language Will Be Added")
    public void the_language_will_be_added(){

        try {
            Boolean LangAdded = driver.findElement(By.linkText(ConfigReader.getPropertyValue("language"))).isDisplayed();
            if (LangAdded){
                System.out.println("The Language has been successfully added");
            }
        }catch (NoSuchElementException e){
            System.out.println("The Language has NOT been successfully added");
        }

    }

}
