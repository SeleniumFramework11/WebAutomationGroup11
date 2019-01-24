package TestHomePage;

import HomePage.JobsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestJobsPage extends JobsPage {
   JobsPage JobsPage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        JobsPage = PageFactory.initElements(driver, JobsPage.class);
        setUrl("https://jobs.netflix.com/");
    }
    @Test
    public void testTeamLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink(); }
    @Test
    public void testLocationsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectLocationsLink(); }
    @Test
    public void testDiversityLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectDiversityLink(); }
    @Test
    public void testWorkLifeLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectWorkLifeLink(); }
    @Test
    public void testWeAreNetflixLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectWeAreNetflixLink(); }
    @Test
    public void testSearchLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectSearchJobsLink(); }
    @Test
    public void testReadCultureLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectReadCultureLink(); }
    @Test
    public void testWhatsNextLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectWhatsNextLink(); }
    @Test
    public void getTitleCulture(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTitleCulture(); }
}
