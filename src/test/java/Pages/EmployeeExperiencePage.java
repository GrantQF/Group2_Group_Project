package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeExperiencePage extends CommonMethods {

    public EmployeeExperiencePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id= "txtUsername")
    public WebElement usernamebox;

    @FindBy(id = "txtPassword")
    public WebElement userPasswordbox;

    @FindBy(id = "btnLogin")
    public WebElement loginbtn;

    @FindBy(id = "menu_pim_viewMyDetails")
    public WebElement myinfoTab;

    @FindBy(xpath = "//a[text()='Qualifications']")
    public WebElement QualificationsTab;

    @FindBy(id = "addWorkExperience")
    public WebElement addBtn;

    @FindBy(id = "experience_employer")
    public WebElement companyBox;

    @FindBy(id = "experience_jobtitle")
    public WebElement jobtitleBox;

    @FindBy(id = "experience_from_date")
    public WebElement fromdateBox;

    @FindBy(id = "experience_to_date")
    public WebElement todateBox;

    @FindBy(id = "experience_comments")
    public WebElement commentBox;

    @FindBy(id="btnWorkExpSave")
    public WebElement  savebtnBox;

    @FindBy(xpath = "//a[text()='Apple']")
    public WebElement companyapplebox;

    @FindBy(id="delWorkExperience")
    public WebElement  deletebtnBox;

    @FindBy(xpath = "//input[@value='2']")
    public WebElement companysheinbox;


}
