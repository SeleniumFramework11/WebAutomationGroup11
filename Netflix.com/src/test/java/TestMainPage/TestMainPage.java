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
    public void testTvShowsLink() { clickTvShowsLink(); }
    @Test
    public void testMoviesLink() { clickMoviesLink(); }
    @Test
    public void testRecentlyAddedLink() { clickRecentlyAddedLink(); }
    @Test
    public void testMyListLink() { clickMyListLink(); }
    @Test
    public void testHomeLink() { clickHomeLink(); }
    @Test
    public void testSearch() { clickSearchButton(); }
    //"Search For ITEMS"
    @Test
    public void searchBox() { clickSearchBox("Bird Box"); }
    @Test
    public void testDVDLink() { clickDVDLink(); }
    @Test
    public void testNotificationBell() { clickNotificationBell(); }
    @Test
    public void testNewReleases() { clickNewRelease(); }
    @Test
    public void testNetflixOriginals() { clickNetflixOriginals(); }
    @Test
    public void testCategoriesOddballs() { clickCategoriesOddballs(); }
    @Test
    public void playVideo() throws InterruptedException { clickSearchBox("Bird Box");clickPlayMovie(); }
}
