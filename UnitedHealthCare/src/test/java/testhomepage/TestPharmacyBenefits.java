package testhomepage;

import homepage.MainPage;
import homepage.PharmacyBenefits;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestPharmacyBenefits extends PharmacyBenefits {
    PharmacyBenefits pharmacy;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pharmacy = PageFactory.initElements(driver, PharmacyBenefits.class);
        setUrl("https://www.uhc.com/individual-and-family/member-resources/pharmacy-benefits");
    }

    @Test
    public void testNewMember() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkNewMember();
    }
    @Test
    public void testChooseDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkChooseDoctor();
    }
    @Test
    public void testManageCost() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkManageCost();
    }
    @Test
    public void testCareOption() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkCareOption();
    }
    @Test
    public void testMyUHC() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkMyUHC();
    }
    @Test
    public void testHealthTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkHealthTools();
    }
    @Test
    public void testEmployerMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkFrequentQuestions();
    }
    @Test
    public void testMedicareMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkHealthForMe();
    }
    @Test
    public void testFindaDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkGoToWebsite();
    }
    @Test
    public void testImageHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkPriorAuthorization();
    }
    @Test
    public void testLogInButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkSupplyLimit();
    }
    @Test
    public void testSignInUHC() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkStepTherapy();
    }
    @Test
    public void testNearbyClinic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkSpecialtyMedication();
    }
    @Test
    public void testLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pharmacy.checkSavingTips();
    }
}
