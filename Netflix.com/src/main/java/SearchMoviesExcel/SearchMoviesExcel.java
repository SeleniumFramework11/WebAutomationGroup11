package SearchMoviesExcel;
import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;

public class SearchMoviesExcel extends BaseUtil{

//    public ArrayList<String> dataFromExcel(String path, String sheetName, int columnNo) throws IOException {
//        FileInputStream fis = new FileInputStream(path);
//        HSSFWorkbook wb = new HSSFWorkbook(fis);
//        HSSFSheet s = wb.getSheet(sheetName);
//        Iterator<Row> rowIT = s.iterator();
//        ArrayList<String> list = new ArrayList<String>();
//        while (rowIT.hasNext()) {
//            list.add(rowIT.next().getCell(columnNo).getStringCellValue());
//           // list.add(rowIT.next().getCell(columnNo2).getStringCellValue());
//        }
//        return list;
//        }
@FindBy(xpath = "//input[@type='text']")
public WebElement searchInputField;
public WebElement getSearchInputField(){
    return searchInputField;
    }

public void setSearchInputField(WebElement searchInputField){
    this.searchInputField = searchInputField;
}
@FindBy(css = "span.icon-search")
public static WebElement searchButton;
public void clickSearchIcon(){
    searchButton.click();
}
public void searchFor(String value){
  getSearchInputField().sendKeys(value, Keys.ENTER);
}
public void loginExcelSheet() throws IOException {
        ReadFiles read = new ReadFiles();
        String[] value = read.getDataFromExcelFile();
        for(int i=1; i<value.length; i++){
           searchFor(value[i]);
        }
    }
}