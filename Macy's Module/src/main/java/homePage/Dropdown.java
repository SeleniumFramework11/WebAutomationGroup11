package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

//all dropdown over 19 tests are passed
public class Dropdown extends BaseUtil {
@FindBy(id = "showByDepartmentCaret")
public static WebElement departmentCaret;
@FindBy(xpath = "//span[contains(text(),'SALE & CLEARANCE')]")
public static WebElement saleClearance;
@FindBy(xpath = "//span[contains(text(),'WOMEN')]")
public static WebElement womenCaret;
@FindBy(xpath = "//a[@href='/shop/mens-clothing?id=1&cm_sp=us_hdr-_-men-_-1_men']//span[contains(text(),'MEN')]")
public static WebElement menCaret;
@FindBy(xpath = "//span[contains(text(),'KIDS & BABY')]")
public static WebElement kidsBabyCaret;
@FindBy(xpath = "//span[contains(text(),'HOME')]")
public static WebElement home;
@FindBy(xpath = "//span[contains(text(),'SHOES')]")
public static WebElement shoes;
@FindBy(xpath = "//span[contains(text(),'HANDBAGS')]")
public static WebElement handBags;
@FindBy(xpath = "//span[contains(text(),'BEAUTY')]")
public static WebElement beauty;
@FindBy(xpath = "//span[contains(text(),'FURNITURE')]")
public static WebElement furniture;
@FindBy(xpath = "//span[contains(text(),'BED & BATH')]")
public static WebElement bedBath;
@FindBy(xpath = "//span[contains(text(),'JEWELRY')]")
public static WebElement jeweLry;
@FindBy(xpath = "//span[contains(text(),'WATCHES')]")
public static WebElement watches;
@FindBy(xpath = "//span[contains(text(),'JUNIORS')]")
public static WebElement juniors;
@FindBy(xpath = "//span[contains(text(),'PLUS & PETITE')]")
public static WebElement plusPetite;
@FindBy(xpath = "//a[@href='/shop/kids-clothes/baby-products?id=187458&cm_sp=us_hdr-_-baby-_-187458_baby']//span[contains(text(),'BABY')]")
public static WebElement baby;
@FindBy(xpath = "//span[contains(text(),'SPORTS FAN SHOP')]")
public static WebElement sportsFanshop;
@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[17]/a[1]/span[1]")
public static WebElement theEdit;
@FindBy(xpath = "//span[contains(text(),'GIFT GUIDE')]")
public static WebElement giftGuide;
@FindBy (id= "giftsLink")
public static WebElement Gifts;

public void checkdepartmentCaret(){
TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
departmentCaret.click();
saleClearance.click();
womenCaret.click();
menCaret.click();
kidsBabyCaret.click();
home.click();
shoes.click();
handBags.click();
beauty.click();
furniture.click();
bedBath.click();
jeweLry.click();
watches.click();
juniors.click();
plusPetite.click();
baby.click();
sportsFanshop.click();
theEdit.click();
giftGuide.click();
}
public void checkGifts(){
TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
Gifts.click();
}
}
