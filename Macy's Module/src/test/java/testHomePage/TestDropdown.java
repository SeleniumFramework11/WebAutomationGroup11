package testHomePage;

import homePage.Dropdown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

//Dropdown test method
public class TestDropdown extends Dropdown {
Dropdown dropdown;
@BeforeMethod
public void initElements() {
TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
}.getClass().getEnclosingMethod().getName()));
dropdown = PageFactory.initElements(driver, Dropdown.class);
}
@Test
public void testdepartmentCaret() {
TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
}.getClass().getEnclosingMethod().getName()));
dropdown.checkdepartmentCaret();
}
@Test
public void testGifts() {
TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
}.getClass().getEnclosingMethod().getName()));
dropdown.checkGifts();
}
}