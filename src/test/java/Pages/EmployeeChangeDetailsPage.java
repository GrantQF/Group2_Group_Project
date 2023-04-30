package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeChangeDetailsPage extends CommonMethods {
    public EmployeeChangeDetailsPage (){
        PageFactory.initElements(driver, this);}

    @FindBy(id="txtUsername")
    public WebElement usernameTxtbox;

    @FindBy(id = "txtPassword")
    public WebElement usernamePswdBox;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

    @FindBy(id="menu_pim_viewMyDetails")
    public WebElement myInfo;

    @FindBy(id="btnSave")
    public WebElement editBtn;

    @FindBy(id="personal_txtEmpFirstName")
    public WebElement firstNAme ;

    @FindBy(id="personal_txtEmpMiddleName")
    public WebElement middleName;

    @FindBy(id="personal_txtEmpLastName")
    public WebElement lastName ;

    @FindBy(id="personal_optGender_1")
    public WebElement male;

    @FindBy(id="personal_cmbMarital")
    public WebElement maritalStatus;

    @FindBy(id="personal_cmbNation")
    public WebElement nationality ;

    @FindBy(id="btnSave")
    public WebElement saveBtn;
}
