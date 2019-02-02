package homepage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {

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

    @FindBy (xpath = "//a[@class='top-menu6']")
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

    @FindBy (xpath = "//a[@aria-label='Learn More about Dental Plans']")
    public static WebElement learnDental;

    @FindBy (xpath = "//a[@href='https://www.uhone.com/shop/#/census?LeadSourceName=UHC-Website-Dental']")
    public static WebElement viewDental;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]")
    public static WebElement learnHeathInsurance;

    @FindBy (xpath = "//a[@href='https://www.uhone.com/shop/#?LeadSourceName=UHC-Website-STM']")
    public static WebElement viewHealthInsurance;

    @FindBy (xpath = "//a[@href='https://uhccommunityplan.com']")
    public static WebElement learnMedicaidPlans;

    @FindBy (xpath = "//a[contains(text(),'Hospital and Doctor Insurance')]")
    public static WebElement hospitalAndDoctorInsurance;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[1]")
    public static WebElement visionInsurance;

    @FindBy (xpath = "//a[contains(text(),'Term Life Insurance')]")
    public static WebElement termLifeInsurance;

    @FindBy (xpath = "//span[contains(text(),'Critical Illness Insurance')]")
    public static WebElement illnessInsurance;

    @FindBy (xpath = "//a[contains(text(),'Accident Insurance')]")
    public static WebElement accidentInsurance;

    @FindBy (xpath = "//a[contains(text(),'Hospitalization Insurance')]")
    public static WebElement hospitalInsurance;

    @FindBy (xpath = "//a[contains(text(),'Supplemental Insurance')]")
    public static WebElement supplementInsurance;

    @FindBy (xpath = "//a[@href='https://www.uhcglobal.com/']")
    public static WebElement globalInsurance;

    @FindBy (xpath = "//a[contains(text(),'Global Travel Insurance')]")
    public static WebElement travelInsurance;

    @FindBy (xpath = "//span[contains(text(),'Access the Provider Portal')]")
    public static WebElement providerPortal;

    @FindBy (xpath = "//a[contains(text(),'View Broker Resources')]")
    public static WebElement brokerResources;

    @FindBy (xpath = "//a[contains(text(),'Marketplace Insurance Plans')]")
    public static WebElement marketplaceInsurance;

    @FindBy (xpath = "//a[@href='https://www.aarpmedicareplans.com/?WT.mc_id=880332']")
    public static WebElement medicareLink;

    @FindBy (xpath = "//a[contains(text(),'Medicaid')]")
    public static WebElement medicaidProduct;

    @FindBy (xpath = "//a[contains(text(),'Employer Group Plans')]")
    public static WebElement employerGroup;

    @FindBy (xpath = "//a[contains(text(),'Dental Insurance')]")
    public static WebElement dentalInsurance;

    @FindBy (xpath = "//a[@href='/content/uhcdotcom/en/home/individual-and-family/insurance-plans/vision']")
    public static WebElement visionProduct;

    @FindBy (xpath = "//a[contains(text(),'Short Term Health Insurance')]")
    public static WebElement shorttermHealth;

    @FindBy (xpath = "//a[contains(text(),'Fitness')]")
    public static WebElement fitnessLiving;

    @FindBy(xpath = "//a[contains(text(),'Nutrition')]")
    public static WebElement nutritionLiving;

    @FindBy (xpath = "//a[contains(text(),'Health Topics')]")
    public static WebElement healthTopics;

    @FindBy (xpath = "//a[contains(text(),'Take Control of Your Care')]")
    public static WebElement careControl;

    @FindBy (xpath = "//a[contains(text(),'Health and Wellness')]")
    public static WebElement healthWellness;

    @FindBy (xpath = "//a[contains(text(),'Programs & Tools')]")
    public static WebElement programandTools;

    @FindBy (xpath = "//a[contains(text(),'Open Enrollment')]")
    public static WebElement openEnrollment;

    @FindBy (xpath = "//a[contains(text(),'Member Resources')]")
    public static WebElement memberResource;

    @FindBy (linkText = "About Us")
    public static WebElement aboutUs;

    @FindBy (linkText = "United For Reform")
    public static WebElement unitedReform;

    @FindBy (linkText = "Value-Based Care")
    public static WebElement valuebasedCare;

    @FindBy (linkText = "View Drug List")
    public static WebElement viewdrugList;

    @FindBy (linkText = "Download Health4Me App")
    public static WebElement downloadApp;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[4]")
    public static WebElement brokerLink;

    @FindBy (linkText = "Just Plain Clear® Glossary")
    public static WebElement plainGlossary;

    @FindBy (linkText = "Language Assistance/ Nondiscrimination Notice")
    public static WebElement languageNotice;

    @FindBy (linkText = "Find a Doctor")
    public static WebElement findanyDoctor;

    @FindBy (xpath = "//a[contains(text(),'Print ID Card')]")
    public static WebElement printidCard;

    @FindBy (xpath = "//a[contains(text(),'View Claim/Account')]")
    public static WebElement viewclaimAccount;

    @FindBy (xpath = "//a[contains(text(),'Check Benefits')]")
    public static WebElement checkBenefits;

    @FindBy (xpath = "//a[@title='Newsroom']")
    public static WebElement newsRoom;

    @FindBy (xpath = "//a[@title='Contact Us']")
    public static WebElement contactUs;

    @FindBy (xpath = "//a[@title='Careers']")
    public static WebElement career;

    @FindBy (xpath = "//a[@title='Health Care Fraud']")
    public static WebElement healthcareFraud;

    @FindBy (xpath = "//a[@title='Legal']")
    public static WebElement legalIssue;

    @FindBy (xpath = "//a[@title='Privacy']")
    public static WebElement privacy;

    @FindBy (xpath = "//a[@title='Terms of Use']")
    public static WebElement termsofUse;

    @FindBy (xpath = "//a[@title='Accessibility']")
    public static WebElement accessibility;

    @FindBy (xpath = "//a[@class='english-link lang-toggle']")
    public static WebElement spanishlanguage;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/header[1]/div[3]/a[1]/font[1]/font[1]")
    public static WebElement englishLanguage;

    @FindBy (id = "loginmenubutton")
    public static WebElement trytoSignIn;

    @FindBy (css = "body.lang-en div.viewport-wrapper:nth-child(7) div.uhc-wrapper:nth-child(2) div.header:nth-child(1)")
    public static WebElement UHCsignin;

    @FindBy (xpath = "//*[@id=\"hsid-username\"]")
    public static WebElement userName;

    @FindBy (xpath = "//*[@id=\"hsid-password\"]")
    public static WebElement passWord;

    @FindBy (name = "rememberMe")
    public static WebElement rememberMe;


    public void checkSeeLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeLogo.click();
    }
    public void checkMenubutton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        menubutton.click();
    }

    public void checkSearchName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchName.click();
    }
    public void checkButtonSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buttonSearch.click();
}
    public void checkSearchText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchText.click();
    }
    public void checkKeySearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        keySearch.click();
    }
    public void checkHomeButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeButton.click();
    }
    public void checkIndividualandFamilies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        indiviualandFamilies.click();
    }
    public void checkEmployerMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        employerMenu.click();
    }
    public void checkMedicareMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicareMenu.click();
    }
    public void checkFindaDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findaDoctor.click();
    }
    public void checkImageHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        imageHealth.click();
    }
    public void checkLoginButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loginButton.click();
    }
    public void checkSigninUHC() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinUHC.click();
    }
    public void checkNearbyClinic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nearbyClinic.click();
    }
    public void checkLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMore.click();
    }
    public void checkLearnmoreBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnmoreBusiness.click();
    }
    public void checkIndividualPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        individualPlans.click();
    }
    public void checkEmployerPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        employerPlans.click();
    }
    public void checkLearnmoreMedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnmoreMedicare.click();
    }
    public void checkViewindividualAndFamily() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewindividualAndFamily.click();
    }
    public void checkLearnDental() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnDental.click();
    }
    public void checkViewDental() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewDental.click();
    }
    public void checkLearnHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnHeathInsurance.click();
    }
    public void checkViewHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewHealthInsurance.click();
    }
    public void checkLearnMedicaidPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMedicaidPlans.click();
    }
    public void checkHospitalAndDoctorInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hospitalAndDoctorInsurance.click();
    }
    public void checkVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        visionInsurance.click();
    }
    public void checkTermLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        termLifeInsurance.click();
    }
    public void checkIllnessInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        illnessInsurance.click();
    }
    public void checkAccidentInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        accidentInsurance.click();
    }
    public void checkHospitalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hospitalInsurance.click();
    }
    public void checkSupplementInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        supplementInsurance.click();
    }
    public void checkGlobalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        globalInsurance.click();
    }
    public void checkTravelInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        travelInsurance.click();
    }
    public void checkProviderPortal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        providerPortal.click();
    }
    public void checkBrokerResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        brokerResources.click();
    }
    public void checkMarketplaceInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        marketplaceInsurance.click();
    }
    public void checkMedicareLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicareLink.click();
    }
    public void checkMedicaidProduct() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicaidProduct.click();
    }
    public void checkEmployerGroup() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        employerGroup.click();
    }
    public void checkDentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dentalInsurance.click();
    }
    public void checkVisionProduct() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        visionProduct.click();
    }
    public void checkShorttermHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shorttermHealth.click();
    }
    public void checkFitnessLiving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fitnessLiving.click();
    }
    public void checkNutritionLiving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nutritionLiving.click();
    }
    public void checkHealthTopics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        healthTopics.click();
    }
    public void checkControlCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        careControl.click();
    }
    public void checkHealthWellness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        careControl.click();
    }
    public void checkProgramandTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeLogo.click();
    }
    public void checkOpenEnrollment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openEnrollment.click();
    }
    public void checkMemberResource() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        memberResource.click();
    }
    public void checkAboutUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        aboutUs.click();
    }
    public void checkUnitedReform() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        unitedReform.click();
    }
    public void checkValuebasedCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        valuebasedCare.click();
    }
    public void checkViewDrugList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewdrugList.click();
    }
    public void checkDownloadApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        downloadApp.click();
    }
    public void checkBrokerLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        brokerLink.click();
    }
    public void checkPlainGlossary() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        plainGlossary.click();
    }
    public void checkLanguageNotice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        languageNotice.click();
    }
    public void checkFindanyDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findanyDoctor.click();
    }
    public void checkPrintIdCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        printidCard.click();
    }
    public void checkViewclaimAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewclaimAccount.click();
    }
    public void checkCheckBenefits() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkBenefits.click();
    }
    public void checkNewsRoom() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newsRoom.click();
    }
    public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        contactUs.click();
    }
    public void checkCareer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        career.click();
    }
    public void checkHealthcareFraud() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        healthcareFraud.click();
    }
    public void checkLegalIssue() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        legalIssue.click();
    }
    public void checkPrivacy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        privacy.click();
    }
    public void checkTermsofUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        termsofUse.click();
    }
    public void checkAccessibility() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        accessibility.click();
    }
    public void checkLanguage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        spanishlanguage.click();
        englishLanguage.click();
    }
    public void checkTrytoSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        trytoSignIn.click();
        UHCsignin.click();
        userName.sendKeys("orfatt11@gmail.com", Keys.ENTER);
        passWord.sendKeys("Shadowdirge12", Keys.ENTER);
        rememberMe.click();
    }
}
