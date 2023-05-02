package StepDefinitions;

import Pages.EmployeeChangeDetailsPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeChangeDetails extends CommonMethods {

    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {
        sendText(empChangeDetails.usernameTxtbox, ConfigReader.getPropertyValue("empusername"));
        sendText(empChangeDetails.usernamePswdBox, ConfigReader.getPropertyValue("emppassword"));
    }
    @When("the user clicks on login")
    public void the_user_clicks_on_login() {
       doClick(empChangeDetails.loginBtn);
    }
    @When("the user clicks on My Info")
    public void the_user_clicks_on_my_info() {
        doClick(empChangeDetails.myInfo);
    }
    @When("the user clicks on edit")
    public void the_user_clicks_on_edit() {
        doClick(empChangeDetails.editBtn);
    }
    @When("user update firstname, middlename, and lastname")
    public void user_update_firstname_middlename_and_lastname() {
        sendText(empChangeDetails.firstNAme, ConfigReader.getPropertyValue("firstname"));
        sendText(empChangeDetails.middleName, ConfigReader.getPropertyValue("middlename"));
        sendText(empChangeDetails.lastName, ConfigReader.getPropertyValue("lastname"));
    }
    @When("user clicks on male button")
    public void user_clicks_on_male_button() throws InterruptedException {

        doClick(empChangeDetails.male);


    }
    @When("user clicks on Marital Status dropdown")
    public void user_clicks_on_marital_status_dropdown() throws InterruptedException {

        clickOnDropdown(empChangeDetails.maritalStatus);
        selectByVisibleText(empChangeDetails.maritalStatus, ConfigReader.getPropertyValue("maritalStatus"));

    }
  /*  @Then("users select Marital Status")
    public void users_select_marital_status() {*/



    @Then("user clicks on nationality dropdown")
    public void user_clicks_on_nationality_dropdown() {
        clickOnDropdown(empChangeDetails.nationality);
        selectByVisibleText(empChangeDetails.nationality, ConfigReader.getPropertyValue("Nationality"));
    }
   /* @Then("users select nationality country")
    public void users_select_nationality_country() {

    }*/
    @Then("the changes should be saved successfully")
    public void the_changes_should_be_saved_successfully() {
        doClick(empChangeDetails.saveBtn);
    }
}
