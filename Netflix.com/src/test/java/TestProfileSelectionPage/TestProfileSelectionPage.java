package TestProfileSelectionPage;
import HomePage.HomePage;
import ProfileSelectionPage.ProfileSelectionPage;
import SignInPage.SignInPage;
import TestSignInPage.TestSignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static org.testng.AssertJUnit.assertEquals;

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
        TestSignInPage.testSignInButtonOnSignInPage(); }
    @Test
    public void testURL() {
        TestLogger.log(getClass().getSimpleName()+ ": "+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String homeUrl = driver.getCurrentUrl();
        assertEquals(homeUrl, "https://www.netflix.com/browse"); }
    @Test (priority = 1)
        public void testAddProfile(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickAddProfile(); }
    @Test (priority = 3)
        public void testSelectProfile(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSelectProfile(); }
    @Test (priority = 2)
        public void testManageProfiles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickManagedProfile();}
}
