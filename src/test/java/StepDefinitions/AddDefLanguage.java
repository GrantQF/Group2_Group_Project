package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class AddDefLanguage extends CommonMethods {
    @Given("user clicks on admin")
    public void user_clicks_on_admin() {
       doClick(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")));
    }
    @Then("user slicks on Qualification")
    public void user_slicks_on_qualification() {
        driver.findElement(By.xpath("//*[@id=\"menu_admin_Qualifications\"]"));
        Actions action =new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_Qualifications\"]"))).perform();



    }
    @Then("user clicks on the Language")
    public void user_clicks_on_the_language() {
        doClick(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewLanguages\"]")));

    }
    @Then("clicks on Add")
    public void clicks_on_add() {
        doClick(driver.findElement(By.xpath("//input[@id='btnAdd']")));

    }
    @Then("user fills the Language")
    public void user_fills_the_language() {
        sendText(driver.findElement(By.xpath("//input[@type='text']")), "Persian");

    }

}
