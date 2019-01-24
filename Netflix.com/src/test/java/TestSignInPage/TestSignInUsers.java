package TestSignInPage;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSignInUsers extends TestSignInPage {
    @Test(priority = 1)
    public void testSignInInvalidUser(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterEmail("Ilias@yahoo.com");
        enterPassword("abc123");
        signInButtonSIPButton(); }
    @Test(priority = 2)
    public void testSignInValidUser(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterEmail("Ilias247mohammed@yahoo.com");
        enterPassword("L@k3r$");
        signInButtonSIPButton(); }
}
