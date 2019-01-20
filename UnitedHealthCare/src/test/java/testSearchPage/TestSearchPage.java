package testSearchPage;

import SearchDB.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchPage extends SearchPage {
    SearchPage searchPage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        setUrl("https://www.uhc.com/");
    }
    @Test
    public void testsearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchPage.checksearch();
    }
}
