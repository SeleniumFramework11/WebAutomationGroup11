package dataProviderUtilityWithExcelReader;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReader2 extends BaseUtil {
    public ExcelReader2(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='q']")
    WebElement searchBox;
    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("C:\\Users\\orfat\\Desktop\\WebAutomationGroup11\\UnitedHealthCare\\src\\ExcelFile\\data.xlsx");
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
