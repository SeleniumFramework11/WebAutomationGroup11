package GoogleSheet;
import base.BaseUtil;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.By;
import java.io.IOException;
import java.util.List;
import static GoogleSheets.GoogleSheetReader.getSheetsService;
public class SignInWithGoogleSheetEbay extends BaseUtil {
    public void typeEmailAddress(String locator,String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void typePasswords(String locator,String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void clickSignInGS(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    public void enterUserNameAndPassword(String spreadsheetId, String range) throws IOException{
        List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : values) {
            typeEmailAddress("//label[contains(text(),'Email or username')]",row.get(0).toString());
            typePasswords("//input[@id='pass']",row.get(1).toString());
            clickSignInGS("//button[@id='sgnBt']");
        }
    }
}
