package StepDefinitions;


import Pages.*;
import Pages.AddEmployeePage;
import Pages.LoginPage;
import Pages.SearchEmployeePage;

import net.bytebuddy.asm.Advice;


import Pages.AddEmployeePage;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageInitializer {

    public static LoginPage login;
    public static AddDependentsPage addDependents;


    public static AddEmployeePage addEmployeePage;
    public static MainLanding mainLanding;
    public static EmployeeEditPage employeeEditPage;

    public static EmployeeTerminationPage terminationPage;

    public static EmployeeChangeDetailsPage empChangeDetails;


    public static SearchEmployeePage searchemployeePage;

    public static void PageObjectInitializer(){
        terminationPage = new EmployeeTerminationPage();
        addDependents = new AddDependentsPage();
        login = new LoginPage();
        addEmployeePage=new AddEmployeePage();
        mainLanding = new MainLanding();
        employeeEditPage = new EmployeeEditPage();
        empChangeDetails = new EmployeeChangeDetailsPage();
        searchemployeePage= new SearchEmployeePage();


    }
}
