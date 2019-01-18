package ReadingFromXlsTest;

import base.BaseUtil;

import excelutility.XlsDataReaderUtil;
import homepage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.util.ArrayList;
import java.util.Iterator;

    public class ReadingTest extends BaseUtil {
    SearchPage objOfSignInPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfSignInPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcelForLogin();
        return testData.iterator();
    }

    @Test(dataProvider = "supplyData")
    public void signIn(String email, String passCode, String message)  {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + passCode);
        TestLogger.log("message: " + message);

        objOfSignInPage.checksearch();
        TestLogger.log("In Sign In Page");
        objOfSignInPage.checksearch();
        TestLogger.log("Test Passed");

    }
}
