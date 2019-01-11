package testhomepage;

import homepage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestWelcomePage extends MainPage {
    MainPage welcome;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        welcome = PageFactory.initElements(driver, MainPage.class);
        setUrl("https://www.uhc.com/");
        //setUrl("https://www.uhone.com/shop/#/census");

    }
    @Test
    public void testseeLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkseeLogo();

    }
    @Test
    public void testmenubutton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkmenubutton();

    }
    @Test
    public void testsearchName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checksearchName();

    }
    @Test
    public void testbuttonSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkbuttonSearch();

    }
    @Test
    public void testseatchText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checksearchText();

    }
    @Test
    public void testkeySearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkkeySearch();

    }
    @Test
    public void testhomeButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkhomeButton();

    }
    @Test
    public void testemployerMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkemployerMenu();

    }
    @Test
    public void testmedicareMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkmedicareMenu();

    }
    @Test
    public void testfindaDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkfindaDoctor();

    }
    @Test
    public void testimageHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkimageHealth();

    }
    @Test
    public void testloginButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkloginButton();

    }
    @Test
    public void testsigninUHC() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checksigninUHC();

    }
    @Test
    public void testnearbyClinic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checknearbyClinic();

    }
    @Test
    public void testlearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checklearnMore();

    }
    @Test
    public void testlearnmoreBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checklearnmoreBusiness();

    }
    @Test
    public void testindividualPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkindividualPlans();

    }
    @Test
    public void testemployerPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkemployerPlans();

    }
    @Test
    public void testlearnmoreMedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checklearnmoreMedicare();

    }
    @Test
    public void testviewindividualAndFamily() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkviewindividualAndFamily();

    }
    @Test
    public void testlearnDental() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checklearnDental();

    }
    @Test
    public void testviewDental() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkviewDental();

    }
    @Test
    public void testlearnHealthINsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checklearnHealthInsurance();

    }
    @Test
    public void testviewHealthINsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkviewHealthInsurance();

    }
    @Test
    public void testlearnMedicaidPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checklearnMedicaidPlans();

    }
    @Test
    public void testhospitalAndDoctorInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkhospitalAndDoctorInsurance();

    }
    @Test
    public void testvisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkvisionInsurance();

    }
    @Test
    public void testtermLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checktermLifeInsurance();

    }
    @Test
    public void testillnessInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkillnessInsurance();

    }
    @Test
    public void testaccidentInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkaccidentInsurance();

    }
    @Test
    public void testhospitalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkhospitalInsurance();

    }
    @Test
    public void testsupplementInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checksupplementInsurance();

    }
    @Test
    public void testglobalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkglobalInsurance();

    }
    @Test
    public void testtravelInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checktravelInsurance();

    }
    @Test
    public void testproviderPortal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkproviderPortal();

    }













}
