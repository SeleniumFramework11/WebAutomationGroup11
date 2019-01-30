package homePage;

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
    public void initializeTest () {
        String getOsNameFromSystem = System.getProperty("os.name");
        System.out.println("Opening the browser Chrome");
        if (getOsNameFromSystem.contains("Windows 10")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nahida\\IdeaProjects\\WebAutomationGroup11\\Generic\\Driver\\chromedriver.exe");
        }else if (getOsNameFromSystem.contains("Mac")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nahida\\IdeaProjects\\WebAutomationGroup11\\Generic\\Driver\\chromedriver");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        driver.get("https://www.macys.com/");             //put your website, hbo Pass
        driver.manage().window().fullscreen();
    }
    @AfterMethod
    public void  tearDownTest (){
        System.out.println("Closing the browser Chrome");
        driver.quit();
    }
    public void brokenLink ()throws IOException {
        //Step:1- Get the lists of all links and images
        List<WebElement> LinksList = driver.findElements(By.tagName("a") ); // all links come with By.tagName by 'a'
        LinksList.addAll(driver.findElements(By.tagName("img"))); // all image links come with img

        System.out.println("Total number of Links and Images------> "+LinksList.size());

        List<WebElement>activeLinks =  new ArrayList<WebElement>(); // webElement symbol is ~

        //Step:2-Iterate LinksLists exclude all Links and images which does not have any 'href' attribute
    for (int i =0; i<LinksList.size(); i++){
       System.out.println(LinksList.get(i).getAttribute("href"));
        if(LinksList.get(i).getAttribute("href")!=null && ( ! LinksList.get(i).getAttribute("href").contains("javascript") && ( ! LinksList.get(i).getAttribute("href").contains("mailto")))){
            activeLinks.add(LinksList.get(i));
        }
       }
        System.out.println("Total number of active Links and Images------> "+activeLinks.size());

        //Step:3- Check the 'href' url, with http connection api
        for (int j=0; j<activeLinks.size(); j++){
            HttpURLConnection connection= (HttpURLConnection) new URL(activeLinks.get(j). getAttribute("href")).openConnection();
            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href")+"---->"+response);
        }
    }
}
