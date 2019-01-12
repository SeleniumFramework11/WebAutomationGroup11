package SignInPage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BaseUtil {
    @FindBy(id = "id_userLoginId")
    public static WebElement emailTextBox;
    public void enterEmail(String emailAddress){
        emailTextBox.sendKeys(emailAddress);
    }
    @FindBy(id = "id_password")
    public static WebElement passwordTextBox;
    public void enterPassword(String enterPassword){
        passwordTextBox.sendKeys(enterPassword);
    }
    @FindBy(xpath = "//span[@class='login-remember-me-label-text']")
    public static WebElement rememberMeCheckBox;
    public void checkRememberMe(){
        if(!rememberMeCheckBox.isSelected()){
        rememberMeCheckBox.click();}
    }
    @FindBy(linkText = ("Need help?"))
    public static WebElement needHelpLink;
    public void needHelp(){
        needHelpLink.click();
    }
    @FindBy(xpath = "//span[.='Login with Facebook']")
    public static WebElement loginWithFacebookLink;
    public void loginWithFacebook(){
        loginWithFacebookLink.click();
    }
    @FindBy(linkText = "Sign up now")
    public static WebElement signUp;
    public void signUpLink(){
        signUp.click();
    }
    @FindBy(xpath = "//span[.='Gift Card Terms']")
    public static WebElement giftCardTerms;
    public void giftCardTermsLink(){
        giftCardTerms.click();
    }
    @FindBy(xpath = "//span[.='Privacy Statement']")
    public static WebElement privacyStatement;
    public void privacyStatementLink(){
        privacyStatement.click();
    }
    @FindBy(xpath = "//button[.='Sign In']")
    public static WebElement signInButtonSIP;
    public void signInButtonSIPButton(){
        signInButtonSIP.click();
    }
}

