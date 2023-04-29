package StepDefinitions;

import Pages.AddDependentsPage;
import Pages.LoginPage;
import net.bytebuddy.asm.Advice;

import java.sql.Driver;

public class PageInitializer {

    public static LoginPage login;

    public static AddDependentsPage addDependents;
    public static void PageObjectInitializer(){
        addDependents = new AddDependentsPage();
        login = new LoginPage();

    }
}