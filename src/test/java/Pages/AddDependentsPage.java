package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDependentsPage extends CommonMethods {
    public AddDependentsPage() {
        PageFactory.initElements(driver, this);}
    @FindBy(partialLinkText = "My Info")
    public WebElement myInfoTab;
    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
    public WebElement employeeSelect;
    @FindBy(partialLinkText = "Dependents")
    public WebElement dependentsBtn;
    @FindBy(xpath = "//input[@id='btnAddDependent']")
    public WebElement addBtn;
    @FindBy(xpath = "//input[@id='btnSaveDependent']")
    public WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"frmEmpDependent\"]/fieldset/ol/li[1]/span")
    public WebElement requiredDisp;
    @FindBy(xpath = "//*[@id=\"frmEmpDependent\"]/fieldset/ol/li[2]/span")
    public WebElement requiredDisp2;
    @FindBy(xpath = "//*[@id=\"relationshipDesc\"]/span")
    public WebElement requiredDisp3;
    @FindBy(xpath = "//input[@id='dependent_name']")
    public WebElement dependentNameBox;
    @FindBy(xpath = "//select[@id='dependent_relationshipType']")
    public WebElement relationshipBtn;
    @FindBy(xpath = "//input[@id='dependent_relationship']")
    public WebElement dependentRelationshipBox;
    @FindBy(xpath = "//input[@id='dependent_dateOfBirth']")
    public WebElement dObBox;
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement monthBtn;
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement yearBtn;
    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[1]/a")
    public WebElement dateBtn;
    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a")
    public WebElement date2Btn;
}
