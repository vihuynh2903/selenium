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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class Browser {
    private static WebDriver driver;
    public static WebDriverWait wait;
    private static final int TIME_OUT_IN_SECOND = 60;
    //Selenium owner method

    public static WebDriver getDriver(){
        return driver;
    }

    public static void openBrowser(String name){
        if (name.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver84_MAC");
            driver = new ChromeDriver();
        }
        else if (name.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (name.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else if (name.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else if (name.equalsIgnoreCase("coccoc")){
            System.setProperty("webdriver.chrome.driver","drivers/coccocdriver.exe");
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

    public static WebElement findElement2(By by){
        return driver.findElement(by);
    }

    public static void fill(How by, String locator, String text){
        findElement(by, locator).sendKeys(text);
    }

    public static void fill2(By by, String text){
        findElement2(by).clear();
        findElement2(by).sendKeys(text);
    }

    public static void click(How by, String locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by.buildBy(locator))).click();
    }

    public static void click2(By by){
        findElement2(by).click();
    }

    public static void backToPreviousPage(){
        driver.navigate().back();
    }

    public static void check(How how, String locator) {
        if (!findElement(how, locator).isSelected())
            click(how, locator);
    }

    public static void uncheck(How how, String locator) {
        if (findElement(how, locator).isSelected())
            click(how, locator);
    }

    public static void selectByIndex(How how, String locator, int byIndex) {
        Select dropDown = new Select(findElement(how, locator));
        dropDown.selectByIndex(byIndex);
    }

    public static void selectByValue(How how, String locator, String byValue) {
        Select dropDown = new Select(findElement(how, locator));
        dropDown.selectByValue(byValue);
    }

    public static void selectByVisibleText(How how, String locator, String visibleText) {
        Select dropDown = new Select(findElement(how, locator));
        dropDown.deselectByVisibleText(visibleText);
    }

    public static void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public static void acceptWithText(String withText){
        driver.switchTo().alert().sendKeys(withText);
        driver.switchTo().alert().accept();
    }

    public static void  dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public static String getText(How how, String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(how.buildBy(locator))).getText();
    }
    public static String getText2(By by) {
        return findElement2(by).getText();
    }

}
