package autoinsurancequotetest;
import autoinsuranceqoutepage.VehicleDetailsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VehicleDetailsPageTest extends VehicleDetailsPage{
    VehicleDetailsPage vehicleDetailsPage;
    @BeforeMethod
    public void init(){vehicleDetailsPage= PageFactory.initElements(driver, VehicleDetailsPage.class);
    }
    @Test
    public void testEnterVehicleDetailsPage(){
        Assert.assertEquals(enterVehicleDetails(),"GEICO");
    }
    @Test
    public void testClickOnRadioButtonForOwnershipType(){
        Assert.assertEquals(clickOnRadioButtonForOwnershipType(),"GEICO");
    }
    @Test
    public void testClickOnRadioButtonOrimaryUse(){
        Assert.assertEquals(clickOnRadioButtonForimaryUse(),"GEICO");
    }
}