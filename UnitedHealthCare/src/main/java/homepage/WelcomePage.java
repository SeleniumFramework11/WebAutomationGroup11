package homepage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class WelcomePage extends BaseUtil {

    @FindBy (xpath = "//img[@class='uhc-logo desktop-logo']")
    public static WebElement seeLogo;

    @FindBy (xpath = "//a[@id='menu-icon']")
    public static WebElement menubutton;

    @FindBy (xpath = "//div[@class='menu-right']//div[@class='content']//input[@id='edit-mergevars-name']")
    public static WebElement searchName;

    @FindBy (xpath = "//input[@class='search-button']")
    public static WebElement buttonSearch;

    @FindBy (xpath = "//label[@class='btn-search lbl']")
    public static WebElement searchText;

    @FindBy (id = "q")
    public static WebElement keySearch;

    @FindBy (xpath = "//a[@class='top-menu1']")
    public static WebElement homeButton;

    @FindBy (xpath = "//div[@class='custom-25-75']//a[@href='/individual-and-family']")
    public static WebElement indiviualandFamilies;

    @FindBy (xpath = "//a[@class='top-menu3']")
    public static WebElement employerMenu;

    @FindBy (xpath = "//div[@class='footer-menu-list ']//a[@href='/employer']")
    public static WebElement medicareMenu;

    @FindBy (xpath = "//div[@class='footer-menu-list inactive']//a[@href='/find-a-physician']")
    public static WebElement findaDoctor;

    @FindBy (css = "#home-banner-top > div > div > div > div > div > div > div > div > div > div > div > img")
    public static WebElement imageHealth;

    @FindBy (xpath = "//button[@id='loginmenubutton']")
    public static WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"loginmenu\"]/li[1]/a")
    public static  WebElement signinUHC;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]/span[1]")
    public static WebElement nearbyClinic;

    @FindBy (xpath = "//span[@class='button-primary-common button-digital-blue'][contains(text(),'Learn More')]")
    public static WebElement learnMore;

    @FindBy (xpath = "//span[@class='button-primary-common button-digital-blue at-element-click-tracking']")
    public static WebElement learnmoreBusiness;

    @FindBy (xpath = "//a[contains(text(),'individuals')]")
    public static WebElement individualPlans;

    @FindBy (xpath = "//a[contains(text(),'employers')]")
    public static WebElement employerPlans;

    @FindBy (xpath = "//a[@href='/medicare'][contains(text(),'Learn more')]")
    public static WebElement learnmoreMedicare;

    @FindBy (xpath = "//a[@aria-label='View plans on UHOne.com (opens in a new window)']")
    public static WebElement viewindividualAndFamily;

    @FindBy (xpath = "//input[@id='zipCode']")
    public static WebElement zipCode;





    public void checkseeLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeLogo.click();

    }
    public void checkmenubutton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        menubutton.click();
    }

    public void checksearchName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchName.click();

    }
    public void checkbuttonSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buttonSearch.click();
}
    public void checksearchText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchText.click();

    }
    public void checkkeySearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        keySearch.click();

    }
    public void checkhomeButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeButton.click();

    }
    public void checkindividualandFamilies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        indiviualandFamilies.click();

    }
    public void checkemployerMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        employerMenu.click();

    }
    public void checkmedicareMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicareMenu.click();

    }
    public void checkfindaDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findaDoctor.click();

    }
    public void checkimageHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        imageHealth.click();

    }
    public void checkloginButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loginButton.click();

    }
    public void checksigninUHC() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinUHC.click();

    }
    public void checknearbyClinic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nearbyClinic.click();

    }
    public void checklearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMore.click();

    }
    public void checklearnmoreBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnmoreBusiness.click();

    }
    public void checkindividualPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        individualPlans.click();

    }
    public void checkemployerPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        employerPlans.click();

    }
    public void checklearnmoreMedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnmoreMedicare.click();

    }
    public void checkviewindividualAndFamily() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewindividualAndFamily.click();

    }
    public void checkzipCode() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        zipCode.sendKeys("11101, Keys.ENTER");

    }












}
