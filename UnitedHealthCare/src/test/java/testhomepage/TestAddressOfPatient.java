package testhomepage;

import homepage.AddressOfPatient;
import homepage.InsuranceInformationPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddressOfPatient extends AddressOfPatient {
    AddressOfPatient patient;
    @BeforeMethod
    public void init(){
        patient= PageFactory.initElements(driver, AddressOfPatient.class);
    }
    @Test
    public void testPatientAddress()  {
        Assert.assertEquals(enterCustomerAddress(), "UHC");

    }
}