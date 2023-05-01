package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;

public class DeleteExperience extends CommonMethods {
    @Then("employee clicks on selected company check box")
    public void employee_clicks_on_selected_company_check_box() {

        doClick(employeeExperiencePage.companysheinbox);
    }
    @Then("employee clicks on delete button")
    public void employee_clicks_on_delete_button() {

        doClick(employeeExperiencePage.deletebtnBox);

    }

}
