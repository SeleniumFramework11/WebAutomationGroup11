package ProfileSelectionPage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileSelectionPage extends BaseUtil {
//    @FindBy (xpath = "//a[@id='appMountPoint']")
//            //(linkText = "/browse")
//    public static WebElement netflixLogo;
//    public void clickNetflixLogoLink(){
//        netflixLogo.click();
//    }
    @FindBy(xpath = "//span[.='Add Profile']")
    public static WebElement addProfile;
    public void clickAddProfile(){
        addProfile.click();
    }
    @FindBy(xpath = "//span[.='i11y']")
    public static WebElement selectProfile;
    public void clickSelectProfile(){
        selectProfile.click();
    }
    @FindBy(xpath = "//a[.='Manage Profiles']")
    public static WebElement managedProfiles;
    public void clickManagedProfile(){ managedProfiles.click();
    }
}
