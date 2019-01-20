package testhomepage;

import homepage.MainPage;
import homepage.ViewPlan;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestViewPlan extends ViewPlan {
    ViewPlan welcome;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        welcome = PageFactory.initElements(driver, ViewPlan.class);
        setUrl("https://www.uhone.com/shop/#/census");
    }
    @Test
        public void testzipCode () {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            welcome.checkzipCode();
    }
        @Test
        public void testgenderMale () {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            welcome.checkgenderMale();
    }
        @Test
        public void testdateofBirth () {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            welcome.checkdateofBirth();
    }
    }
