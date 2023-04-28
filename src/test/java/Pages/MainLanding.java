package Pages;

import Utils.CommonMethods;
import Utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainLanding extends CommonMethods {

    public MainLanding (){
        PageFactory.initElements(driver, this);}

    @FindBy (id = "menu_admin_viewAdminModule")
    public WebElement adminTab;

    @FindBy (id = "menu_pim_viewPimModule")
    public WebElement pimTab;

    @FindBy (id = "menu_leave_viewLeaveModule")
    public WebElement leaveTab;

    @FindBy (id = "menu_time_viewTimeModule")
    public WebElement timeTab;

    @FindBy (id = "menu_recruitment_viewRecruitmentModule")
    public WebElement recruitmentTab;

    @FindBy (id = "menu__Performance")
    public WebElement performanceTab;

    @FindBy (id = "menu_dashboard_index")
    public WebElement dashboardTab;

    @FindBy (id = "menu_directory_viewDirectory")
    public WebElement directoryTab;

    @FindBy (id = "menu_admin_Job")
    public WebElement jobDropdown;

    @FindBy (id = "menu_admin_Organization")
    public WebElement orgDropdown;

    @FindBy (id = "menu_admin_Qualifications")
    public WebElement qualDropdown;

    @FindBy (id = "menu_admin_nationality")
    public WebElement nationDropdown;

    @FindBy (id = "menu_admin_Configuration")
    public WebElement configDropdown;

    @FindBy (id = "empsearch_employee_name_empName")
    public WebElement empSearch;

    @FindBy (id = "empsearch_termination")
    public WebElement includeDropDown;

    @FindBy (id = "searchBtn")
    public WebElement empSearchBtn;

}
