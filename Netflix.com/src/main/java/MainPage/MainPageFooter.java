package MainPage;

import base.BaseUtil;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageFooter extends BaseUtil {
    @FindBy(xpath = "//span[@class='member-footer-link-content']")
    public static WebElement audioAndSubtitles;
    public void clickAudioAndSubtitles(){
        audioAndSubtitles.click();
    }



}

