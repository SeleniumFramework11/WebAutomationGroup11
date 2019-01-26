package TestHomePage;

import HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static org.testng.AssertJUnit.assertEquals;

public class TestHomePage extends HomePage {
    HomePage HomePage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage = PageFactory.initElements(driver, HomePage.class);
        setUrl("http://www.Netflix.com"); }
    @Test
    public void testURL() {
        TestLogger.log(getClass().getSimpleName()+ ": "+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String homeUrl = driver.getCurrentUrl();
        assertEquals(homeUrl, "https://www.netflix.com/"); }
    @Test
    public void testTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle();
        assertEquals(title, "Netflix - Watch TV Shows Online, Watch Movies Online"); }
    @Test
    public void testLanguages(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        System.out.println(languageSelector.getTagName());
        System.out.println(languageSelector.getText()); }
    @Test
    public void testSignInLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSignInButton(); }
    @Test
    public void testJoinLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickJoinButton(); }
    @Test
    public void testPriceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickPriceLink(); }
    @Test
    public void testDevicesButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickDevicesLink(); }
    @Test
    public void testGoToFAQLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickFAQLink(); }
    @Test
    public void getTextFAQ(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = faqLink.getText();
        Assert.assertEquals(link, "FAQ"); }
    @Test
    public void testGoToAccountLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickAccountLink(); }
    @Test
    public void getAccountJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = accountLink.getText();
        Assert.assertEquals(link, "Account"); }
    @Test
    public void testGoToInvestorRelationsLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickInvestorRelationsLink(); }
    @Test
    public void getTextInvestor(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = investorRelationsLink.getText();
        Assert.assertEquals(link, "Investor Relations"); }
    @Test
    public void testRedeemGiftCardsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickRedeemGiftCards(); }
    @Test
    public void getTextRedeemGiftJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = redeemGiftCards.getText();
        Assert.assertEquals(link, "Redeem Gift Cards"); }
    @Test
    public void testCorporateInformationLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickCorporateInformation(); }
    @Test
    public void getTextCorporateInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = corporateInformation.getText();
        Assert.assertEquals(link, "Corporate Information"); }
    @Test
    public void testPrivacyLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickPrivacy(); }
    @Test
    public void getTextPrivacy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = privacy.getText();
        Assert.assertEquals(link, "Privacy"); }
    @Test
    public void testWaysToWatchLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickWaysToWatch(); }
    @Test
    public void getTextWaysToWatch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = waysToWatch.getText();
        Assert.assertEquals(link, "Ways To Watch"); }
    @Test
    public void testSpeedTestLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSpeedTest(); }
    @Test
    public void getTextSpeed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = speedTest.getText();
        Assert.assertEquals(link, "Speed Test"); }
    @Test
    public void testNetflixOriginalsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickNetflixOriginals(); }
    @Test
    public void getTextNetflixOriginals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link =netflixOriginalsLink.getText();
        Assert.assertEquals(link, "Netflix Originals"); }
    @Test
    public void testHelpCenterLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickHelpCenter(); }
    @Test
    public void getTextHelpCenter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = helpCenterLink.getText();
        Assert.assertEquals(link, "Help Center"); }
    @Test
    public void testMediaCenterLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickMediaCenter(); }
    @Test
    public void getTextMediaCenter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = mediaCenterLink.getText();
        Assert.assertEquals(link, "Media Center"); }
    @Test
    public void testBuyGiftCardsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickBuyGiftCards(); }
    @Test
    public void getTextBuyGiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = buyGiftCardsLink.getText();
        Assert.assertEquals(link, "Buy Gift Cards"); }
    @Test
    public void testTermsOfUseLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickTermsOfUse(); }
    @Test
    public void getTextTermsOfUse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = termsOfUseLink.getText();
        Assert.assertEquals(link, "Terms of Use"); }
    @Test
    public void testCookiePreferencesLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickCookiePreferences(); }
    @Test
    public void getTextCookiePreferences(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = cookiePreferencesLink.getText();
        Assert.assertEquals(link, "Cookie Preferences"); }
    @Test
    public void testContactUsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickContactUs(); }
    @Test
    public void getTextContactUS(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = contactUsLink.getText();
        Assert.assertEquals(link, "Contact Us"); }
    @Test
    public void testLegalNoticesLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickLegalNoticesLink(); }
    @Test
    public void getTextLegalNotices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = legalNoticesLink.getText();
        Assert.assertEquals(link, "Legal Notices"); }
    @Test
    public void testJobsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickJobs(); }
    @Test
    public void getTextJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String link = jobsLink.getText();
        Assert.assertEquals(link, "Jobs"); }
    @Test
    public void testLanguageSelector(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickLanguageSelector(); }
}
