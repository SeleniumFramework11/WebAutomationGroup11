package homePage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

//search by product name in search box, all 10 tests are passed
public class FindProduct extends BaseUtil {

@FindBy(id = "searchSubmit")
public static WebElement searchbox;

public void checksearchBox(){
TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
searchbox.sendKeys(" perfume for men", Keys.ENTER);
searchbox.sendKeys(" diamond rings", Keys.ENTER);
searchbox.sendKeys(" toaster ovens", Keys.ENTER);
searchbox.sendKeys(" rice cooker", Keys.ENTER);
searchbox.sendKeys(" watches", Keys.ENTER);
searchbox.sendKeys(" jeans", Keys.ENTER);
searchbox.sendKeys(" belts", Keys.ENTER);
searchbox.sendKeys(" shoes", Keys.ENTER);
searchbox.sendKeys(" coffee mugs", Keys.ENTER);
searchbox.sendKeys(" tv stands", Keys.ENTER);
}
}
