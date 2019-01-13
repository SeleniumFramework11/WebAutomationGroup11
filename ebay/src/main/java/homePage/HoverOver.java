package homePage;
import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;
public class HoverOver extends BaseUtil {
    public void checkFashion() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement Fashion = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/div[2]/ul/li[2]"));
        Thread.sleep(2000);
        builder.moveToElement(Fashion).build().perform();
        Thread.sleep(2000);
        System.out.println(Fashion.getText());
    }

}
