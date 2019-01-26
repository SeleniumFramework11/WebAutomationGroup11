package TestHomePage;

import HomePage.JobsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static org.testng.AssertJUnit.assertEquals;

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
    public void testURL() {
        TestLogger.log(getClass().getSimpleName()+ ": "+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String homeUrl = driver.getCurrentUrl();
        assertEquals(homeUrl, "https://jobs.netflix.com/"); }
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
    public void testReadCultureLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectReadCultureLink(); }
    @Test
    public void testSearchBoxInput() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchForJobsBox("QA Analyst"); }
    @Test
    public void testSearchBoxInput2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchForJobsBox("Programmer"); }
    @Test
    public void testBusinessDevelopment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectBusinessDevelopment(); }
    @Test
    public void testContent(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectContent(); }
    @Test
    public void testCustomerService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectCustomerServiceJobs(); }
    @Test
    public void testAnalyticsJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectAnalytics(); }
    @Test
    public void testDesignJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectDesign(); }
    @Test
    public void testEmployeeTechnology() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectEmployeeTechnologyJobs(); }
    @Test
    public void testEngineeringJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectEngineeringJobs(); }
    @Test
    public void testFacilitiesJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectFacilitiesJobs(); }
    @Test
    public void testLegalJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectLegalJobs(); }
    @Test
    public void testFinanceJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectFinanceJobs(); }
    @Test
    public void testProductCreativeJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectProductCreativeJobs(); }
    @Test
    public void testMarketingAndPRJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectMarketingAndPRJobs(); }
    @Test
    public void testTalentAndRecruitingJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectTalentAndRecruitingJobs(); }
    @Test
    public void testSecurityJobs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectTeamsLink();
        selectSecurityJobs(); }
}
