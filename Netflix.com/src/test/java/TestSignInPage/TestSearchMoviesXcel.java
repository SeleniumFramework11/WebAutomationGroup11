package TestSignInPage;

import HomePage.HomePage;
import SignInPage.SignInPage;
import SearchMoviesExcel.SearchMoviesExcel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchMoviesXcel extends SearchMoviesExcel {
    SignInPage SignInPage;
    HomePage HomePage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage = PageFactory.initElements(driver, HomePage.class);
        setUrl("http://www.Netflix.com");
        HomePage.clickSignInButton();
    }
    @Test
    public void TestExcel() throws IOException {
        TestLogger.log(getClass().getSimpleName()+ ": "+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchMoviesExcel obj = PageFactory.initElements(driver, SearchMoviesExcel.class);
        obj.loginExcelSheet();
    }
}
