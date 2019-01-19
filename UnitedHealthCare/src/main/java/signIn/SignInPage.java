package signIn;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SignInPage extends BaseUtil {
    @FindBy(how = How.ID, using = "hsid-username")
    public static WebElement userName;

    @FindBy(how = How.ID, using = "hsid-password")
    public static WebElement passWord;

    @FindBy(how = How.NAME, using = "rememberMe")
    public static WebElement rememberMe;

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement signIn;

    public void checkUserName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.click();
    }
    public void checkPassWord(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        passWord.click();
    }
    public void checkRememberMe() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        rememberMe.click();
    }
    public void checkSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.click();
    }
    public void checksignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.sendKeys("orfatt11@gmail.com");
        passWord.sendKeys("abc123");
        rememberMe.click();
        signIn.click();
    }

}