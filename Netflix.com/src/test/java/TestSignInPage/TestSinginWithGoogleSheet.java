package TestSignInPage;
import GoogleSheet.SinginWithGoogleSheet;
import base.BaseUtil;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

//import SignInPage.SignInPage;
public class TestSinginWithGoogleSheet extends SinginWithGoogleSheet {
    MainPage mainPage;
    MainPage HomePage;
    private Object MainPage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MainPage = PageFactory.initElements(BaseUtil.driver, MainPage.class);
        HomePage = PageFactory.initElements(BaseUtil.driver, MainPage.class);
        setUrl("http://www.eBay.com");

    }
    @Test
    public void loginEmailAndPassword() throws IOException, InterruptedException {
        TestLogger.log(BaseUtil.convertToString("C: " + getClass().getSimpleName()) + " - M: " + BaseUtil.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String spreadsheetId = "https://docs.google.com/spreadsheets/d/1h-FtsfIBgUhA8woZUw8DuxY92KQcO_n-vxjPSuugG-s/edit#gid=0";
        String range = "abcd1234";
        enterUserNameAndPassword(spreadsheetId, range);
    }
}
