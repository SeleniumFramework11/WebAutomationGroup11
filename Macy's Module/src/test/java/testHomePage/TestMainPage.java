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
    }
    @Test                                               // Test Passed
    public void testLogo() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkLogo();
    }
    @Test
    public void testStores() {                          //Test Passed
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkStores();
    }
    @Test
    public void testDeals() {                            // Test Passed
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkDeals();
    }
    @Test
    public void testLists() {                           // Test Passed
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkLists();
    }
    @Test                                               // Test Passed
    public void testGifts() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkGifts();
    }
    @Test                                               // Test Passed
    public void testWeddingregistry() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkweddingregistry();
    }
    @Test                                               // Test Passed
    public void testsigninmyaccount() {
        log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checksigninmyaccount();
    }
}
