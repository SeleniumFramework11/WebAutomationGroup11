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
        act.moveToElement(driver.findElement(By.id("showByDepartmentCaret"))).perform(); //dept
        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[4]/div"))).perform(); //gifts
        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"myRewardsLabel-status\"]/span[2]/span"))).perform(); //sign in
        //driver.findElement(By.xpath("//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[4]/ul/li[1]/a")).click(); //Click the gift guide
    }
    @AfterMethod
    public void aftermethod() {
        driver.close();
    }
}

