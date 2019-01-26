package homepage;
import homepage.QuotesOnProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import static base.BaseUtil.driver;

public class YourInfoPage extends QuotesOnProducts {
    QuotesOnProducts quotesOnProducts;
    @BeforeMethod
    public void init(){
        quotesOnProducts=PageFactory.initElements(driver,QuotesOnProducts.class);
    }
    @FindBy(css = ".skip-collect-intent.link--primary")
    public static WebElement skipButton;
    @FindBy(id = "firstName")
    public static WebElement firstName;
    @FindBy(id = "lastName")
    public static WebElement lastName;
    @FindBy(xpath = "//*[@class='btn btn--primary btn--full-mobile btn-spotlight']")
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
    public String enterCustomerNameWithEmptySpace(){
        getInformationPage1QuoteWithZipCode();
        clickSkip();
        clickNext();
        String errorMessage=driver.findElement(By.id("firstName-error")).getText();
        return errorMessage;
    }
    public String enterCustomerDOB(){
        enterCustomerName("arif", "mahmud");
        typeByCss("#date-monthdob","01");
        typeByCss("#date-daydob","01");
        typeByCss("#date-yeardob","1980");
        clickNext();
        String title=driver.getTitle();
        return title;
    }
    public String enterCustomerAddress(){
        enterCustomerDOB();
        typeByCss("#street","17527 wexford road");
        typeByCss("#apt","7B");
        clickNext();
        return driver.getTitle();
    }

}