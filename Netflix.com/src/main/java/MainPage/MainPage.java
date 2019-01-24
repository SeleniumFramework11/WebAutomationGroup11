package MainPage;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(xpath = "//a[.='TV Shows']")
    public static WebElement tvShowsLink;
    public void clickTvShowsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tvShowsLink.click();
    }
    @FindBy(xpath = "//a[.='Movies']")
    public static WebElement moviesLink;
    public void clickMoviesLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        moviesLink.click();
    }
    @FindBy(xpath = "//a[.='Recently Added']")
    public static WebElement recentlyAddedLink;
    public void clickRecentlyAddedLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        recentlyAddedLink.click();
    }
    @FindBy(xpath = "//a[.='My List']")
    public static WebElement myListLink;
    public void clickMyListLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        myListLink.click();
    }
    @FindBy(xpath = "//a[.='Home']")
    public static WebElement homeLink;
    public void clickHomeLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeLink.click();
    }
    @FindBy(css = "span.icon-search")
    public static WebElement searchButton;
    public void clickSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchButton.click(); }
    @FindBy(xpath = "//input[@type='text']")
    public static WebElement searchBar;;
    public void clickSearchBox(String Values){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchButton.click();searchBar.sendKeys(Values); }
    @FindBy(linkText = "DVD")
    public static WebElement clickDVD;
    public void clickDVDLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickDVD.click();
    }
    @FindBy(xpath ="//span[@class='icon-button-notification']")
    public static WebElement clickNotification;
    public void clickNotificationBell(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickNotification.click();
    }
    @FindBy(xpath = "//div[.='New Releases']")
    public static WebElement checkNewRelease;
    public void clickNewRelease(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkNewRelease.click();
    }
    @FindBy(xpath = "//div[.='NETFLIX ORIGINALS']")
    public static WebElement checkNetflixOriginals;
    public void clickNetflixOriginals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkNetflixOriginals.click();
    }
    @FindBy(xpath = "//div[.='Oddballs & Outcasts']")
    public static WebElement checkCategoriesOddballs;
    public void clickCategoriesOddballs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkCategoriesOddballs.click();
    }
    @FindBy(xpath = "//div[@class='slider-item slider-item-0']")
    public static WebElement playMovie;
    public void hoverOverMovie(){
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[@class='slider-item slider-item-0']"));
        builder.moveToElement(element).build().perform();
    }
    public void clickPlayMovie() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        hoverOverMovie();
        Thread.sleep(3000);
        playMovie.click();
        Thread.sleep(3000);
    }
}
