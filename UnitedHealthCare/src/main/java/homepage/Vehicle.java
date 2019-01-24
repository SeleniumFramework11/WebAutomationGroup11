package autoinsuranceqoutepage;

import homepage.YourAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static base.BaseUtil.driver;

public class Vehicle extends YourAddress {
    @FindBy (css=".requiredYear")
    public static WebElement modelYear;
    @FindBy (css=".requiredMake")
    public static WebElement make;
    @FindBy (css="#vehicleModel")
    public static WebElement model;
    public String  enterVehicleDetails(){
        enterCustomerAddress();
        selectOptionByVisibleText(modelYear,"2015");
        selectOptionByVisibleText(make,"Acura");
        selectOptionByVisibleText(model, "MDX");
        clickNext();
        clickNext();
        return driver.getTitle();
    }
    public String clickOnRadioButtonForOwnershipType(){
        enterVehicleDetails();
        clickByCss("#vehicleOwned0");
        clickNext();
        return driver.getTitle();
    }
    public String clickOnRadioButtonForimaryUse(){
        clickOnRadioButtonForOwnershipType();
        driver.findElement(By.partialLinkText("Pleasure")).click();
        clickNext();
        clickNext();
        clickByXpath("//button[#'btnSubmit']");
        return driver.getTitle();
    }
}