package autoinsurancequotetest;

import autoinsuranceqoutepage.YourAddressPage;
import autoinsuranceqoutepage.YourInfoPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YourAddressPageTest extends YourAddressPage {
    YourAddressPage yourAddressPage;
    @BeforeMethod
    public void init(){yourAddressPage= PageFactory.initElements(driver, YourAddressPage.class);
    }
    @Test
    public void testEnterCustomerAddress()  {
        Assert.assertEquals(enterCustomerAddress(), "GEICO");
    }
}