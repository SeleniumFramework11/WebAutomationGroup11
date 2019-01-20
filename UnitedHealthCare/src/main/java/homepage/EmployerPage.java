package homepage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class EmployerPage extends BaseUtil {
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]")
    public static WebElement groupBenefitPlan;

    @FindBy(how = How.LINK_TEXT, using = "Group Health Insurance Basics")
    public static WebElement groupHealthInsurance;

    @FindBy(how = How.LINK_TEXT, using = "Small Business")
    public static WebElement smallBusiness;

    @FindBy(how = How.XPATH, using = "//div[@class='uhc-wrapper']//ul[@class='child-list']//li[4]//a[1]")
    public static WebElement medicalInsurance;

    @FindBy(how = How.LINK_TEXT, using = "Why UnitedHealthcare")
    public static WebElement unitedHealthCare;

    @FindBy(how = How.LINK_TEXT, using = "Programs and Tools")
    public static WebElement programsAndTools;

    @FindBy(how = How.LINK_TEXT, using = "Large Business")
    public static WebElement largeBusiness;

    @FindBy(how = How.LINK_TEXT, using = "National Accounts")
    public static WebElement nationalAccount;

    @FindBy(how = How.LINK_TEXT, using = "Public Sector")
    public static WebElement publicSector;

    @FindBy(how = How.LINK_TEXT, using = "Group Retiree Solutions from Market Leader")
    public static WebElement groupLeader;

    @FindBy(how = How.LINK_TEXT, using = "Specialty Benefits")
    public static WebElement specialtyBenefits;

    @FindBy(how = How.LINK_TEXT, using = "Other Coverage ")
    public static WebElement otherCoverage;

    @FindBy(how = How.LINK_TEXT, using = "Pharmacy")
    public static WebElement pharMacy;

    @FindBy(how = How.LINK_TEXT, using = "News")
    public static WebElement newsReport;

    @FindBy(how = How.XPATH, using = "//span[@class='button-primary-common button-digital-blue span-focus']")
    public static WebElement getAQuote;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Request a quote for a different state.')]")
    public static WebElement requestQuote;

    @FindBy (how = How.LINK_TEXT, using = "Request a quote")
    public static WebElement medicalQuote;

    @FindBy(how = How.XPATH, using = "//div[@class='32 parsys']//span[@class='arrow-link'][contains(text(),'Request a quote')]")
    public static WebElement dentalQuote;

    @FindBy(how = How.XPATH, using = "//div[@class='33 parsys']//span[@class='arrow-link'][contains(text(),'Request a quote')]")
    public static WebElement visionQuote;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Learn More')]")
    public static WebElement retireeHealthCare;

    @FindBy(how = How.LINK_TEXT, using = "Hospital Indemnity Protection Plan")
    public static WebElement indemnityProtectionPlan;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Disability (Short and Long-Term)')]")
    public static WebElement disabilityShortandLong;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Critical Illness Protection Plan')]")
    public static WebElement criticalIllnessPlan;

    @FindBy(how = How.LINK_TEXT, using = "Communication Resource")
    public static WebElement communicationResource;

    @FindBy(how = How.LINK_TEXT, using = "Getting Started Toolkit")
    public static WebElement gettingStartedToolkit;

    public void checkgroupBenefitPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        groupBenefitPlan.click();
    }
    public void checkgroupHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        groupHealthInsurance.click();
    }
    public void checksmallBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        smallBusiness.click();
    }
    public void checkmedicalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicalInsurance.click();
    }
    public void checkunitedHealthCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        unitedHealthCare.click();
    }
    public void checkprogramsAndTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        programsAndTools.click();
    }
    public void checklargeBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        largeBusiness.click();
    }
    public void checknationalAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nationalAccount.click();
    }
    public void checkpublicSector() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        publicSector.click();
    }
    public void checkgroupLeader() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        groupLeader.click();
    }
    public void checkspecialtyBenefits() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        specialtyBenefits.click();
    }
    public void checkotherCoverage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        otherCoverage.click();
    }
    public void checkpharMacy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pharMacy.click();
    }
    public void checknewsReport() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newsReport.click();
    }
    public void checkgetAQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAQuote.click();
    }
    public void checkrequestQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        requestQuote.click();
    }
    public void checkmedicalQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicalQuote.click();
    }
    public void checkdentalQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dentalQuote.click();
    }
    public void checkvisionQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        visionQuote.click();
    }
    public void checkretireeHealthCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        retireeHealthCare.click();
    }
    public void checkindemnityHealthProtection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        indemnityProtectionPlan.click();
    }
    public void checkdisabilityShortandLong() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        disabilityShortandLong.click();
    }
    public void checkcriticalIllnessPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        criticalIllnessPlan.click();
    }
    public void checkcommunicationResource() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        communicationResource.click();
    }
    public void checkgettingStartedToolkit() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        gettingStartedToolkit.click();
    }
}
