package TestCases.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenCocCoc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\TranQuoc\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");
        WebDriver driver = new ChromeDriver(options);
    }
}
