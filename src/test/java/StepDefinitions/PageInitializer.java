package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.LoginPage;
import Pages.SearchEmployeePage;
import net.bytebuddy.asm.Advice;

import java.sql.Driver;

public class PageInitializer {

    public static LoginPage login;
    public static AddEmployeePage addEmployeePage;

    public static SearchEmployeePage searchemployeePage;

    public static void PageObjectInitializer(){

        login = new LoginPage();
        addEmployeePage=new AddEmployeePage();
        searchemployeePage= new SearchEmployeePage();

    }
}
