package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageobjects.NsePage;

public abstract class BaseTest {

     protected static WebDriver driver;
     protected static NsePage nsePage;

     private static String APP_URL="https://www.nseindia.com/";

    @BeforeClass
    @Parameters({"BrowserName"})
    public static void launchApplication(String browserName){
        setChromeProperty(browserName);
        System.out.println("Running on browser: " +browserName);
        driver = new ChromeDriver();
        driver.get(APP_URL);
        nsePage =new NsePage(driver);
        System.out.println(driver.getTitle());
    }

    private static void setChromeProperty(String browserName) {
        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:/Webdriver/chromedriver.exe");
        }
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
