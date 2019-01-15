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
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a")
    public static WebElement findDeals;
    @FindBy(xpath = "//input[@id='gh-ac']")
    public static WebElement findBooks;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/ul[1]/li[9]/a[1]")
    public static WebElement findToys;
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
    @FindBy (xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a")
    public static WebElement findsaved;
    @FindBy (xpath = "//a[@id='gh-as-a']")
    public static WebElement findAdvanced;
    @FindBy (xpath = "//a[@class='gf-bttl thrd'][contains(text(),'Sell')]")
    public static WebElement findsell;
    @FindBy (xpath = "//*[@id=\"gh-shop-ei\"]")
    public static WebElement findOptions;
    @FindBy(xpath = "//a[@class='gh-p'][contains(text(),'Daily Deals')]")
    public static WebElement findDailyDeals;
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/ul[1]/li[3]/a[1]")
    public static WebElement findGiftCards;


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
    public void checkfindToys() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findToys.click();
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
    public void checkfindsaved() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findsaved.click();
    }
    public void checkfindAdvanced() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findAdvanced.click();
    }
    public void checkfindsell() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findsell.click();
    }
    public void checkfindOptions() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findOptions.click();
    }
    public void checkfindDailyDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findDailyDeals.click();
    }
    public void checkfindGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findGiftCards.click();
    }





    /*public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }*/



}