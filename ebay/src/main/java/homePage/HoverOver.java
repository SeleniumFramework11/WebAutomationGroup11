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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement Fashion = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/div[2]/ul/li[2]"));
        Thread.sleep(2000);
        builder.moveToElement(Fashion).build().perform();
        Thread.sleep(2000);
        System.out.println(Fashion.getText());
    }

    public void checkmotors() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement motors = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/div[2]/ul/li[2]"));
        Thread.sleep(2000);
        builder.moveToElement(motors).build().perform();
        Thread.sleep(2000);
        System.out.println(motors.getText());
    }

    public void checkElectronics() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement Electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
        Thread.sleep(2000);
        builder.moveToElement(Electronics).build().perform();
        Thread.sleep(2000);
        System.out.println(Electronics.getText());
    }

    public void checkToys() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement Toys = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
        Thread.sleep(2000);
        builder.moveToElement(Toys).build().perform();
        Thread.sleep(2000);
        System.out.println(Toys.getText());
    }

    public void checkCollectiblesArt() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement CollectiblesArt = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
        Thread.sleep(2000);
        builder.moveToElement(CollectiblesArt).build().perform();
        Thread.sleep(2000);
        System.out.println(CollectiblesArt.getText());
    }

    public void checkHomeGarden() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement HomeGarden = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"));
        Thread.sleep(2000);
        builder.moveToElement(HomeGarden).build().perform();
        Thread.sleep(2000);
        System.out.println(HomeGarden.getText());
    }

    public void checkSportingGoods() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement SportingGoods = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a"));
        Thread.sleep(2000);
        builder.moveToElement(SportingGoods).build().perform();
        Thread.sleep(2000);
        System.out.println(SportingGoods.getText());
    }

    public void checkBusinessIndustrial() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement BusinessIndustrial = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a"));
        Thread.sleep(2000);
        builder.moveToElement(BusinessIndustrial).build().perform();
        Thread.sleep(2000);
        System.out.println(BusinessIndustrial.getText());
    }

    public void checkMusic() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement Music = driver.findElement(By.xpath("/html[1]/body[1]/header[1]"));
        Thread.sleep(2000);
        builder.moveToElement(Music).build().perform();
        Thread.sleep(2000);
        System.out.println(Music.getText());
    }















}


