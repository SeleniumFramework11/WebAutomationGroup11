package testHomePage;

import homePage.SignInPage;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSignInPage extends SignInPage {
    SignInPage signInPage;

    @Test
    public void testsignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInPage.checksignIn();
    }
}
