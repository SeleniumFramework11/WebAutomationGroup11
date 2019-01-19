package homePage;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(id = "Layer_1")
    public static WebElement logo;
    @FindBy (xpath ="//a[@title='STORES']")
    public static WebElement stores;
    @FindBy(xpath ="//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[2]/a")
    public static WebElement deals;
    @FindBy(xpath ="//*[@id=\"header-wishlist-label\"]/a")
    public static WebElement lists;
    @FindBy (id= "giftsLink")
    public static WebElement gifts;
    @FindBy(xpath ="//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[5]/a")
    public static WebElement weddingregistry;
    @FindBy (xpath ="//*[@id='myRewardsLabel-status']/span[1]")
    public static WebElement signinmyaccount;

    public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();    }
    public void checkStores(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        stores.click();  }
    public void checkDeals(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        deals.click();   }
    public void checkLists(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lists.click();   }
    public void checkGifts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        gifts.click();   }
    public void checkWeddingregistry(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        weddingregistry.click();   }
    public void checkSigninmyaccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinmyaccount.click();   }
        }