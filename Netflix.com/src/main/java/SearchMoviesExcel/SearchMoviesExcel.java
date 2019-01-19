package SearchMoviesExcel;
import base.BaseUtil;
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
public void clckSearchIcon(){}
public void loginEmail(String value){
        //searchInputField().sendKeys(value);
    }
public void loginExcelSheet() throws IOException {
        ReadFiles read = new ReadFiles();
        String[] value = read.getDataFromExcelFile();
        for(int i=1; i<value.length; i++){
            loginEmail(value[i]);
        }
    }
//        public void testExcel() throws IOException {
//        ArrayList<String> loginWithExcel = dataFromExcel("Q:\\WebAutomationGroup11\\Netflix.com\\src\\main\\java\\SearchMoviesExcel\\LoginWithExcelSheet.xlsx","Sheet1",1);
//        for (int i = 0; i < loginWithExcel.size(); i++) {
//            typeEmailAddress("id_userLoginId", loginWithExcel.get(i));
//        }}
}