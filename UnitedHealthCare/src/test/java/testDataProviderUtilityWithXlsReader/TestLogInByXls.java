package testDataProviderUtilityWithXlsReader;

import dataProviderUtilityWithXlsReader.LogInByXls;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;

public class TestLogInByXls extends LogInByXls {

    DataReader dtr = new DataReader();
    LogInByXls logInByXls;
    //SignInAndPopUpHandling signInAndPopUpHandling;
    @BeforeMethod
    public void initializePageObject() {
        logInByXls = PageFactory.initElements(driver, LogInByXls.class);
        //signInAndPopUpHandling = PageFactory.initElements(driver, SignInAndPopUpHandling.class);
        setUrl("https://www.uhc.com/");
    }
    @Test(dataProvider = "supplyDataExcel")
    public void loginTestWithDataProvider(String email, String passCode) throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //signInAndPopUpHandling.popUpHandling();
        logInByXls.signInByDataProvider(email,passCode);
        //String actual = homePage.errorMessage.getText();
        //Assert.assertEquals(actual,message);
    }
}