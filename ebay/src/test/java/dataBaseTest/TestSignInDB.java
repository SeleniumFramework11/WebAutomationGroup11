package dataBaseTest;

import Databases.SignInUsingDB;
import base.BaseUtil;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignInDB extends BaseUtil {
    MainPage mainPage;
    SignInUsingDB signInUsingDB;

    @BeforeMethod
    public void initialisation1(){mainPage= PageFactory.initElements(driver,MainPage.class);
    }
    @BeforeMethod
    public void initialization2(){signInUsingDB=PageFactory.initElements(driver,SignInUsingDB.class);}


    @Test
    public void signUpUsignDtatFromBD() throws Exception {
        mainPage.clickOnSignInButton();
        signInUsingDB.loginUsingDataFromDB();
        mainPage.clickOnLogInButton();

    }


}
