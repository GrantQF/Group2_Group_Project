package StepDefinitions;

import Pages.AddEmployeePage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {
    @When("user clicks on PIM")
    public void user_clicks_on_pim() {
        doClick(addEmployeePage.pimTab);
    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
        doClick(addEmployeePage.addEmp);
    }
    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {
        sendText(addEmployeePage.firstNameTextBox, ConfigReader.getPropertyValue("firstname"));
        sendText(addEmployeePage.middleNameTextBox, ConfigReader.getPropertyValue("middlename"));
        sendText(addEmployeePage.lastNameTextBox, ConfigReader.getPropertyValue("lastname"));
    }
    @Then("user selects create login box")
    public void user_selects_create_login_box() {

        doClick(addEmployeePage.loginBox);
    }
    @Then("user fills username")
    public void user_fills_username() {
        sendText(addEmployeePage.userNameBox,ConfigReader.getPropertyValue("empusername"));
    }
    @Then("user fills password and confirm it")
    public void user_fills_password_and_confirm_it() {
        sendText(addEmployeePage.userPasswordBox, ConfigReader.getPropertyValue("emppassword"));
        sendText(addEmployeePage.rePasswordBox, ConfigReader.getPropertyValue("emppassword"));

    }
    @Then("user selects status enabled")
    public void user_selects_status_enabled() {
        WebElement statusDropDown = driver.findElement(By.id("status"));
        clickOnDropdown(statusDropDown).selectByValue("Enabled");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        // WebElement saveBtn= driver.findElement(By.id("btnSave"));
        doClick(addEmployeePage.saveBtn);
    }
}