package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin extends CommonMethods {

    //        create an instance of WebDriver
    WebDriver driver=new ChromeDriver();
    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
        //driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        openBrowserAndLaunchApplication();
    }
    @When("user enters valid user and valid password")
    public void user_enters_valid_email_and_valid_password() {
        sendText(login.UsernameTxtbox, ConfigReader.getPropertyValue("username"));
//WebElement passwordTextBox=driver.findElement(By.id("txtPassword"));
        sendText(login.UsernamePswdBox,ConfigReader.getPropertyValue("password"));
    }
    @When("click on login button")
    public void click_on_login_button() {
       // driver.findElement(By.xpath("//input[@name='Submit']")).click();
        doClick(login.LoginBtn);
    }
    @Then("user is logged in successfully into the application")
    public void user_is_logged_in_successfully_into_the_application() {


    }

    @Then("Close the browser")
    public void close_the_browser() {
driver.close();
    }

}
