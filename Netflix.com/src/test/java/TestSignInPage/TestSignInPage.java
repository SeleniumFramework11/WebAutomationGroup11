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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterEmail("Ilias@yahoo.com"); }
    @Test (priority=2)
        public void testEnterSignInPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterPassword("abc123"); }
    @Test (priority=3)
        public void testRememberMe(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkRememberMe(); }
    @Test (priority = 4)
        public void testNeedHelpLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        needHelp(); }
    @Test (priority = 5)
        public void testLoginWithFacebook(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginWithFacebook();}
    @Test (priority = 6)
        public void testSignUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signUpLink();}
    @Test (priority = 7)
        public void testGiftCardTerms(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCardTermsLink(); }
    @Test (priority = 8)
        public void testTermsOfUseSignInPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage.clickTermsOfUse(); }
    @Test(priority = 9)
        public void testPrivacyStatement(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyStatementLink(); }
    @Test (priority = 10)
    public void testLanguageSignInPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage.clickLanguageSelector(); }
    @Test (priority = 11)
    public void testSignInButtonOnSignInPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterEmail("ilias247mohammed@yahoo.com");
        enterPassword("L@k3r$");
        signInButtonSIPButton();
    }
}