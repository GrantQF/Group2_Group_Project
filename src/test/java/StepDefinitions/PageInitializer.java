package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.EmployeeEditPage;
import Pages.LoginPage;
import Pages.MainLanding;
import net.bytebuddy.asm.Advice;

import java.sql.Driver;

public class PageInitializer {

    public static LoginPage login;
    public static AddEmployeePage addEmployeePage;
    public static MainLanding mainLanding;
    public static EmployeeEditPage employeeEditPage;

    public static void PageObjectInitializer(){

        login = new LoginPage();
        addEmployeePage=new AddEmployeePage();
        mainLanding = new MainLanding();
        employeeEditPage = new EmployeeEditPage();
    }
}
