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
    @FindBy(xpath = "//a[@class='gh-p'][contains(text(),'Help & Contact')]")
    public static WebElement findHelpandcontact;
    @FindBy(xpath = "//a[@class='gh-p'][contains(text(),'Sell')]")
    public static WebElement findSell;
    @FindBy(xpath = "//a[@class='gh-eb-li-a'][contains(text(),'My eBay')]")
    public static WebElement findMyeBay;
    @FindBy(xpath = "//a[@class='thrd gf-bar-a'][contains(text(),'About eBay')]")
    public static WebElement clickAbouteBay;
    @FindBy(name = "//a[@class='thrd gf-bar-a'][contains(text(),'Announcements')]")
    public static WebElement findAnnouncements;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/h1[1]/span[1]")
    public static WebElement searchWomensclothing;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[5]/a")
    public static WebElement searchWomensDreeses;
    @FindBy(xpath = "//span[@class='b-pageheader__text']")
    public static WebElement searchMensShoes;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[4]/a")
    public static WebElement searchMensBoots;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[5]/a")
    public static WebElement searchMensCasualShoes;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/h1[1]/span[1]")
    public static WebElement searchAdidasShoes;
    @FindBy(xpath = "//p[contains(text(),'adidas NMD')]")
    public static WebElement findAdidasNMD;
    @FindBy(xpath = "//span[contains(text(),'8.5')]")
    public static WebElement findSize;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/li[2]/div[1]/h3[1]")
    public static WebElement findColor;


    public void clickOnSignInButton(){signIn.click();}
    public void clickOnLogInButton(){signinButton.click();}

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
    public void checkfindHelpandcontact() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findHelpandcontact.click();
    }
    public void checkfindSell() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findSell.click();
    }
    public void checkfindMyeBay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findMyeBay.click();
    }
    public void checksearchWomensclothing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchWomensclothing.click();
    }
    public void checksearchWomensDreeses() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchWomensDreeses.click();
    }
    public void checksearchMensShoes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchMensShoes.click();
    }
    public void checksearchMensBoots() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchMensBoots.click();
    }
    public void checksearchMensCasualShoes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchMensCasualShoes.click();
    }
    public void checksearchAdidasShoes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchAdidasShoes.click();
    }
    public void checkfindAdidasNMD() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findAdidasNMD.click();
    }
    public void checkfindSize() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findSize.click();
    }
    public void checkfindColor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findColor.click();
    }











    /*public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }*/



}