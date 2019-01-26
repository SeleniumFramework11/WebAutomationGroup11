package ExcelSheetSearchMovies;
import ExcelSheet.SearchMoviesExcel;
import HomePage.HomePage;
import MainPage.MainPage;
import ProfileSelectionPage.ProfileSelectionPage;
import SignInPage.SignInPage;
import TestProfileSelectionPage.TestProfileSelectionPage;
import TestSignInPage.TestSignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchMoviesXcel extends SearchMoviesExcel {
    SignInPage SignInPage;
    HomePage HomePage;
    MainPage MainPage;
    TestSignInPage TestSignInPage;
    ProfileSelectionPage ProfileSelectionPage;
    TestProfileSelectionPage TestProfileSelectionPage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage = PageFactory.initElements(driver, HomePage.class);
        MainPage = PageFactory.initElements(driver, MainPage.class);
        TestSignInPage = PageFactory.initElements(driver, TestSignInPage.class);
        ProfileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        TestProfileSelectionPage = PageFactory.initElements(driver, TestProfileSelectionPage.class);
        setUrl("https://www.netflix.com/");
        HomePage.clickSignInButton();
        TestSignInPage.testSignInButtonOnSignInPage();
        TestProfileSelectionPage.testSelectProfile(); }
    @Test
    public void TestExcel() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName()+ ": "+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchMoviesExcel obj = PageFactory.initElements(driver, SearchMoviesExcel.class);
        clickSearchIcon();
        obj.loginExcelSheet();
    }
}
