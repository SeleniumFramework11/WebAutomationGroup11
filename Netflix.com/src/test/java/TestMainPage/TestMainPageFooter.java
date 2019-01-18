package TestMainPage;

import HomePage.HomePage;
import MainPage.MainPage;
import MainPage.MainPageFooter;
import ProfileSelectionPage.ProfileSelectionPage;
import SignInPage.SignInPage;
import TestProfileSelectionPage.TestProfileSelectionPage;
import TestSignInPage.TestSignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPageFooter extends MainPageFooter {
    SignInPage SignInPage;
    HomePage HomePage;
    MainPage MainPage;
    TestSignInPage TestSignInPage;
    ProfileSelectionPage ProfileSelectionPage;
    TestProfileSelectionPage TestProfileSelectionPage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage = PageFactory.initElements(driver, HomePage.class);
        MainPage = PageFactory.initElements(driver, MainPage.class);
        TestSignInPage = PageFactory.initElements(driver, TestSignInPage.class);
        ProfileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        TestProfileSelectionPage = PageFactory.initElements(driver, TestProfileSelectionPage.class);
        setUrl("https://www.netflix.com/browse");
        HomePage.clickSignInButton();
        TestSignInPage.testSignInButtonOnSignInPage();
        TestProfileSelectionPage.testSelectProfile();
    }
    @Test
    public void testAudioAndSubtitles(){
    clickAudioAndSubtitles();
}
    @Test
    public void testLegalNoticesMP(){ HomePage.clickLegalNoticesLink(); }
    @Test
    public void testJobsMP(){ HomePage.clickJobs(); }
    @Test
    public void testHelpCentersMP(){ HomePage.clickHelpCenter(); }
    @Test
    public void testMediaCentersMP(){ HomePage.clickMediaCenter(); }
    @Test
    public void testPrivacyMP(){ HomePage.clickPrivacy(); }
    @Test
    public void testCookiesMP(){ HomePage.clickCookiePreferences(); }
    @Test
    public void testContactUsMP(){ HomePage.clickContactUs(); }
    @Test
    public void testInvestorRelationsMP(){ HomePage.clickInvestorRelationsLink(); }
    @Test
    public void testTermsOfUseMP(){ HomePage.clickTermsOfUse(); }
    @Test
    public void testCorporateInfoMP(){ HomePage.clickCorporateInformation(); }
}
