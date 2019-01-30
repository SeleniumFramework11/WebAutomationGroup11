package testHomePage;

import homePage.FindProduct;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestFindProduct extends FindProduct {
                                                      //all 10 search product tests are passed
    FindProduct searchproduct;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchproduct = PageFactory.initElements(driver, FindProduct.class);
    }
    @Test
    public void testsearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchproduct.checksearchBox();
    }
}
