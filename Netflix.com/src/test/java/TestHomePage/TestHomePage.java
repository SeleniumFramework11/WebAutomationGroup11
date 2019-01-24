package TestHomePage;

import HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
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
    @Test (priority=1)
    public void testSignInLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSignInButton(); }
    @Test (priority=2)
    public void testJoinLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickJoinButton(); }
    @Test (priority=3)
    public void testPriceButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickPriceLink(); }
    @Test (priority=4)
    public void testDevicesButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickDevicesLink(); }
    @Test (priority=5)
    public void testGoToFAQLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickFAQLink(); }
    @Test (priority=6)
    public void testGoToAccountLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickAccountLink(); }
    @Test (priority=7)
    public void testGoToInvestorRelationsLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickInvestorRelationsLink(); }
    @Test (priority=8)
    public void testRedeemGiftCardsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickRedeemGiftCards(); }
    @Test (priority=9)
    public void testCorporateInformationLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickCorporateInformation(); }
    @Test (priority=10)
    public void testPrivacyLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickPrivacy(); }
    @Test (priority=11)
    public void testWaysToWatchLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickWaysToWatch(); }
    @Test (priority=12)
    public void testSpeedTestLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSpeedTest(); }
    @Test (priority=13)
    public void testNetflixOriginalsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickNetflixOriginals(); }
    @Test (priority=14)
    public void testHelpCenterLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickHelpCenter(); }
    @Test (priority=15)
    public void testMediaCenterLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickMediaCenter(); }
    @Test (priority=16)
    public void testBuyGiftCardsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickBuyGiftCards(); }
    @Test (priority=17)
    public void testTermsOfUseLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickTermsOfUse(); }
    @Test (priority=18)
    public void testCookiePreferencesLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickCookiePreferences(); }
    @Test (priority=19)
    public void testContactUsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickContactUs(); }
    @Test (priority=20)
    public void testLegalNoticesLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickLegalNoticesLink(); }
    @Test (priority=21)
    public void testJobsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickJobs(); }
    @Test (priority=22)
    public void testLanguageSelector(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickLanguageSelector(); }
}
