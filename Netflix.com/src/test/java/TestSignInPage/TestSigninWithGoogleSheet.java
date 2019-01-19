package TestSignInPage;
import GoogleSheet.SigninWithGoogleSheet;
import HomePage.HomePage;
import SignInPage.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
public class TestSigninWithGoogleSheet extends SigninWithGoogleSheet {
    SignInPage SignInPage;
    HomePage HomePage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage = PageFactory.initElements(driver, HomePage.class);
        setUrl("http://www.Netflix.com");
        HomePage.clickSignInButton();
    }
        @Test
        public void loginEmailAndPassword() throws IOException, InterruptedException {
            TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            String spreadsheetId = "1h-FtsfIBgUhA8woZUw8DuxY92KQcO_n-vxjPSuugG-s";
            String range = "Sheet1!A2:B2";
            enterUserNameAndPassword(spreadsheetId, range);
        }
    }
