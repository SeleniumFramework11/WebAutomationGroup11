package TestMainPage;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.util.concurrent.TimeUnit;

public class SearchMovies extends TestMainPage{
    @Test
    public void searchByActors() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSearchBox("Kevin Hart");
    }
    @Test
    public void searchByKeyWord() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSearchBox("Horror");
    }
    @Test
    public void searchByMovies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSearchBox("The Interview");
    }
    @Test
    public void searchMultipleMovies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSearchBox("Stranger Things");
        searchBar.sendKeys(Keys.CONTROL,"a");
        searchBar.sendKeys(Keys.DELETE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        searchBar.sendKeys("BirdBox");
       }
}
