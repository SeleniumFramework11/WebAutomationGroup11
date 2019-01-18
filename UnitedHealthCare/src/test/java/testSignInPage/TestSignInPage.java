package testSignInPage;
import homepage.MainPage;
import signIn.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestSignInPage extends SignInPage{
    SignInPage sign;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sign = PageFactory.initElements(driver, SignInPage.class);
        setUrl("https://www.myuhc.com/member/prewelcome.do?currentLanguageFromPreCheck=en");

    }
    @Test
    public void testUserName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sign.checkUserName();
    }
    @Test
    public void testPassWord() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sign.checkPassWord();
    }
    @Test
    public void testRememberMe() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sign.checkRememberMe();
    }
    @Test
    public void testSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sign.checkSignIn();
    }
    @Test
    public void testsignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sign.checksignIn();
    }
}
