package TestProfileSelectionPage;

import HomePage.HomePage;
import ProfileSelectionPage.ProfileSelectionPage;
import SignInPage.SignInPage;
import TestSignInPage.TestSignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestProfileSelectionPage extends ProfileSelectionPage {
    SignInPage SignInPage;
    HomePage HomePage;
    TestSignInPage TestSignInPage;
    ProfileSelectionPage ProfileSelectionPage;

    @BeforeMethod
        public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage = PageFactory.initElements(driver, HomePage.class);
        TestSignInPage = PageFactory.initElements(driver, TestSignInPage.class);
        ProfileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        setUrl("http://www.Netflix.com");
        HomePage.clickSignInButton();
        TestSignInPage.testSignInButtonOnSignInPage();

    }

    @Test (priority = 1)
        public void testAddProfile(){
            clickAddProfile();
    }
    @Test (priority = 3)
        public void testSelectProfile(){
            clickSelectProfile();
    }
    @Test (priority = 2)
        public void testManageProfiles(){clickManagedProfile();}
}
