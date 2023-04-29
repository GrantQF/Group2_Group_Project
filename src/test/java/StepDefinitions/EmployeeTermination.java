package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmployeeTermination extends CommonMethods {

    @Given("admin user log in to the system using valid credentials")
    public void admin_user_log_in_to_the_system_using_valid_credentials() {
        sendText(login.UsernameTxtbox, ConfigReader.getPropertyValue("username"));
        sendText(login.UsernamePswdBox, ConfigReader.getPropertyValue("password"));
        doClick(login.LoginBtn);
    }
    @When("user accesses the list of employees in the system")
    public void user_accesses_the_list_of_employees_in_the_system() {
        doClick(terminationPage.pimTab);
    }
    @When("select a specified employee from the list")
    public void select_a_specified_employee_from_the_list() {
        doClick(terminationPage.employeeSelect);
    }
    @When("navigate to the employee's job page")
    public void navigate_to_the_employee_s_job_page() {
        doClick(terminationPage.jobPage);
    }
    @When("select the option to terminate the employment of the specified employee")
    public void select_the_option_to_terminate_the_employment_of_the_specified_employee() {
        doClick(terminationPage.terminateBtn);
    }
    @Then("specified employee is terminated")
    public void specified_employee_is_terminated() {
        doClick(terminationPage.confirmBtn);
    }
}