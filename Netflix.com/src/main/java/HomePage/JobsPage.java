package HomePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class JobsPage extends BaseUtil {
    @FindBy(xpath = "//span[.='Teams']")
    public static WebElement teamsLink;
    public void selectTeamsLink(){ teamsLink.click();
    }
    @FindBy(xpath = "//span[.='Locations']")
    public static WebElement locationsLink;
    public void selectLocationsLink(){ locationsLink.click();
    }
    @FindBy(xpath = "//span[.='Inclusion & Diversity']")
    public static WebElement diversityLink;
    public void selectDiversityLink(){ diversityLink.click();
    }
    @FindBy(xpath = "//span[.='Work Life Philosophy']")
    public static WebElement workLifeLink;
    public void selectWorkLifeLink(){ workLifeLink.click();
    }
    @FindBy(xpath = "//span[.='We Are Netflix']")
    public static WebElement weAreNetflixLink;
    public void selectWeAreNetflixLink(){ weAreNetflixLink.click();
    }
    @FindBy(xpath = "//span[.='Search Jobs']")
    public static WebElement searchJobsLink;
    public void selectSearchJobsLink(){ searchJobsLink.click();
    }
    @FindBy(xpath = "//span[.='READ ABOUT OUR CULTURE']")
    public static WebElement searchReadCultureLink;
    public void selectReadCultureLink(){ searchReadCultureLink.click();
    }
    @FindBy(xpath = "//p[@class='css-1yun6pu']")
    public static WebElement cultureText;
    public void getTitleCulture(){ cultureText.getText();
    }
    @FindBy(xpath= "//span[.='See what's next']")
    public static WebElement searchWhatsNextLink;
    public void selectWhatsNextLink(){ searchWhatsNextLink.click();
    }
}
