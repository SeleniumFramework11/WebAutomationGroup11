package TestSignInPage;

import HomePage.HomePage;
import SignInPage.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSignInPage extends SignInPage{
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
    @Test (priority=1)
        public void testEnterEmailAddress(){
        enterEmail("Ilias@yahoo.com");
    }
    @Test (priority=2)
        public void testEnterSignInPassword(){ enterPassword("abc123"); }
    @Test (priority=3)
        public void testRememberMe(){
        checkRememberMe();
    }
    @Test (priority = 4)
        public void testNeedHelpLink(){ needHelp(); }
    @Test (priority = 5)
        public void testLoginWithFacebook(){loginWithFacebook();}
    @Test (priority = 6)
        public void testSignUp(){signUpLink();}
    @Test (priority = 7)
        public void testGiftCardTerms(){ giftCardTermsLink(); }
    @Test (priority = 8)
        public void testTermsOfUseSignInPage() { HomePage.clickTermsOfUse(); }
    @Test(priority = 9)
        public void testPrivacyStatement(){ privacyStatementLink(); }
    @Test (priority = 10)
    public void testLanguageSignInPage() { HomePage.clickLanguageSelector(); }
    @Test (priority = 11)
    public void testSignInButtonOnSignInPage() {
        enterEmail("ilias247mohammed@yahoo.com");
        enterPassword("L@k3r$");
        signInButtonSIPButton();
    }
}