package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;


public class SearchEmployee extends CommonMethods {
    @When("user clicks on employee list button")
    public void user_clicks_on_employee_list_button() {
        doClick(searchemployeePage.EmpPage);
    }

    @When("user enters employee name {string}")
    public void user_enters_employee_name(String fullname) throws InterruptedException {
        Thread.sleep(3000);
        searchemployeePage.employeeNameTextBox.clear();
        //sendText(searchemployeePage.employeeNameTextBox, ConfigReader.getPropertyValue("fullname"));
        sendText(searchemployeePage.employeeNameTextBox,fullname);
        searchemployeePage.employeeNameTextBox.sendKeys(Keys.DOWN);
        searchemployeePage.employeeNameTextBox.click();
    }

    @When("check searching results")
    public void check_searching_results() {
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        if (rows.isEmpty() || rows.get(0).getText().contains("No Records Found")) {
            System.out.println("No Records Found");
        } else {
            System.out.println("Search results count: " + rows.size());
        }
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        doClick(searchemployeePage.searchBtn);
        }
    @When("user enters employee id")
    public void user_enters_employee_id() {
        sendText(searchemployeePage.employeeIDTextBox, ConfigReader.getPropertyValue("id"));
    }
}
