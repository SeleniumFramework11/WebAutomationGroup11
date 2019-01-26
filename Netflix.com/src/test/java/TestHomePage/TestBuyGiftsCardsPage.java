package TestHomePage;

import HomePage.BuyGiftCardsPage;
import HomePage.JobsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBuyGiftsCardsPage extends BuyGiftCardsPage {
    HomePage.JobsPage JobsPage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        JobsPage = PageFactory.initElements(driver, JobsPage.class);
        setUrl("https://www.netflix.com/gift-cards");
    }
    @Test
    public void testBuyGCFromAmazon(){
        clickBuyGCFromAmazon();
    }

}
