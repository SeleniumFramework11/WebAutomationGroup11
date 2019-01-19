package testhomepage;

import homepage.EmployerPage;
import homepage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestEmployerPage extends EmployerPage {
    EmployerPage employerPage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage = PageFactory.initElements(driver, EmployerPage.class);
        setUrl("https://www.uhc.com/employer");
    }
    @Test
    public void testgroupBenefitPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgroupBenefitPlan();
    }
    @Test
    public void testgroupHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgroupHealthInsurance();
    }
    @Test
    public void testsmallBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checksmallBusiness();
    }
    @Test
    public void testmedicalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkmedicalInsurance();
    }
    @Test
    public void testunitedHealthCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkunitedHealthCare();
    }
    @Test
    public void testprogramAndTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkprogramsAndTools();
    }
    @Test
    public void testlargeBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checklargeBusiness();
    }
    @Test
    public void testnationalAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checknationalAccount();
    }
    @Test
    public void testpublicSector() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkpublicSector();
    }
    @Test
    public void testgroupLeader() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgroupLeader();
    }
    @Test
    public void testspecialtyBenefits() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkspecialtyBenefits();
    }
    @Test
    public void testotherCoverage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkotherCoverage();
    }
    @Test
    public void testpharMacy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkpharMacy();
    }
    @Test
    public void testnewsReport() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checknewsReport();
    }
    @Test
    public void testgetAQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgetAQuote();
    }
    @Test
    public void testrequestQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkrequestQuote();
    }
    @Test
    public void testmedicalQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkmedicalQuote();
    }
    @Test
    public void testdentalQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkdentalQuote();
    }
    @Test
    public void testvisionQuote() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkvisionQuote();
    }
    @Test
    public void testretireeHealthCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkretireeHealthCare();
    }
    @Test
    public void testindemnityProtectionPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkindemnityHealthProtection();
    }
    @Test
    public void testdisabilityShortandLong() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkdisabilityShortandLong();
    }
    @Test
    public void testcriticalIllnessPlan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkcriticalIllnessPlan();
    }
    @Test
    public void testcommunicationResource() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkcommunicationResource();
    }
    @Test
    public void testgettingStartedToolkit() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgettingStartedToolkit();
    }
}
