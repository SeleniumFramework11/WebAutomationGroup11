package HomePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyGiftCardsPage extends BaseUtil {
@FindBy(xpath = "//a[contains(@href='https://www.amazon.com/dp/B00YD560HA/')]/@href")
    public static WebElement buyGCFromAmazon;
public void clickBuyGCFromAmazon(){
    buyGCFromAmazon.click();
}


}
