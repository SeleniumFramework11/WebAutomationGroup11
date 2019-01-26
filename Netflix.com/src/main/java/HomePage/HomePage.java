package HomePage;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class HomePage extends BaseUtil {
    @FindBy(linkText = "Sign In")
    public static WebElement signInButton;
    public void clickSignInButton(){ signInButton.click();
    }
    @FindBy(xpath = "//span[.='JOIN FREE FOR A MONTH']")
    public static WebElement joinButton;
    public void clickJoinButton(){ joinButton.click();
    }
    @FindBy(xpath = "//span[@class='text-full']")
    public static WebElement devicesButton;
    public void clickDevicesLink(){ devicesButton.click();
    }
    @FindBy(css = "g#icon-price-tag")
    public static WebElement priceButton;
    public void clickPriceLink (){ priceButton.click();
    }
    @FindBy (xpath = "//span[.='FAQ']")
    public static WebElement faqLink;
    public void clickFAQLink(){ faqLink.click();
    }
    @FindBy (xpath = "//span[.='Account']")
    public static WebElement accountLink;
    public void clickAccountLink(){ accountLink.click();
    }
    @FindBy (xpath = "//span[.='Investor Relations']")
    public static WebElement investorRelationsLink;
    public void clickInvestorRelationsLink(){ investorRelationsLink.click();
    }
    @FindBy (xpath = "//span[.='Redeem Gift Cards']")
    public static WebElement redeemGiftCards;
    public void clickRedeemGiftCards(){ redeemGiftCards.click();
    }
    @FindBy (xpath = "//span[.='Corporate Information']")
    public static WebElement corporateInformation;
    public void clickCorporateInformation() { corporateInformation.click();
    }
    @FindBy (xpath = "//span[.='Ways to Watch']")
    public static WebElement waysToWatch;
    public void clickWaysToWatch(){ waysToWatch.click();
    }
    @FindBy (xpath = "//span[.='Privacy']")
    public static WebElement privacy;
    public void clickPrivacy(){ privacy.click();
    }
    @FindBy (xpath = "//span[.='Speed Test']")
    public static WebElement speedTest;
    public void clickSpeedTest() {speedTest.click();
    }
    @FindBy (xpath = "//span[.='Netflix Originals']")
    public static WebElement netflixOriginalsLink;
    public void clickNetflixOriginals(){ netflixOriginalsLink.click();
    }
    @FindBy (xpath = "//span[.='Help Center']")
    public static WebElement helpCenterLink;
    public void clickHelpCenter(){ helpCenterLink.click();
    }
    @FindBy (xpath = "//span[.='Media Center']")
    public static WebElement mediaCenterLink;
    public void clickMediaCenter(){ mediaCenterLink.click();
    }
    @FindBy (xpath = "//span[.='Jobs']")
    public static WebElement jobsLink;
    public void clickJobs(){ jobsLink.click();
    }
    @FindBy (xpath = "//span[.='Buy Gift Cards']")
    public static WebElement buyGiftCardsLink;
    public void clickBuyGiftCards(){ buyGiftCardsLink.click();
    }
    @FindBy (xpath = "//span[.='Terms of Use']")
    public static WebElement termsOfUseLink;
    public void clickTermsOfUse(){ termsOfUseLink.click();
    }
    @FindBy (xpath = "//span[.='Cookie Preferences']")
    public static WebElement cookiePreferencesLink;
    public void clickCookiePreferences(){ cookiePreferencesLink.click();
    }
    @FindBy (xpath = "//span[.='Contact Us']")
    public static WebElement contactUsLink;
    public void clickContactUs(){ contactUsLink.click();
    }
    @FindBy (xpath = "//span[.='Legal Notices']")
    public static WebElement legalNoticesLink;
    public void clickLegalNoticesLink(){ legalNoticesLink.click();
    }
    @FindBy(xpath = "//select[@class='ui-select medium']")
    public  static  WebElement languageSelector;
    public void clickLanguageSelector(){
        Select chooseLanguage = new Select(languageSelector);
        chooseLanguage.selectByIndex(1);
    }
}
