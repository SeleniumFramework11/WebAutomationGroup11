package testingpage;

import homepage.WelcomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends WelcomePage {
    WelcomePage mainPage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage = PageFactory.initElements(driver, WelcomePage.class);
        setUrl("http://www.walmart.com");
    }

    @Test
    public void testgoForGrocery() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkgoForGrocery();
    }








}
