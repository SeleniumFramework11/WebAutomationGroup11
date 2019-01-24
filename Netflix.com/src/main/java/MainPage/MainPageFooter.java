package MainPage;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPageFooter extends BaseUtil {
    @FindBy(xpath = "//span[.='Audio And Subtitles']")
    public static WebElement audioAndSubtitles;
    public void clickAudioAndSubtitles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        audioAndSubtitles.click(); }
    @FindBy(xpath = "//span[.='Audio Description']")
    public static WebElement audioDescriptionLink;
    public void clickAudioDescriptionLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        audioDescriptionLink.click();
    }
    @FindBy(xpath = "//span[.='Gift Cards']")
    public static WebElement giftCardsLink;
    public void clickGiftCardsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCardsLink.click(); }
}

