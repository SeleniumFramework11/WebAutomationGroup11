package HomePage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsPage extends BaseUtil {
    @FindBy(xpath = "//span[.='Teams']")
    public static WebElement teamsLink;
    public void selectTeamsLink(){ teamsLink.click();
    }
    @FindBy(xpath = "//span[.='Locations']")
    public static WebElement locationsLink;
    public void selectLocationsLink(){ locationsLink.click();
    }
    @FindBy(xpath = "//span[.='Inclusion & Diversity']")
    public static WebElement diversityLink;
    public void selectDiversityLink(){ diversityLink.click();
    }
    @FindBy(xpath = "//span[.='Work Life Philosophy']")
    public static WebElement workLifeLink;
    public void selectWorkLifeLink(){ workLifeLink.click();
    }
    @FindBy(xpath = "//span[.='We Are Netflix']")
    public static WebElement weAreNetflixLink;
    public void selectWeAreNetflixLink(){ weAreNetflixLink.click();
    }
    @FindBy(xpath = "//span[.='READ ABOUT OUR CULTURE']")
    public static WebElement searchReadCultureLink;
    public void selectReadCultureLink(){ searchReadCultureLink.click();
    }
    @FindBy(css = "#autocomplete-input")
    public static WebElement searchForJobs;
    public void searchForJobsBox(String values) throws InterruptedException {
        searchForJobs.sendKeys(values, Keys.ENTER);
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//h4[.='Business Development']")
    public static WebElement businessDevelopmentJobs;
    public void selectBusinessDevelopment(){
        businessDevelopmentJobs.click();
    }
    @FindBy(xpath = "//h4[.='Content']")
    public static WebElement contentJobs;
    public void selectContent(){
        contentJobs.click();
    }
    @FindBy(xpath = "//h4[.='Customer Service']")
    public static WebElement customerServiceJobs;
    public void selectCustomerServiceJobs(){
        customerServiceJobs.click();
    }
    @FindBy(xpath = "//h4[.='Data, Analytics, and Algorithms']")
    public static WebElement analyticsJobs;
    public void selectAnalytics(){
        analyticsJobs.click();
    }
    @FindBy(xpath = "//h4[.='Design and Product Innovation']")
    public static WebElement designJobs;
    public void selectDesign(){
        designJobs.click();
    }
    @FindBy(xpath = "//h4[.='Employee Technology']")
    public static WebElement employeeTechnologyJobs;
    public void selectEmployeeTechnologyJobs(){
        employeeTechnologyJobs.click();
    }
    @FindBy(xpath = "//h4[.='Engineering']")
    public static WebElement engineeringJobs;
    public void selectEngineeringJobs(){
      engineeringJobs.click();
    }
    @FindBy(xpath = "//h4[.='Facilities']")
    public static WebElement facilitiesJobs;
    public void selectFacilitiesJobs(){
        facilitiesJobs.click();
    }
    @FindBy(xpath = "//h4[.='Legal']")
    public static WebElement legalJobs;
    public void selectLegalJobs(){
        legalJobs.click();
    }
    @FindBy(xpath = "//h4[.='Finance']")
    public static WebElement financeJobs;
    public void selectFinanceJobs(){
        financeJobs.click();
    }
    @FindBy(xpath = "//h4[.='Product Creative']")
    public static WebElement productCreativeJobs;
    public void selectProductCreativeJobs(){
        productCreativeJobs.click();
    }
    @FindBy(xpath = "//h4[.='Marketing and PR']")
    public static WebElement marketingAndPRJobs;
    public void selectMarketingAndPRJobs(){
        marketingAndPRJobs.click();
    }
    @FindBy(xpath = "//h4[.='Security']")
    public static WebElement securityJobs;
    public void selectSecurityJobs(){
        securityJobs.click();
    }
    @FindBy(xpath = "//h4[.='Talent and Recruiting']")
    public static WebElement talentAndRecruitingJobs;
    public void selectTalentAndRecruitingJobs(){
        talentAndRecruitingJobs.click();
    }
}
