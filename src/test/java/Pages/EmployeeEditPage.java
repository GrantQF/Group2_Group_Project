package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeEditPage extends CommonMethods {

    public EmployeeEditPage ()
    {PageFactory.initElements(driver, this);}

    @FindBy (linkText = "Job")
    public WebElement job;

    @FindBy (id = "btnSave")
    public WebElement editSaveBtn;

    @FindBy (id = "job_job_title")
    public WebElement jobTitleDropDown;

    @FindBy (id = "job_emp_status")
    public WebElement empStatusDropDown;

    @FindBy (id = "job_eeo_category")
    public WebElement jobCategoryDropDown;

    @FindBy (id = "job_sub_unit")
    public WebElement subUnitDropDown;

    @FindBy (id = "job_joined_date")
    public WebElement joinedDateCalender;

    @FindBy (className = "ui-icon-circle-triangle-w")
    public WebElement backClndBtn;

    @FindBy (className = "ui-icon-circle-triangle-e")
    public WebElement forwardClndBtn;

    @FindBy (className = "ui-datepicker-month")
    public WebElement monthClndDropDown;

    @FindBy (className = "ui-datepicker-year")
    public WebElement yearClndDropDown;

    @FindBy (id = "job_location")
    public WebElement locationDropDown;

    @FindBy (id = "job_contract_start_date")
    public WebElement startDateCalender;

    @FindBy (id = "job_contract_end_date")
    public WebElement endDateCalender;

    @FindBy (id = "job_contract_file")
    public WebElement chooseFileBtn;


}
