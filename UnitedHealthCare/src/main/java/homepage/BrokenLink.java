package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLink {
    public static WebDriver driver = null;
    @BeforeMethod
    public void initializeTest() {
        String getOSNameFromSystem = System.getProperty("os.name");
        System.out.println("Opening the browser Chrome");
        if (getOSNameFromSystem.contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\orfat\\Desktop\\TechnicalQuestions\\driver\\chromedriver.exe");
        }else if (getOSNameFromSystem.contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\orfat\\Desktop\\TechnicalQuestions\\driver\\chromedriver");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.get("https://www.uhc.com");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownTest() {
        System.out.println("Closing the browser Chrome");
        driver.quit();
    }
    public void brokenLink() throws IOException {
        //Step1- Get the list of links and images
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        linksList.addAll(driver.findElements(By.tagName("img")));
        System.out.println("Total number of links and images---->>" +linksList.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();

        //Step2-->Iterate linksList exclude all links/imageswhich doesn't have any href attribute
        for (int i = 0; i<linksList.size(); i++) {
            System.out.println( linksList.get(i).getAttribute("href"));
            if (linksList.get(i).getAttribute("href") != null && (!linksList.get(i).getAttribute("href").contains("javascript") && (!linksList.get(i).getAttribute("href").contains("mailto")))){
                activeLinks.add(linksList.get(i));
            }
        }
        System.out.println("Total number of active links and images---->>" +activeLinks.size());

        //Step3--> Check the href url, with http connection api
        for (int j = 0; j<activeLinks.size(); j++) {

            HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();

            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href") +"---->>>"+ response);
        }
    }
}
