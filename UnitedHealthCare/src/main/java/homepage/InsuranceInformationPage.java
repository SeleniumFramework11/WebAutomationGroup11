package homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class InsuranceInformationPage extends InsuranceQuotes {
    InsuranceQuotes quotesOnProducts;
    @BeforeMethod
    public void init(){
        quotesOnProducts=PageFactory.initElements(driver, InsuranceQuotes.class);
    }
    @FindBy(css = ".skip-Button")
    public static WebElement skipButton;
    @FindBy(id = "first-Name")
    public static WebElement firstName;
    @FindBy(id = "last-Name")
    public static WebElement lastName;
    @FindBy(xpath = "//*[@class='btn btn--primary ")
    public static WebElement submit;
    public  void getInformationPage1QuoteWithZipCode()  {
        autoInsIcon.click();
        zipCodeTextBox.sendKeys("11432");
        getQoute.click();
    }//iframe handling
    public  void clickSkip(){
        waitToBeVisible(skipButton);
        skipButton.click();
    }
    public void clickNext(){
        waitToBeVisible(submit);
        Actions actions=new Actions(driver);
        actions.moveToElement(submit).click().build().perform();
    }
    public String enterCustomerName(String firstName1, String lastName1){
        getInformationPage1QuoteWithZipCode();
        clickSkip();
        firstName.sendKeys(firstName1);
        lastName.sendKeys(lastName1);
        clickNext();
        String title=driver.getTitle();
        return title;
    }
    public String enterPatientNameWithEmptySpace(){
        getInformationPage1QuoteWithZipCode();
        clickSkip();
        clickNext();
        String errorMessage=driver.findElement(By.id("firstName-error")).getText();
        return errorMessage;
    }
    public String enterPatientDOB(){
        enterCustomerName("Chowdhury", "Orfatt");
        typeByCss("#date-monthdob","05");
        typeByCss("#date-daydob","06");
        typeByCss("#date-yeardob","1993");
        clickNext();
        String title=driver.getTitle();
        return title;
    }
    public String enterCustomerAddress(){
        enterPatientDOB();
        typeByCss("#street","1-50 50th avenue");
        typeByCss("#apt","304");
        clickNext();
        return driver.getTitle();
    }

}