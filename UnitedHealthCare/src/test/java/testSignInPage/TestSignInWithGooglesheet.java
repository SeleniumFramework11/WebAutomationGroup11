package testSignInPage;
import GoogleSheet.SignInWithGoogleSheet;
import homepage.MainPage;
import signIn.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
public class TestSignInWithGooglesheet extends SignInWithGoogleSheet {
    SignInPage SignInPage;
    MainPage welcome;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignInPage = PageFactory.initElements(driver, SignInPage.class);
        welcome = PageFactory.initElements(driver, MainPage.class);
        setUrl("https://www.myuhc.com/member/prewelcome.do?currentLanguageFromPreCheck=en");
        welcome.checksigninUHC();
    }
    @Test
    public void loginEmailAndPassword() throws IOException, InterruptedException {
        TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String spreadsheetId = "1h-FtsfIBgUhA8woZUw8DuxY92KQcO_n-vxjPSuugG-s";
        String range = "Sheet1!A3:B3";
        enterUserNameAndPassword(spreadsheetId, range);
    }
}