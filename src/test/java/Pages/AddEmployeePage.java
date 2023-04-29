package Pages;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimTab;
    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmp;
    @FindBy(id="firstName")
    public WebElement firstNameTextBox;
    @FindBy(id="middleName")
    public WebElement middleNameTextBox;
    @FindBy(id="lastName")
    public  WebElement lastNameTextBox;
    @FindBy(xpath="//input[@id='chkLogin']")
    public WebElement loginBox;

    @FindBy(xpath="//input[@id='user_name']")
    public WebElement userNameBox;

    @FindBy(xpath="//input[@id='user_password']")
    public WebElement userPasswordBox;

    @FindBy(xpath="//input[@id='re_password']")
    public WebElement  rePasswordBox;

    @FindBy(xpath="//select[@id='status']")
    public WebElement  statusBox;

    @FindBy(xpath="//input[@id='btnSave']")
    public WebElement  btnSaveBox;
    @FindBy(id="btnSave")
    public WebElement saveBtn;
    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }
}
