package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class AddDependents extends CommonMethods {
    @Given("employee user log in to the system using valid credentials")
    public void admin_user_log_in_to_the_system_using_valid_credentials() {
        sendText(login.UsernameTxtbox, ConfigReader.getPropertyValue("empusername"));
        sendText(login.UsernamePswdBox, ConfigReader.getPropertyValue("emppassword"));
        doClick(login.LoginBtn);
    }
    @When("user clicks on My Info")
    public void user_clicks_pim_tab() {
        doClick(addDependents.myInfoTab);
    }
    @When("clicks on dependents button under employee")
    public void clicks_on_dependents_button_under_employee() {
        doClick(addDependents.dependentsBtn);
    }
    @When("clicks on add button under assigned dependents")
    public void clicks_on_add_button_under_assigned_dependents() {
        doClick(addDependents.addBtn);
    }
    @When("clicks on save button")
    public void clicks_on_save_button() {
        doClick(addDependents.saveBtn);
        selectByVisibleText(addDependents.relationshipBtn, "Other");
        doClick(addDependents.saveBtn);
    }
    @When("displays correct error messages")
    public void shows_correct_error_messages() {
        WebElement Required1 = addDependents.requiredDisp;
        Required1.isDisplayed();
        System.out.println("First Required error message is displayed");
        WebElement Required2 = addDependents.requiredDisp2;
        Required2.isDisplayed();
        System.out.println("Second Required error message is displayed");
        WebElement Required3 = addDependents.requiredDisp3;
        Required3.isDisplayed();
        System.out.println("Third Required error message is displayed");
    }
    @When("enters dependent's name, relationship, and date of birth")
    public void enters_dependent_s_name_relationship_and_date_of_birth() {
        sendText(addDependents.dependentNameBox, "Jessica Mary Torn");
        selectByVisibleText(addDependents.relationshipBtn, "Other");
        sendText(addDependents.dependentRelationshipBox, "Spouse");
        doClick(addDependents.dObBox);
        doClick(addDependents.monthBtn);
        selectByVisibleText(addDependents.monthBtn, "May");
        doClick(addDependents.yearBtn);
        selectByVisibleText(addDependents.yearBtn, "1980");
        doClick(addDependents.dateBtn);
        doClick(addDependents.saveBtn);
        doClick(addDependents.addBtn);
        sendText(addDependents.dependentNameBox, "Mike John Torn Jr.");
        selectByVisibleText(addDependents.relationshipBtn, "Child");
        doClick(addDependents.dObBox);
        doClick(addDependents.monthBtn);
        selectByVisibleText(addDependents.monthBtn, "Jun");
        doClick(addDependents.yearBtn);
        selectByVisibleText(addDependents.yearBtn, "2006");
        doClick(addDependents.dateBtn);
        doClick(addDependents.saveBtn);
        doClick(addDependents.addBtn);
        sendText(addDependents.dependentNameBox, "Ashley Ann Torn");
        selectByVisibleText(addDependents.relationshipBtn, "Child");
        doClick(addDependents.dObBox);
        doClick(addDependents.monthBtn);
        selectByVisibleText(addDependents.monthBtn, "Mar");
        doClick(addDependents.yearBtn);
        selectByVisibleText(addDependents.yearBtn, "2008");
        doClick(addDependents.dateBtn);
    }
    @Then("user clicks save button to successfully save dependent")
    public void user_clicks_save_button_to_successfully_save_dependent() {
        doClick(addDependents.saveBtn);
    }
}
