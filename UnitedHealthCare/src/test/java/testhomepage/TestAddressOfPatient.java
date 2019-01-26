package testhomepage;

import homepage.AddressOfPatient;
import homepage.InsuranceInformationPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddressOfPatient extends AddressOfPatient {
    AddressOfPatient yourAddressPage;
    @BeforeMethod
    public void init(){yourAddressPage= PageFactory.initElements(driver, AddressOfPatient.class);
    }
    @Test
    public void testEnterCustomerAddress()  {
        Assert.assertEquals(enterCustomerAddress(), "GEICO");
    }
}