package testSignInPage;

import SearchDB.SearchInsurance;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchInsurance extends SearchInsurance {
    SearchInsurance searchInsurance;
    @Test
    public void testSearchDoctorsBySubmitButton()throws IOException {
        searchInsurance = PageFactory.initElements(driver, SearchInsurance.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInsurance.searchInsuranceBySubmitButton();
    }
    @Test
    public void testSearchDoctorsByENTERKeyword() throws IOException, InterruptedException {
        searchInsurance = PageFactory.initElements(driver, SearchInsurance.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInsurance.searchInsuranceByENTERKeyword();
    }
}
