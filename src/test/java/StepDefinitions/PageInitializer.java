package StepDefinitions;


import Pages.AddEmployeePage;
import Pages.EmployeeTerminationPage;

import Pages.AddDependentsPage;

import Pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static AddDependentsPage addDependents;


    public static AddEmployeePage addEmployeePage;

    public static EmployeeTerminationPage terminationPage;


    public static void PageObjectInitializer(){
        terminationPage = new EmployeeTerminationPage();
        addDependents = new AddDependentsPage();
        login = new LoginPage();
        addEmployeePage=new AddEmployeePage();

    }
}
