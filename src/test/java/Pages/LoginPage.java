package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

 public LoginPage() {
     PageFactory.initElements(driver, this);}

     @FindBy(id= "txtUsername")
     public WebElement UsernameTxtbox;

     @FindBy(id = "txtPassword")
     public WebElement UsernamePswdBox;

     @FindBy(id = "btnLogin")
     public WebElement LoginBtn;

    @FindBy(id = "welcome")
    public WebElement welcomeIcon;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutLink;

    @FindBy(xpath = "//*[@id='spanMessage']")
    public WebElement invalidcredsErrorMsg;
 }

