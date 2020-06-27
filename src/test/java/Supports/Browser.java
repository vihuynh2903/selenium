package Supports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.How;

import java.util.HashMap;
import java.util.Map;

public class Browser {
    private static WebDriver driver;
    //Selenium owner method
    public static void openBrowser(String name){
        if (name.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (name.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (name.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else if (name.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else if (name.equalsIgnoreCase("coccoc")){
            System.setProperty("webdriver.chrome.driver","drivers\\msedgedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Users\\TranQuoc\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");
            driver = new ChromeDriver(options);
        }
        else {
            throw new IllegalArgumentException("The browser '" + name + "' does not support");
        }
    }

    public static void openHeadlessBrowser(String name){
        if (name.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        }
        else if (name.equalsIgnoreCase("firefox")){
            FirefoxBinary firefoxBinary = new FirefoxBinary();
            firefoxBinary.addCommandLineOptions("--headless");
            System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary(firefoxBinary);
            driver = new FirefoxDriver(firefoxOptions);
        }
        else
            throw new IllegalArgumentException("The browser '" + name + "'does not support");
    }

    public static void openChromeMobile(String deviceName){
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", deviceName);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation",mobileEmulation);
        driver = new ChromeDriver(chromeOptions);

    }

    public static void visit(String url){
        driver.get(url);
    }

    public static WebElement findElement(How by, String locator){
        return driver.findElement(by.buildBy(locator));
    }

    public static void fill(How by, String locator, String text){
        findElement(by, locator).sendKeys(text);
    }

    public static void click(How by, String locator){
        findElement(by, locator).click();
    }
}