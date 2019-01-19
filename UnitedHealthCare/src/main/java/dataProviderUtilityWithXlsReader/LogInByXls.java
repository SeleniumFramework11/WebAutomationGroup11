package dataProviderUtilityWithXlsReader;

import base.BaseUtil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInByXls extends BaseUtil {
    @FindBy(how = How.XPATH, using = "//input[@id='hsid-username']")
    public static WebElement logInKey;
    @FindBy(how = How.XPATH, using = "//a[@onclick=\"publishPostPageData('exitLink',{'actions': {'linkName': 'Sign In to myuhc.com - https://www.myuhc.com/member/prewelcome.do'}});\"]")
    public static WebElement logInUHC;
    @FindBy(how = How.CSS, using = "#hsid-username")
    public static WebElement emailAddressOrLogIn;
    @FindBy(how = How.CSS, using = "#hsid-password")
    public static WebElement passwordField;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign in')]")
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
        logInUHC.click();
        emailAddressOrLogIn.sendKeys(email);
        passwordField.sendKeys(password);
        signInSubmitButton.click();
    }

}