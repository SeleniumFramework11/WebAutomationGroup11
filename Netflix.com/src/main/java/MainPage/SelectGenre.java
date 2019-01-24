package MainPage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectGenre extends BaseUtil {
    //@FindBy(xpath = "//div[@class='nfDropDown theme-lakira']")
    @FindBy(xpath = "//div[.='Genres']")
    public static WebElement browseGenre;
    public void selectGenreDropDown(){
    browseGenre.click();
    }
}
