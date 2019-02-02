package testhomepage;
import testhomepage.TestMedicareInfo;
import homepage.MedicareInfo;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMedicareInfo extends MedicareInfo {
    MedicareInfo medicareInfo;
    @BeforeMethod
    public void init(){
        medicareInfo= PageFactory.initElements(driver, MedicareInfo.class);
    }
    @Test
    public void testEnterPatientDetailsPage(){
        Assert.assertEquals(medicareInfo,"UHC");
    }
    @Test
    public void testInsranceType(){
        Assert.assertEquals(medicareInfo,"UHC");
    }
    @Test
    public void testQuotes(){

        Assert.assertEquals(clickOnRadioButtonForimaryUse(),"UHC");
    }
}