package testHomePage;
import homePage.HoverOver;
//import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestHoverOver extends HoverOver {
    HoverOver hoverOver;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver = PageFactory.initElements(driver, HoverOver.class);
        setUrl("https://www.ebay.com/");
    }
    @Test(enabled = true, priority = 3)
    public void testmotors () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkmotors();
    }
    @Test(enabled = true, priority = 3)
    public void testFashion () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkFashion();
    }
    @Test(enabled = true, priority = 3)
    public void testElectronics () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkElectronics();
    }
    @Test(enabled = true, priority = 3)
    public void tesToys () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkToys();
    }
    @Test(enabled = true, priority = 3)
    public void testCollectiblesArt () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkCollectiblesArt();
    }
    @Test(enabled = true, priority = 3)
    public void testHomeGarden () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkHomeGarden();
    }
    @Test(enabled = true, priority = 3)
    public void testSportingGoods () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkSportingGoods();
    }
    @Test(enabled = true, priority = 3)
    public void testBusinessIndustrial () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkBusinessIndustrial();
    }
    @Test(enabled = true, priority = 3)
    public void testMusic () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkMusic();
    }
    @Test(enabled = true, priority = 3)
    public void testDeals () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkDeals();
    }

}
