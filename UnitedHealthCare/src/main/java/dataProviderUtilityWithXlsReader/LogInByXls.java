package dataProviderUtilityWithXlsReader;

import base.BaseUtil;
import homePage.SignInAndPopUpHandling;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInByXls extends BaseUtil {
    @FindBy(xpath = "//a[text()='Login or Register']")
    public static WebElement logInKey;
    @FindBy(xpath = "//input[@name='loginName']")
    public static WebElement emailAddressOrLogIn;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement passwordField;
    @FindBy(xpath = "//input[@class='btn rounded w100 primary js_loginBtn']")
    public static WebElement signInSubmitButton;

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
    public void signInByDataProvider(String email, String password) throws Exception{
        Thread.sleep(3000);
        logInKey.click();
        emailAddressOrLogIn.sendKeys(email);
        passwordField.sendKeys(password);
        signInSubmitButton.click();
    }

}