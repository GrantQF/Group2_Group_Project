package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;

public class EditExperience extends CommonMethods {


    @Then("employee clicks on selected company name")
    public void employee_clicks_on_selected_company_name() {

        doClick(employeeExperiencePage.companyapplebox);

    }
    @Then("employee edits job title box")
    public void employee_edits_job_title_box() {

        sendText(employeeExperiencePage.jobtitleBox, "Developer");
    }


}
