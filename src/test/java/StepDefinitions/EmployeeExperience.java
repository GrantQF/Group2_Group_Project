package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeExperience extends CommonMethods {

    @When("employee enter valid email and valid password")
    public void employee_enter_valid_email_and_valid_password() {
        sendText(login.UsernameTxtbox, ConfigReader.getPropertyValue("empusername1"));
        sendText(login.UsernamePswdBox, ConfigReader.getPropertyValue("emppassword1"));

    }
    @When("click on login")
    public void click_on_login() {
        doClick(employeeExperiencePage.loginbtn);

    }
    @When("employee clicks on myinfo tab")
    public void employee_clicks_on_myinfo_tab() {
        doClick(employeeExperiencePage.myinfoTab);

    }
    @When("employee clicks on qualification tab")
    public void employee_clicks_on_qualification_tab() {
        doClick(employeeExperiencePage.QualificationsTab);

    }
    @Then("employee clicks on work experience add button")
    public void employee_clicks_on_work_experience_add_button() {
        doClick(employeeExperiencePage.addBtn);

    }
    @Then("employee can enter company title")
    public void employee_can_enter_company_title() {
sendText(employeeExperiencePage.companyBox,ConfigReader.getPropertyValue("company"));

    }
    @Then("employee can enter job title")
    public void employee_can_enter_job_title() {

        sendText(employeeExperiencePage.jobtitleBox,ConfigReader.getPropertyValue("jobtitle"));
    }
    @Then("employee click on from calendar")
    public void employee_click_on_from_calendar() {
        sendText(employeeExperiencePage.fromdateBox,ConfigReader.getPropertyValue("fromdate"));

    }
    @Then("employee click on to calendar")
    public void employee_click_on_to_calendar() {

        sendText(employeeExperiencePage.todateBox,ConfigReader.getPropertyValue("todate"));

    }
    @Then("employee write in the comment box")
    public void employee_write_in_the_comment_box() {
        sendText(employeeExperiencePage.commentBox,ConfigReader.getPropertyValue("commentbox"));

    }
    @Then("click on the save button")
    public void click_on_the_save_button() {
        doClick(employeeExperiencePage.savebtnBox);

    }


    @When("Employee enter valid email and valid password")
    public void employeeEnterValidEmailAndValidPassword() {

        sendText(login.UsernameTxtbox, ConfigReader.getPropertyValue("empusername1"));
        sendText(login.UsernamePswdBox, ConfigReader.getPropertyValue("emppassword1"));
        
    }

    @And("Employee click on login")
    public void employeeClickOnLogin() {
        doClick(employeeExperiencePage.loginbtn);
    }

    @And("Employee clicks on myinfo tab")
    public void employeeClicksOnMyinfoTab() {
        doClick(employeeExperiencePage.myinfoTab);
    }

    @And("Employee clicks on qualification tab")
    public void employeeClicksOnQualificationTab() {
        doClick(employeeExperiencePage.QualificationsTab);
    }

    @Then("Employee clicks on work experience add button")
    public void employeeClicksOnWorkExperienceAddButton() {
        doClick(employeeExperiencePage.addBtn);
    }

    @And("Employee can enter company title")
    public void employeeCanEnterCompanyTitle() {
        sendText(employeeExperiencePage.companyBox,ConfigReader.getPropertyValue("company1"));
    }

    @And("Employee can enter job title")
    public void employeeCanEnterJobTitle() {
        sendText(employeeExperiencePage.jobtitleBox,ConfigReader.getPropertyValue("jobtitle1"));
    }

    @And("Employee click on from calendar")
    public void employeeClickOnFromCalendar() {
        sendText(employeeExperiencePage.fromdateBox,ConfigReader.getPropertyValue("fromdate1"));
    }

    @And("Employee click on to calendar")
    public void employeeClickOnToCalendar() {
        sendText(employeeExperiencePage.todateBox,ConfigReader.getPropertyValue("todate1"));
    }
    @Then("Employee writes in the comment box")
    public void employeeWritesInTheCommentBox() {

        sendText(employeeExperiencePage.commentBox,ConfigReader.getPropertyValue("commentbox1"));
    }


    @And("Employee click on the save button")
    public void employeeClickOnTheSaveButton() {
        doClick(employeeExperiencePage.savebtnBox);
    }


}
