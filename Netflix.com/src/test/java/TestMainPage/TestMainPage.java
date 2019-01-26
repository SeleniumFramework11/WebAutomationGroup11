package TestMainPage;

import HomePage.HomePage;
import MainPage.MainPage;
import ProfileSelectionPage.ProfileSelectionPage;
import SignInPage.SignInPage;
import TestProfileSelectionPage.TestProfileSelectionPage;
import TestSignInPage.TestSignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static org.testng.AssertJUnit.assertEquals;

public class TestMainPage extends MainPage {
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
        setUrl("http://www.Netflix.com");
        HomePage.clickSignInButton();
        TestSignInPage.testSignInButtonOnSignInPage();
        TestProfileSelectionPage.testSelectProfile();
    }
    @Test
    public void testURL() {
        TestLogger.log(getClass().getSimpleName()+ ": "+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String homeUrl = driver.getCurrentUrl();
        assertEquals(homeUrl, "https://www.netflix.com/browse"); }
    @Test
    public void testTvShowsLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickTvShowsLink(); }
    @Test
    public void testMoviesLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickMoviesLink(); }
    @Test
    public void testRecentlyAddedLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickRecentlyAddedLink(); }
    @Test
    public void testMyListLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickMyListLink(); }
    @Test
    public void testHomeLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickHomeLink(); }
    @Test
    public void testSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSearchButton(); }
    //"Search For ITEMS"
    @Test
    public void searchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSearchBox("Bird Box"); }
    @Test
    public void testDVDLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickDVDLink(); }
    @Test
    public void testNotificationBell() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickNotificationBell(); }
    @Test
    public void testNewReleases() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickNewRelease(); }
    @Test
    public void testNetflixOriginals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickNetflixOriginals(); }
    @Test
    public void testCategoriesOddballs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickCategoriesOddballs(); }
    @Test
    public void playVideo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSearchBox("Bird Box");clickPlayMovie(); }
}
