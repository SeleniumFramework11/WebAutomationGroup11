package testHomePage;

import GoogleSheet.SignInWithGoogleSheetEbay;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSigninWithGSheetEbay extends SignInWithGoogleSheetEbay {
   MainPage MainPage;
    @BeforeMethod
    public void initElements(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MainPage = PageFactory.initElements(driver, MainPage.class);
        setUrl("http://www.ebay.com");
        MainPage.checksignIn();
    }
        @Test
        public void loginEmailAndPassword() throws IOException{
//            TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
//            }.getClass().getEnclosingMethod().getName()));
            String spreadsheetId = "1M-nWtjBcHpUoS9lga5lgJRXaSrgpglSps8fzj8fwKmY";
            String range = "Sheet1!A2:B2";
            enterUserNameAndPassword(spreadsheetId, range);
        }
    }