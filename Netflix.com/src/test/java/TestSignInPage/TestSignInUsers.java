package TestSignInPage;
import org.testng.annotations.Test;
public class TestSignInUsers extends TestSignInPage {
    @Test(priority = 1)
    public void testSignInInvalidUser() {
        enterEmail("Ilias@yahoo.com");
        enterPassword("abc123");
        signInButtonSIPButton();
    }
    @Test(priority = 2)
    public void testSignInValidUser() {
        enterEmail("Ilias247mohammed@yahoo.com");
        enterPassword("L@k3r$");
        signInButtonSIPButton();
    }
}
