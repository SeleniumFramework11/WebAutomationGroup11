package SignInPage;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignInPage extends BaseUtil {
    @FindBy(id = "id_userLoginId")
    public static WebElement emailTextBox;
    public void enterEmail(String emailAddress){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        emailTextBox.sendKeys(emailAddress); }
    @FindBy(id = "id_password")
    public static WebElement passwordTextBox;
    public void enterPassword(String enterPassword){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        passwordTextBox.sendKeys(enterPassword);
    }
    @FindBy(xpath = "//span[@class='login-remember-me-label-text']")
    public static WebElement rememberMeCheckBox;
    public void checkRememberMe(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if(!rememberMeCheckBox.isSelected()){ rememberMeCheckBox.click();} }
    @FindBy(linkText = ("Need help?"))
    public static WebElement needHelpLink;
    public void needHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        needHelpLink.click();
    }
    @FindBy(xpath = "//span[.='Login with Facebook']")
    public static WebElement loginWithFacebookLink;
    public void loginWithFacebook(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginWithFacebookLink.click();
    }
    @FindBy(linkText = "Sign up now")
    public static WebElement signUp;
    public void signUpLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signUp.click();
    }
    @FindBy(xpath = "//span[.='Gift Card Terms']")
    public static WebElement giftCardTerms;
    public void giftCardTermsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCardTerms.click();
    }
    @FindBy(xpath = "//span[.='Privacy Statement']")
    public static WebElement privacyStatement;
    public void privacyStatementLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyStatement.click();
    }
    @FindBy(xpath = "//button[.='Sign In']")
    public WebElement signInButtonSIP;
    public void signInButtonSIPButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInButtonSIP.click();
    }
}

