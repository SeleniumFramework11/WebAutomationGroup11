package SearchMoviesExcel;
import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class SearchMoviesExcel extends BaseUtil{
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