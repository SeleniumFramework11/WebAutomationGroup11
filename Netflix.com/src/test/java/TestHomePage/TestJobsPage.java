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
        selectTeamsLink();
    }
    @Test
    public void testLocationsLink(){ selectLocationsLink(); }
    @Test
    public void testDiversityLink(){
        selectDiversityLink();
    }
    @Test
    public void testWorkLifeLink(){ selectWorkLifeLink(); }
    @Test
    public void testWeAreNetflixLink(){
        selectWeAreNetflixLink();
    }
    @Test
    public void testSearchLink(){
        selectSearchJobsLink();
    }
    @Test
    public void testReadCultureLink(){
        selectReadCultureLink();
    }
    @Test
    public void testWhatsNextLink(){
        selectWhatsNextLink();
    }
    @Test
    public void getTitleCulture(){
        getTitleCulture();
    }
}
