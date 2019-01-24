package helper;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReader2 extends BaseUtil {
    public ExcelReader2(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//input[@id='gh-ac']")
    WebElement searchBox;
    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("/Users/alrafifahd96gmail.com/Desktop/GroupWebAutomation/WebAutomationGroup11/ebay/src/main/java/helper/data.xlsx");
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
