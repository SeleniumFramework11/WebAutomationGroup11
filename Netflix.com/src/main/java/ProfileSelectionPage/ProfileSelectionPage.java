package ProfileSelectionPage;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ProfileSelectionPage extends BaseUtil {
    @FindBy(xpath = "//span[.='Add Profile']")
    public static WebElement addProfile;
    public void clickAddProfile(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        addProfile.click();
    }
    @FindBy(xpath = "//span[.='i11y']")
    public static WebElement selectProfile;
    public void clickSelectProfile(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectProfile.click();
    }
    @FindBy(xpath = "//a[.='Manage Profiles']")
    public static WebElement managedProfiles;
    public void clickManagedProfile(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        managedProfiles.click();
    }
}
