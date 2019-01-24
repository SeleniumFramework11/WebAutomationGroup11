package DatabaseTest;

import Databases.ConnectDB;
import base.BaseUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class DatabaseTest extends BaseUtil {
    ConnectDB connectDB;

    @BeforeMethod
    public void setUp() {
        connectDB = PageFactory.initElements(driver, ConnectDB.class);
    }

    @Test
    public void webElementName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List actual = connectDB.getUserDatafromDB();
        List expected = connectDB.getFooterValue1();
        Assert.assertEquals(actual, expected);
    }
}
