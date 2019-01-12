package testhomepage;

import homepage.MainPage;
import homepage.RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestRegisterPage extends RegisterPage {
    RegisterPage registerPage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        setUrl("https://accounts.myuhc.com/register/personalInfo");
    }
    @Test
    public void testRegistration() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registerPage.checkRegistration();
    }



}
