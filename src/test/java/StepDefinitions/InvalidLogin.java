package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidLogin extends CommonMethods {
    @When("user enters invalid user {string} and invalid password {string}")
    public void user_enters_invalid_user_and_invalid_password(String string, String string2) {
        sendText(login.UsernameTxtbox, string);
        sendText(login.UsernamePswdBox,string2);
        doClick(login.LoginBtn);
    }
    @Then("Invalid credentials error message appears")
    public void invalid_credentials_error_message_appears() {
        if (login.invalidcredsErrorMsg.isDisplayed()){
            System.out.println("Invalid login test password");
        }else {
            System.out.println("Invalid login message did not appear.");
        }
    }

}
