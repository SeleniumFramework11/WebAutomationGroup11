package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignInPage extends BaseUtil {
    @FindBy(linkText = "Sign in")
    public static WebElement signIn;
    @FindBy(name = "userid")
    public static WebElement userID;
    @FindBy(name = "pass")
    public static WebElement passWord;
    @FindBy(id = "sgnBt")
    public static WebElement signinButton;

    public void checksignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.click();
        userID.sendKeys("alrafifahad96@gmail.com");
        passWord.sendKeys("Rafi1122");
        signinButton.click();
    }


}
