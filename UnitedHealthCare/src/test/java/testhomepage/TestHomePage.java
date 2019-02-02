package testhomepage;

import homepage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends MainPage {
    MainPage welcome;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        welcome = PageFactory.initElements(driver, MainPage.class);
        setUrl("https://www.uhc.com/");
    }
        @Test
    public void testSeeLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkSeeLogo();
    }
    @Test
    public void testMenubutton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkMenubutton();
    }
    @Test
    public void testSearchName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkSearchName();
    }
    @Test
    public void testButtonSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkButtonSearch();
    }
    @Test
    public void testSearchText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkSearchText();
    }
    @Test
    public void testKeySearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkKeySearch();
    }
    @Test
    public void testHomeButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkHomeButton();
    }
    @Test
    public void testEmployerMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkEmployerMenu();
    }
    @Test
    public void testMedicareMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkMedicareMenu();
    }
    @Test
    public void testFindaDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkFindaDoctor();
    }
    @Test
    public void testImageHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkImageHealth();
    }
    @Test
    public void testLogInButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLoginButton();
    }
    @Test
    public void testSignInUHC() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkSigninUHC();
    }
    @Test
    public void testNearbyClinic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkNearbyClinic();
    }
    @Test
    public void testLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLearnMore();
    }
    @Test
    public void testLearnMoreBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLearnmoreBusiness();
    }
    @Test
    public void testIndividualPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkIndividualPlans();
    }
    @Test
    public void testEmployerPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkEmployerPlans();
    }
    @Test
    public void testLearnMoreMedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLearnmoreMedicare();
    }
    @Test
    public void testViewindividualAndFamily() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkViewindividualAndFamily();
    }
    @Test
    public void testLearnDental() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLearnDental();
    }
    @Test
    public void testViewDental() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkViewDental();
    }
    @Test
    public void testLearnHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLearnHealthInsurance();
    }
    @Test
    public void testViewHealthINsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkViewHealthInsurance();
    }
    @Test
    public void testLearnMedicaidPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLearnMedicaidPlans();
    }
    @Test
    public void testHospitalAndDoctorInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkHospitalAndDoctorInsurance();
    }
    @Test
    public void testVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkVisionInsurance();
    }
    @Test
    public void testTermLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkTermLifeInsurance();
    }
    @Test
    public void testIllnessInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkIllnessInsurance();
    }
    @Test
    public void testAccidentInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkAccidentInsurance();
    }
    @Test
    public void testHospitalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkHospitalInsurance();
    }
    @Test
    public void testSupplementInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkSupplementInsurance();
    }
    @Test
    public void testGlobalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkGlobalInsurance();
    }
    @Test
    public void testTravelInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkTravelInsurance();
    }
    @Test
    public void testProviderPortal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkProviderPortal();
    }
    @Test
    public void testBrokerresources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkBrokerResources();
    }
    @Test
    public void testMarketplaceInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkMarketplaceInsurance();
    }
    @Test
    public void testMedicareLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkMedicareLink();
    }
    @Test
    public void testMedicaidProduct() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkMedicaidProduct();
    }
    @Test
    public void testEmployerGroup() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkEmployerGroup();
    }
    @Test
    public void testDentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkDentalInsurance();
    }
    @Test
    public void testVisionProduct() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkVisionProduct();
    }
    @Test
    public void testShorttermHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkShorttermHealth();
    }
    @Test
    public void testFitnessLiving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkFitnessLiving();
    }
    @Test
    public void testNutritionLiving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkNutritionLiving();
    }
    @Test
    public void testHealthTopics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkHealthTopics();
    }
    @Test
    public void testCareControl() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkControlCare();
    }
    @Test
    public void testProgramTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkProgramandTools();
    }
    @Test
    public void testOpenEnrollment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkOpenEnrollment();
    }
    @Test
    public void testMemberResource() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkMemberResource();
    }
    @Test
    public void testAboutUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkAboutUs();
    }
    @Test
    public void testUnitedReform() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkUnitedReform();
    }
    @Test
    public void testValueBasedCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkValuebasedCare();
    }
    @Test
    public void testViewDrugList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkViewDrugList();
    }
    @Test
    public void testDownloadApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkDownloadApp();
    }
    @Test
    public void testBrokerLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkBrokerLink();
    }
    @Test
    public void testplainGlossary() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkPlainGlossary();
    }
    @Test
    public void testLanguageNotice() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLanguageNotice();
    }
    @Test
    public void testFindAnyDoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkFindanyDoctor();
    }
    @Test
    public void testPrintIdCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkPrintIdCard();
    }
    @Test
    public void testViewclaimAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkViewclaimAccount();
    }
    @Test
    public void testCheckBenefits() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkCheckBenefits();
    }
    @Test
    public void testNewsRoom() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkNewsRoom();
    }
    @Test
    public void testContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkContactUs();
    }
    @Test
    public void testCareer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkCareer();
    }
    @Test
    public void testHealthcareFraud() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkHealthcareFraud();
    }
    @Test
    public void testLegalIssue() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLegalIssue();
    }
    @Test
    public void testPrivacy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkPrivacy();
    }
    @Test
    public void testTermsofUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkTermsofUse();
    }
    @Test
    public void testAccessibility() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkAccessibility();
    }
    @Test
    public void testLanguage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkLanguage();
    }
    @Test
    public void testTrytosignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcome.checkTrytoSignIn();
    }
}
