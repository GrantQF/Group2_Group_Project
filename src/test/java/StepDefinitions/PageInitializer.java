package StepDefinitions;

import Pages.EmployeeTerminationPage;
import Pages.LoginPage;
import net.bytebuddy.asm.Advice;

import java.sql.Driver;

public class PageInitializer {

    public static LoginPage login;
    public static EmployeeTerminationPage terminationPage;

    public static void PageObjectInitializer(){
        terminationPage = new EmployeeTerminationPage();
        login = new LoginPage();
    }
}
