package homepage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;



public class WelcomePage extends BaseUtil {

    @FindBy (xpath = "//a[@class='BubbleLink display-inline-block text-center GlobalHeaderBubblesNav-cartBubble']//div[@class='BubbleLink-wrapper']//span[@class='BubbleLink-hoverLabel font-bold']")
    public static WebElement goForGrocery;

    public void checkgoForGrocery() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goForGrocery.click();

    }
}

