package testHomePage;

import homePage.Hoverover;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHoverover extends Hoverover {
    Hoverover hoverover;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hoverover = PageFactory.initElements(driver, Hoverover.class);

    }
    @Test
    public void testhoverover() {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/span[1]"))).perform();
        driver.findElement(By.xpath("//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[4]/ul/li[1]/a")).click();
    }
    @AfterMethod
    public void aftermethod() {
        driver.close();
    }
}

