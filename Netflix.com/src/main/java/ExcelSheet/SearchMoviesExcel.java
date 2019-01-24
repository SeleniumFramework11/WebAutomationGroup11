package ExcelSheet;
import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

import static MainPage.MainPage.searchBar;

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
@FindBy(xpath = "//div[@class='slider-item slider-item-0']")
public static WebElement playMovie;
public void clickSearchIcon(){
    searchButton.click();
}
public void searchFor(String value){
  getSearchInputField().sendKeys(value, Keys.ENTER);
}
public void loginExcelSheet() throws IOException, InterruptedException {
        ReadFiles read = new ReadFiles();
        String[] value = read.getDataFromExcelFile();
        for(int i=0; i<value.length; i++){
           searchFor(value[i]);
           Thread.sleep(2000);
           //playMovie.click();
           //navigateBack();
           searchBar.sendKeys(Keys.CONTROL,"a");
           searchBar.sendKeys(Keys.DELETE);
        }
    }
}