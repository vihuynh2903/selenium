package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;

public class OpenIE {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","drivers\\IEDriverServer.exe");
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("ignoreZoomSetting", true);
        WebDriver driver = new InternetExplorerDriver(caps);
        //driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
    }
}
