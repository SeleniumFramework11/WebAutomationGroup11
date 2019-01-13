package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(id = "gh-btn")
    public static WebElement searchButton;

    @FindBy(linkText = "Electronics")
    public static WebElement findElectronics;

    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    public static WebElement searchPhone;

    @FindBy(linkText = "Deals")
    public static WebElement findDeals;

    @FindBy(linkText = "Books")
    public static WebElement findBooks;

    @FindBy(linkText = "Toys")
    public static WebElement searchToys;


    //@FindBy(xpath = "//div[@class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']")
    //public static WebElement logo;

    public void checksearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchButton.click();
    }

    public void checkfindElectronics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findElectronics.click();
    }

    public void checksearchPhone() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchPhone.click();

    }

    public void checkfindDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findDeals.click();
    }

    public void checkfindBooks() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findBooks.click();
    }

    public void checksearchToys() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchToys.click();

    /*public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }*/

    }

}