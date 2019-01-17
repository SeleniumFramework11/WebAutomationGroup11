/*package ReadingFromXlsTest;

import base.BaseUtil;
import excelsheetreader.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;*/


import java.util.ArrayList;
import java.util.Iterator;

/*public class ReadingTest extends BaseUtil {
    /*SignInPage objOfSignInPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }

    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message)  {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);

        objOfSignInPage.clickSignIn();
        TestLogger.log("In Sign In Page");
        objOfSignInPage.signInUsingDataProvider(email, passCode, message);
        TestLogger.log("Test Passed");

    }
}*/
