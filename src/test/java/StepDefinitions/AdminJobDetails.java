package StepDefinitions;

import Pages.MainLanding;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class AdminJobDetails extends CommonMethods {

    @When("Clicks on the Employee They Wish to Edit")
    public void clicks_on_the_employee_they_wish_to_edit() throws InterruptedException {
        Thread.sleep(3000);
        sendText(mainLanding.empSearch, ConfigReader.getPropertyValue("employeeEdit"));
        clickOnDropdown(mainLanding.includeDropDown);
        selectByVisibleText(mainLanding.includeDropDown, "Current and Past Employees");
        doClick(mainLanding.empSearchBtn);
        WebElement desiredEmployee = driver.findElement(By.linkText(ConfigReader.getPropertyValue("employeeEdit")));
        doClick(desiredEmployee);

    }
    @When("Clicks on Job on the Left Employee Panel")
    public void clicks_on_job_on_the_left_employee_panel() {
        doClick(employeeEditPage.job);

    }
    @Then("Clicks Edit")
    public void clicks_edit() {
        doClick(employeeEditPage.editSaveBtn);

    }
    @Then("Selects an Employee Job Title")
    public void selects_an_employee_job_title() {
        clickOnDropdown(employeeEditPage.jobTitleDropDown);
        selectByVisibleText(employeeEditPage.jobTitleDropDown, ConfigReader.getPropertyValue("job"));

    }
    @Then("Selects an Employee Employment Status")
    public void selects_an_employee_employment_status() {
        clickOnDropdown(employeeEditPage.empStatusDropDown);
        selectByVisibleText(employeeEditPage.empStatusDropDown, ConfigReader.getPropertyValue("empstatus"));

    }
    @Then("Selects a Job Category")
    public void selects_a_job_catagory() {
        clickOnDropdown(employeeEditPage.jobCategoryDropDown);
        selectByVisibleText(employeeEditPage.jobCategoryDropDown, ConfigReader.getPropertyValue("jobcatagory"));

    }
    @Then("Selects a Joined Date")
    public void selects_a_joined_date() {
        doClick(employeeEditPage.joinedDateCalender);
        doClick(employeeEditPage.backClndBtn);
        doClick(employeeEditPage.forwardClndBtn);
        clickOnDropdown(employeeEditPage.monthClndDropDown);
        selectByVisibleText(employeeEditPage.monthClndDropDown, ConfigReader.getPropertyValue("joinedmonth"));
        clickOnDropdown(employeeEditPage.yearClndDropDown);
        selectByVisibleText(employeeEditPage.yearClndDropDown, ConfigReader.getPropertyValue("joinedyear"));
        List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
        for (WebElement day:days){
            String dayNum = day.getText();
            if (dayNum.equalsIgnoreCase(ConfigReader.getPropertyValue("joinedday"))){
                doClick(day);
            }
        }


    }
    @Then("Selects a Sub Unit")
    public void selects_a_sub_unit() {
        clickOnDropdown(employeeEditPage.subUnitDropDown);
        selectByVisibleText(employeeEditPage.subUnitDropDown, ConfigReader.getPropertyValue("subunit"));

    }

    @And("Selects a Location")
    public void selectsALocation() throws InterruptedException {
        clickOnDropdown(employeeEditPage.locationDropDown);
        selectByVisibleText(employeeEditPage.locationDropDown, ConfigReader.getPropertyValue("location"));


    }


    @Then("Selects a Start Date")
    public void selects_a_start_date() {
        doClick(employeeEditPage.startDateCalender);
        doClick(employeeEditPage.backClndBtn);
        doClick(employeeEditPage.forwardClndBtn);
        clickOnDropdown(employeeEditPage.monthClndDropDown);
        selectByVisibleText(employeeEditPage.monthClndDropDown, ConfigReader.getPropertyValue("startmonth"));
        clickOnDropdown(employeeEditPage.yearClndDropDown);
        selectByVisibleText(employeeEditPage.yearClndDropDown, ConfigReader.getPropertyValue("startyear"));
        List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
        for (WebElement day:days){
            String dayNum = day.getText();
            if (dayNum.equalsIgnoreCase(ConfigReader.getPropertyValue("startDay"))){
                doClick(day);
            }
        }
    }
    @Then("Selects a End Date")
    public void selects_a_end_date() {
        doClick(employeeEditPage.endDateCalender);
        doClick(employeeEditPage.backClndBtn);
        doClick(employeeEditPage.forwardClndBtn);
        clickOnDropdown(employeeEditPage.monthClndDropDown);
        selectByVisibleText(employeeEditPage.monthClndDropDown, ConfigReader.getPropertyValue("endmonth"));
        clickOnDropdown(employeeEditPage.yearClndDropDown);
        selectByVisibleText(employeeEditPage.yearClndDropDown, ConfigReader.getPropertyValue("endyear"));
        List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
        for (WebElement day:days){
            String dayNum = day.getText();
            if (dayNum.equalsIgnoreCase(ConfigReader.getPropertyValue("endday"))){
                doClick(day);
            }
        }
    }
    @Then("Uploads Contract Details up to 1MB")
    public void uploads_contract_details_up_to_1mb() {
        File file = new File(ConfigReader.getPropertyValue("emptestfile"));
        employeeEditPage.chooseFileBtn.sendKeys(file.getAbsolutePath());

    }
    @Then("The System Will Store the Job Details Entered")
    public void the_system_will_store_the_job_details_entered() throws InterruptedException {
        Thread.sleep(5000);
        doClick(employeeEditPage.editSaveBtn);
    }

    @Then("The System Validates the Mandatory Fields Are Filled in")
    public void theSystemValidatesTheMandatoryFieldsAreFilledIn() {
        String jobTitle = employeeEditPage.jobTitleDropDown.getAttribute("value");
        if (jobTitle.equalsIgnoreCase("-- Select --") || jobTitle.equals("")){
            System.out.println("The Job Title Field is empty");
        }else{
            System.out.println("The Job Title Field is filled");
        }

        String employmentStatus = employeeEditPage.empStatusDropDown.getAttribute("value");
        if (employmentStatus.equalsIgnoreCase("-- Select --") || employmentStatus.equals("")){
            System.out.println("The Employment Status Field is empty");
        }else{
            System.out.println("The Employment Status Field is filled");
        }

        String subUnit = employeeEditPage.subUnitDropDown.getAttribute("value");
        if (subUnit.equalsIgnoreCase("-- Select --") || subUnit.equals("")){
            System.out.println("The Sub Unit Field is empty");
        }else{
            System.out.println("The Sub Unit Field is filled");
        }

        String location = employeeEditPage.locationDropDown.getAttribute("value");
        if (location.equalsIgnoreCase("-- Select --") || location.equals("")){
            System.out.println("The Location Field is empty");
        }else{
            System.out.println("The Location Field is filled");
        }

        String date = employeeEditPage.joinedDateCalender.getText();
        if (date.isEmpty() || date.isBlank()){
            System.out.println("The Date Field is empty");
        }else{
            System.out.println("The Date Field is filled");
        }

    }

    @And("The System will not Store the Info if All Fields Are Not Filled in")
    public void theSystemWillNotStoreTheInfoIfAllFieldsAreNotFilledIn() throws InterruptedException {
        doClick(employeeEditPage.editSaveBtn);
        String btnSaveText =  employeeEditPage.editSaveBtn.getAttribute("value");
        if (btnSaveText.equalsIgnoreCase("Save")){
            System.out.println("The System is Verifying Correctly");
        }else {
            System.out.println("The System in NOT Verifying Correctly");
        }

    }
}
