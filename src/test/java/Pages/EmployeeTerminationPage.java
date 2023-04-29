package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeTerminationPage extends CommonMethods {
    public EmployeeTerminationPage() {
        PageFactory.initElements(driver, this);}
    @FindBy(partialLinkText = "PIM")
    public WebElement pimTab;
    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
    public WebElement employeeSelect;
    @FindBy(partialLinkText = "Job")
    public WebElement jobPage;
    @FindBy(xpath = "//input[@value='Terminate Employment']")
    public WebElement terminateBtn;
    @FindBy(xpath = "//input[@value='Confirm']")
    public WebElement confirmBtn;
}