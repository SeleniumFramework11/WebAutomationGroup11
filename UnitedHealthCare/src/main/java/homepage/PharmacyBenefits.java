package homepage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class PharmacyBenefits extends BaseUtil {
    @FindBy(css = "#leftnavmenu > li > ul > li:nth-child(3) > a > span")
    public static WebElement newMember;

    @FindBy(css = "#leftnavmenu > li > ul > li:nth-child(4) > a > span")
    public static WebElement chooseDoctor;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/escleftnavnutch[1]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]")
    public static WebElement manageCost;

    @FindBy(linkText = "Know Your Care Options")
    public static WebElement careOption;

    @FindBy(linkText = "myuhc.com")
    public static WebElement myUHC;

    @FindBy(linkText = "Health Care Tools")
    public static WebElement healthTools;

    @FindBy(linkText = "Frequently Asked Questions")
    public static WebElement frequentQuestions;

    @FindBy(linkText = "Health4Me")
    public static WebElement healthForMe;

    @FindBy(css = "#main-content > div.TwoColRightPar.parsys > div:nth-child(4) > div > div > div > p:nth-child(6) > a > span.button-primary-common.button-digital-blue")
    public static WebElement goToWebsite;

    @FindBy(linkText = "Prior Authorization")
    public static WebElement priorAuthorization;

    @FindBy(xpath = "//span[contains(text(),'Supply/Quantity Limits')]")
    public static WebElement supplyLimit;

    @FindBy(xpath = "//span[contains(text(),'Step Therapy')]")
    public static WebElement stepTherapy;

    @FindBy(xpath = "//span[contains(text(),'Specialty Medication')]")
    public static WebElement specialtyMedication;

    @FindBy(xpath = "//div[@class='22 parsys']//span[@class='button-primary-common button-digital-blue']")
    public static WebElement savingTips;

    public void checkNewMember() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newMember.click();
    }
    public void checkChooseDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        chooseDoctor.click();
    }

    public void checkManageCost() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        manageCost.click();
    }
    public void checkCareOption() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        careOption.click();
    }
    public void checkMyUHC() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        myUHC.click();
    }
    public void checkHealthTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        healthTools.click();
    }
    public void checkFrequentQuestions() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        frequentQuestions.click();
    }
    public void checkHealthForMe() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        healthForMe.click();
    }
    public void checkGoToWebsite() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToWebsite.click();
    }
    public void checkPriorAuthorization() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        priorAuthorization.click();
    }
    public void checkSupplyLimit() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        supplyLimit.click();
    }
    public void checkStepTherapy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        stepTherapy.click();
    }
    public void checkSpecialtyMedication() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        specialtyMedication.click();
    }
    public void checkSavingTips() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        savingTips.click();
    }
}
