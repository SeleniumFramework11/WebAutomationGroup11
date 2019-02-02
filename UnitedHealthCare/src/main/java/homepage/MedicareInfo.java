package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Year;

public class MedicareInfo extends AddressOfPatient {
    @FindBy (css=".requiredYear")
    public static WebElement modelYear;
    @FindBy (css=".requiredMake")
    public static WebElement make;
    @FindBy (css="#vehicleModel")
    public static WebElement name;
    public String  enterMedicareDetails(){
        enterCustomerAddress();
        selectOptionByVisibleText(lastName,"Riot");
        selectOptionByVisibleText(firstName,"Ramza");
        selectOptionByVisibleText(zipCodeTextBox, "11101");
        clickNext();
        clickNext();
        return driver.getTitle();
    }
    public String MedicarePlan(){
        enterMedicareDetails();
        clickByCss("#medicareinfo0");
        clickNext();
        return driver.getTitle();
    }
    public String clickOnRadioButtonForimaryUse(){
        MedicarePlan();
        driver.findElement(By.partialLinkText("Pleasure")).click();
        clickNext();
        clickNext();
        clickByXpath("//button[#'btnSubmit']");
        return driver.getTitle();
    }
}