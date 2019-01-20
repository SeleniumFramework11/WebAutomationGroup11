package homepage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class RegisterPage extends BaseUtil {
    @FindBy (name = "firstname")
    public static WebElement firstName;
    @FindBy (name = "lastname")
    public static WebElement lastName;
    @FindBy (name = "dob")
    public static WebElement doB;
    @FindBy (name = "registerWithMember")
    public static WebElement memberNumber;
    @FindBy (name = "ssn")
    public static WebElement socialSecurityNumber;
    @FindBy (name = "zip")
    public static WebElement zip;

    public void checkRegistration() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        firstName.sendKeys("Orfatt");
        lastName.sendKeys("Chowdhury");
        doB.sendKeys("05/06/1993");
        memberNumber.click();
        socialSecurityNumber.sendKeys("825231");
        zip.sendKeys("11101");
    }
}
