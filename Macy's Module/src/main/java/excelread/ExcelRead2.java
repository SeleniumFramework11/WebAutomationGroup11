package excelread;
import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ExcelRead2 extends BaseUtil {
    public ExcelRead2(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='globalSearchInputField']")
    WebElement searchBox;
    public void searchFromExcel() throws InterruptedException {
        ExcelRead1 excelReader = new ExcelRead1("C:\\Users\\Nahida\\IdeaProjects\\WebAutomationGroup11\\Macy's Module\\excelfile\\File.xlsx");
        int rowcount = excelReader.getRowCount(0);
        // searchButton.click();
        searchBox.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchBox.sendKeys(searchItems, Keys.ENTER);
            Thread.sleep(500);
            searchBox.clear();
        }
    }
}
