package signIn;
import base.BaseUtil;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    @FindBy(how = How.ID, using = "loginmenubutton")
    public static WebElement logInMenuButton;

    @FindBy(how = How.XPATH, using = "body.lang-en:nth-child(2) div.viewport-wrapper:nth-child(7) div.uhc-wrapper:nth-child(2) div.header:nth-child(1) header.main-header.container.lang-header.en-header div.loginIpar.iparsys.parsys:nth-child(6) div.login.section div.login-wrapper div.login-content ul:nth-child(1) li.login-dropdown-link-text:nth-child(1) > a:nth-child(1)")
    public static WebElement myUHCButton;

    @FindBy(how = How.XPATH, using = "body.lang-en:nth-child(2) div.viewport-wrapper:nth-child(7) div.uhc-wrapper:nth-child(2) div.header:nth-child(1) header.main-header.container.lang-header.en-header div.loginIpar.iparsys.parsys:nth-child(6) div.login.section div.login-wrapper div.login-content ul:nth-child(1) li.login-dropdown-link-text:nth-child(1) > a:nth-child(1)")
    public static WebElement myGroupRetireeAccount;

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
    public static void waitToBeVisible() {
        TestLogger.log(SignInPage.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(myUHCButton));
        wait.until(ExpectedConditions.visibilityOf(myGroupRetireeAccount));
    }
    public void signInByENTERKeyword(String logInMenuBotton) {
        waitToBeVisible();
        myUHCButton.sendKeys(logInMenuBotton, Keys.ENTER);
        myGroupRetireeAccount.sendKeys(logInMenuBotton, Keys.ENTER);
    }
    public void signInBySubmitButton(String logInMenuButton) {
        waitToBeVisible();
        myUHCButton.sendKeys(logInMenuButton);
        myGroupRetireeAccount.click();
    }

}