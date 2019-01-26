package SearchDB;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BaseUtil {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]")
    public static WebElement learnHeathInsurance;

    @FindBy (className = "search-button")
    public static WebElement searchButton;

    public void checksearch() {
        searchButton.sendKeys("Health Insurance", Keys.ENTER);
        searchButton.sendKeys("Vision Insurance",Keys.ENTER);
    }
}
