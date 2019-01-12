package MainPage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseUtil {

    @FindBy(xpath = "//a[.='TV Shows']")
    public static WebElement tvShowsLink;
    public void clickTvShowsLink(){
        tvShowsLink.click();
    }
    @FindBy(xpath = "//a[.='Movies']")
    public static WebElement moviesLink;
    public void clickMoviesLink() {
        moviesLink.click();
    }
    @FindBy(xpath = "//a[.='Recently Added']")
    public static WebElement recentlyAddedLink;
    public void clickRecentlyAddedLink() {
        recentlyAddedLink.click();
    }
    @FindBy(xpath = "//a[.='My List']")
    public static WebElement myListLink;
    public void clickMyListLink() {
        myListLink.click();
    }
    @FindBy(xpath = "//a[.='Home']")
    public static WebElement homeLink;
    public void clickHomeLink() {
        homeLink.click();
    }
    @FindBy(css = "span.icon-search")
    public static WebElement searchButton;
    @FindBy(css = ".searchBox")
    public static WebElement searchBar;
    public void clickSearchButton() {
        searchButton.click();
        searchBar.sendKeys("DareDevil");
    }
}
