package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin extends CommonMethods {


    //        create an instance of WebDriver


    @When("user enters valid user and valid password")
    public void user_enters_valid_email_and_valid_password() {
        sendText(login.UsernameTxtbox, ConfigReader.getPropertyValue("username"));
//WebElement passwordTextBox=driver.findElement(By.id("txtPassword"));
        sendText(login.UsernamePswdBox,ConfigReader.getPropertyValue("password"));
    }
    @When("click on login button")
    public void  click_on_login_button() {
        // driver.findElement(By.xpath("//input[@name='Submit']")).click();
        doClick(login.LoginBtn);
    }

    @Then("user is logged in successfully into the application")
    public void user_is_logged_in_successfully_into_the_application() {
        //LoginPage login = new LoginPage();
        boolean userloggedIn = login.welcomeIcon.isDisplayed();
        if (userloggedIn) {
            System.out.println("User is logged in Successfully");
        }
    }


}
