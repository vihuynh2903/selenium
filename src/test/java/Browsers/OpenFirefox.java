package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
    }
}
