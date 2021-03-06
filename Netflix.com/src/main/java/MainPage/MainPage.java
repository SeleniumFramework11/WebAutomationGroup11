package MainPage;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseUtil { //119-93=26
    @FindBy(xpath = "//a[.='TV Shows']")
    public static WebElement tvShowsLink;
    public void clickTvShowsLink(){ tvShowsLink.click();
    }
    @FindBy(xpath = "//a[.='Movies']")
    public static WebElement moviesLink;
    public void clickMoviesLink(){ moviesLink.click();
    }
    @FindBy(xpath = "//a[.='Recently Added']")
    public static WebElement recentlyAddedLink;
    public void clickRecentlyAddedLink(){ recentlyAddedLink.click();
    }
    @FindBy(xpath = "//a[.='My List']")
    public static WebElement myListLink;
    public void clickMyListLink(){ myListLink.click();
    }
    @FindBy(xpath = "//a[.='Home']")
    public static WebElement homeLink;
    public void clickHomeLink(){ homeLink.click();
    }
    @FindBy(css = "span.icon-search")
    public static WebElement searchButton;
    public void clickSearchButton(){ searchButton.click();
    }
    @FindBy(xpath = "//input[@type='text']")
    public static WebElement searchBar;;
    public void clickSearchBox(String Values){ searchButton.click();searchBar.sendKeys(Values);
    }
    @FindBy(linkText = "DVD")
    public static WebElement clickDVD;
    public void clickDVDLink(){ clickDVD.click();
    }
    @FindBy(xpath ="//span[@class='icon-button-notification']")
    public static WebElement clickNotification;
    public void clickNotificationBell(){ clickNotification.click();
    }
    @FindBy(xpath = "//div[.='New Releases']")
    public static WebElement checkNewRelease;
    public void clickNewRelease(){ checkNewRelease.click();
    }
    @FindBy(xpath = "//div[.='NETFLIX ORIGINALS']")
    public static WebElement checkNetflixOriginals;
    public void clickNetflixOriginals(){ checkNetflixOriginals.click();
    }
    @FindBy(xpath = "//div[.='Oddballs & Outcasts']")
    public static WebElement checkCategoriesOddballs;
    public void clickCategoriesOddballs(){ checkCategoriesOddballs.click();
    }
    @FindBy(xpath = "//div[@class='slider-item slider-item-0']")
    public static WebElement playMovie;
    public void hoverOverMovie(){
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[@class='slider-item slider-item-0']"));
        builder.moveToElement(element).build().perform();
    }
    public void clickPlayMovie() throws InterruptedException {
        Thread.sleep(3000);
        hoverOverMovie();
        Thread.sleep(3000);
        playMovie.click();
        Thread.sleep(3000);
    }
}
