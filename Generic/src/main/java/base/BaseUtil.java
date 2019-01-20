package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseUtil {
    public String saucelabs_username = "";
    public String saucelabs_accesskey = "";
    public String browserstack_username= "";
    public String browserstack_accesskey = "";
    public static WebDriver driver = null;
    public static Actions builder = null;
    public static WebDriverWait wait;
    public String URL = null;

    @Parameters({"useCloudEnv","cloudEnvName","url", "OS", "os_version","browser", "browserversion"})
    @BeforeMethod
    public void setup(@Optional ("useCloudEnv")boolean useCloudEnv, @Optional ("cloudEnvName") String cloudEnvName,@Optional("url") String url, @Optional ("browser") String browser, @Optional ("browserVersion") String browserVersion,
                      @Optional ("OS") String OS, @Optional ("os_version") String os_version) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/alrafifahd96gmail.com/Desktop/GroupWebAutomation/WebAutomationGroup11/Generic/Driver/chromedriver");
        if(useCloudEnv==true){
            if(cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName,browserstack_username,browserstack_accesskey,OS,os_version, browser, browserVersion);
            }else if (cloudEnvName.equalsIgnoreCase("saucelabs")){
                getCloudDriver(cloudEnvName,saucelabs_username, saucelabs_accesskey,OS,os_version, browser, browserVersion);
            }
        }else{
            getLocalDriver(OS, browser,browserVersion);
        }
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        builder = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("https://www.walmart.com/");
        driver.manage().window().fullscreen();
    }
    @Parameters
    public void setUrl(String URL){
        this.URL = URL;
        driver.get(URL);
    }
    public WebDriver getLocalDriver(@Optional String OS, String browser, String browserVersion){
        if(browser.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("Mac")){

                System.setProperty("webdriver.chrome.driver", "...Generic/Driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows"))
            {
                System.setProperty("webdriver.chrome.driver", ".../WebAutomationGroup11/Generic/Driver/chromedriver.exe");

                System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows"))
            {
                System.setProperty("webdriver.chrome.driver", ".../WebAutomationGroup11/Generic/Driver/chromedriver.exe");

            }
            driver = new ChromeDriver();}
        return driver;
    }

    public WebDriver getCloudDriver(String envName,String envUsername, String envAccessKey,String OS, String os_version,String browser,
                                    String browserVersion)throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser",browser);
        cap.setCapability("browser_version",browserVersion);
        cap.setCapability("OS", OS);
        cap.setCapability("os_version", os_version);
        if(envName.equalsIgnoreCase("Saucelabs")){
            //resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if(envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }
    public static boolean isPopUpWindowDisplayed(WebDriver driver1, String locator) {
        boolean value = driver1.findElement(By.cssSelector(locator)).isDisplayed();
        return value;
    }
    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            ex1.printStackTrace();
        }
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception ex2) {
            ex2.printStackTrace();
        }
        try {
            driver.findElement(By.id(locator)).click();
        } catch (Exception ex3) {
            ex3.printStackTrace();
        }
        try {
            driver.findElement(By.className(locator)).click();
        } catch (Exception ex4) {
            ex4.printStackTrace();
        }
    }
    public void navigateBack() {
        driver.navigate().back();
    }
    public void navigateForward() {
        driver.navigate().forward();
    }
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    //iFrame Handle
    public void iframeHandle(WebElement element) {
        driver.switchTo().frame(element);
    }


    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) { extent = ExtentManager.getInstance();}
    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace (Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getStartMillis()));

        for (String group: result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }
        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passes");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();

    }
    public void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("MM.dd.yyyy-HH:mma");
        Date date = new Date();
        df.format(date);
    }
    @AfterSuite
    public void generateReport() { extent.close();}
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    public void waitToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitToBeVisible(String xpathLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }
    public void setUpBrowserStack() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser","chrome");
        cap.setCapability("browser_version","68.0");
        cap.setCapability("os", "OS X"); //put your operating system
        cap.setCapability("os_version", "Sierra"); //put your version
        String browserStackUrl = "www.walmart.com";
        URL serverUrl = new URL(browserStackUrl);
        driver = new RemoteWebDriver(serverUrl,cap);
    }
    public static String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    public void typeOnInputField(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public static void sleepFor(int sec)throws InterruptedException {
        Thread.sleep(sec * 1000);
    }
    public List<String> getTextFromWebElements(WebElement element){
        List<WebElement> elements = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        for(WebElement e:elements){
            text.add(e.getText());
        }
        return text;
    }
}
