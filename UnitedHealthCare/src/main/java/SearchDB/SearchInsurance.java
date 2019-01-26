package SearchDB;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchInsurance extends BaseUtil {
    @FindBy(xpath = "//input[@id='q']")
    public WebElement searchField;

    @FindBy(xpath = "//input[@value='Search']")
    public WebElement submitButton;

    public List<String> getInsuranceList() {
        List<String> insuranceList = new ArrayList<>();
        insuranceList.add("Hospital and Doctor Insurance ");
        insuranceList.add("Vision Insurance");
        insuranceList.add("Term Life Insurance");
        insuranceList.add("Critical Illness Insurance");
        insuranceList.add("Accident Insurance");
        insuranceList.add("Hospitalization Insurance");
        insuranceList.add("Supplemental Insurance");
        insuranceList.add("Global Insurance");
        insuranceList.add("Global Travel Insurance");
        return insuranceList;
    }
    public void putValueInSearchField(String value){
        searchField.sendKeys(value);
    }
    public void putValueInSearchFieldWithENTER(String value){
        searchField.sendKeys(value, Keys.ENTER);
    }
    public void submitSearchButton(){
        submitButton.click();
    }
    public void clearInput(){
        searchField.clear();
    }
    public void searchInsuranceBySubmitButton()throws IOException {
        List<String> insuranceList = getInsuranceList();
        for(int i=0; i<insuranceList.size(); i++) {
            //waitToBeVisible();  //need to be here
            //clickSearchKey();  //no need, if given test failed
            putValueInSearchField(insuranceList.get(i));
            submitSearchButton();
            //clearInput();
        }
    }
    public void searchInsuranceByENTERKeyword()throws InterruptedException, IOException {
        List<String> doctorsList = getInsuranceList();
        for(String st: doctorsList) {
            //waitToBeVisible();
            //clickSearchKey();  //no need
            //searchField.sendKeys(st, Keys.ENTER);
            putValueInSearchFieldWithENTER(st);  //ki hobe?
            //clearInput();
        }
    }
}




