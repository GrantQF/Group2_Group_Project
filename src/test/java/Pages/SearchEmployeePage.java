package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchEmployeePage extends CommonMethods {
    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement EmpPage;
    @FindBy(id="empsearch_employee_name_empName")
    public WebElement employeeNameTextBox;
    @FindBy(id="empsearch_id")
    public WebElement employeeIDTextBox;
    @FindBy(id="searchBtn")
    public WebElement searchBtn;
    public SearchEmployeePage(){
        PageFactory.initElements(driver,this);
    }
}
