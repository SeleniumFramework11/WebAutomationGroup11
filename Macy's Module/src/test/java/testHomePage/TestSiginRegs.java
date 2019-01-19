package testHomePage;

import homePage.SigninRegs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSiginRegs extends SigninRegs {

    SigninRegs testsignin;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        testsignin = PageFactory.initElements(driver, SigninRegs.class);
    }
    @Test
    public void testsigninRegister() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        testsignin.checksigninRegister();
    }
}

