package HomePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class HomePage extends BaseUtil {
    @FindBy(linkText = "Sign In")
    public static WebElement signInButton;
    public void clickSignInButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInButton.click();
    }
    @FindBy(xpath = "//span[.='JOIN FREE FOR A MONTH']")
    public static WebElement joinButton;
    public void clickJoinButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        joinButton.click();
    }
    @FindBy(xpath = "//span[@class='text-full']")
    public static WebElement devicesButton;
    public void clickDevicesLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        devicesButton.click();
        }
    @FindBy(css = "g#icon-price-tag")
    public static WebElement priceButton;
    public void clickPriceLink () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        priceButton.click();
        }
    @FindBy (xpath = "//span[.='FAQ']")
    public static WebElement faqLink;
    public void clickFAQLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        faqLink.click();
            }
    @FindBy (xpath = "//span[.='Account']")
    public static WebElement accountLink;
    public void clickAccountLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        accountLink.click();
    }
    @FindBy (xpath = "//span[.='Investor Relations']")
    public static WebElement investorRelationsLink;
    public void clickInvestorRelationsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        investorRelationsLink.click();
    }
    @FindBy (xpath = "//span[.='Redeem Gift Cards']")
    public static WebElement redeemGiftCards;
    public void clickRedeemGiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        redeemGiftCards.click();
    }
    @FindBy (xpath = "//span[.='Corporate Information']")
    public static WebElement corporateInformation;
    public void clickCorporateInformation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        corporateInformation.click();
    }
    @FindBy (xpath = "//span[.='Ways to Watch']")
    public static WebElement waysToWatch;
    public void clickWaysToWatch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        waysToWatch.click();
    }
    @FindBy (xpath = "//span[.='Privacy']")
    public static WebElement privacy;
    public void clickPrivacy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacy.click();
    }
    @FindBy (xpath = "//span[.='Speed Test']")
    public static WebElement speedTest;
    public void clickSpeedTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        speedTest.click();
    }
    @FindBy (xpath = "//span[.='Netflix Originals']")
    public static WebElement netflixOriginalsLink;
    public void clickNetflixOriginals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        netflixOriginalsLink.click();
    }
    @FindBy (xpath = "//span[.='Help Center']")
    public static WebElement helpCenterLink;
    public void clickHelpCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpCenterLink.click();
    }
    @FindBy (xpath = "//span[.='Media Center']")
    public static WebElement mediaCenterLink;
    public void clickMediaCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mediaCenterLink.click();
        }
    @FindBy (xpath = "//span[.='Jobs']")
    public static WebElement jobsLink;
    public void clickJobs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jobsLink.click();
        }
    @FindBy (xpath = "//span[.='Buy Gift Cards']")
    public static WebElement buyGiftCardsLink;
    public void clickBuyGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        buyGiftCardsLink.click();
    }
    @FindBy (xpath = "//span[.='Terms of Use']")
    public static WebElement termsOfUseLink;
    public void clickTermsOfUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        termsOfUseLink.click();
    }
    @FindBy (xpath = "//span[.='Cookie Preferences']")
    public static WebElement cookiePreferencesLink;
    public void clickCookiePreferences() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cookiePreferencesLink.click();
    }
    @FindBy (xpath = "//span[.='Contact Us']")
    public static WebElement contactUsLink;
    public void clickContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        contactUsLink.click();
    }
    @FindBy (xpath = "//span[.='Legal Notices']")
    public static WebElement legalNoticesLink;
    public void clickLegalNoticesLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        legalNoticesLink.click();
    }
    @FindBy(xpath = "//select[@class='ui-select medium']")
    public  static  WebElement languageSelector;
    public void clickLanguageSelector(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Select chooseLanguage = new Select(languageSelector);
        chooseLanguage.selectByIndex(1);
    }



}
