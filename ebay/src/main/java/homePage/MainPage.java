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

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a")
    public static WebElement findmusic;

    @FindBy(xpath = "//input[@id='gh-ac']")
    public static WebElement searchapple;

    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    public static WebElement searchiphonex;

    @FindBy(id = "gh-logo")
    public static WebElement findLogo;

    @FindBy (linkText = "Sign in")
    public static WebElement signIn;

    @FindBy (name = "userid")
    public static WebElement userID;

    @FindBy(name = "pass")
    public static WebElement passWord;

    @FindBy (id = "sgnBt")
    public static WebElement signinButton;

    @FindBy (id = "gh-ac")
    public static WebElement findiphonexsmax;



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
    }
    public void checkfindmusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findmusic.click();
    }
    public void checksearchapple() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchapple.click();
    }
    public void checksearchiphonex() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchiphonex.click();
    }
    public void checkfindLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findLogo.click();
    }
    public void checksignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.click();
        userID.sendKeys("alrafifahad96@gmail.com");
        passWord.sendKeys("Rafi1122");
        signinButton.click();
    }
    public void checkfindiphonexsmax() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findiphonexsmax.click();
    }





    /*public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }*/



}