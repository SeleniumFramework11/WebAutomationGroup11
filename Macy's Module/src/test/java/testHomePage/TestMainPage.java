package testHomePage;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static reporting.TestLogger.log;

public class TestMainPage extends MainPage {
    MainPage mainPage;
    @BeforeMethod
    public void initElements() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage = PageFactory.initElements(driver, MainPage.class);
        setUrl("https://www.macys.com/"); }
    @Test
    public void testLogo() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkLogo();   }
    @Test
    public void testStores() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkStores(); }
    @Test
    public void testDeals() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkDeals();  }
    @Test
    public void testLists() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkLists();  }
    @Test
    public void testGifts() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkGifts();  }
    @Test
    public void testWeddingregistry() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkWeddingregistry();  }
    @Test
    public void testSigninmyaccount() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSigninmyaccount();   }
   }