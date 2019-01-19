package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninRegs extends BaseUtil {

    @FindBy(xpath = "//*[@id=\"myRewardsLabel-status\"]/span[1]")
    //@FindBy(linkText = "Sign In")
    public static WebElement signinRegister;

    @FindBy(id = "standard-sign-up")
    public static WebElement createaccountButton;

    @FindBy(id = "ca-profile-firstname")
    public static WebElement enterfirstName;

    @FindBy(id = "ca-profile-lastname")
    public static WebElement enterlastName;

    @FindBy(id = "ca-profile-email")
    public static WebElement registerEmail;

    @FindBy(id = "ca-profile-password")
    public static WebElement logonPassword;

    @FindBy(id = "ca-profile-birth-month")
    public static WebElement birthMonth;

    @FindBy(id = "ca-profile-birth-day")
    public static WebElement birthDay;

    @FindBy(id = "ca-profile-submit")
    public static WebElement createaccountSubmit;

        public void checksigninRegister() {
        signinRegister.click();
        createaccountButton.click();
        enterfirstName.sendKeys("Abdur");
        enterlastName.sendKeys("Rahman");
        registerEmail.sendKeys("abc123@gmail.com");
        logonPassword.sendKeys("abcde123");
        birthMonth.sendKeys("December");
        birthDay.sendKeys("01");
        createaccountSubmit.click();
    }
}

