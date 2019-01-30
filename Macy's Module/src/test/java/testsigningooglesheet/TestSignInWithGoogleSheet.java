package testsigningooglesheet;

import GoogleSheet.SignInWithGoogleSheet;
import homePage.MainPage;
import homePage.SigninRegs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;

public class TestSignInWithGoogleSheet extends SignInWithGoogleSheet {
    SigninRegs signinReg;
    MainPage HomePage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signinReg = PageFactory.initElements(driver, SigninRegs.class);
        HomePage = PageFactory.initElements(driver, MainPage.class);
        setUrl("http://www.macys.com");
        HomePage.checkSigninmyaccount();
    }
    @Test
    public void loginEmailAndPassword() throws IOException, InterruptedException {
        TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String spreadsheetId = "";
        String range = "";
        enterUserNameAndPassword(spreadsheetId, range);
    }
}
