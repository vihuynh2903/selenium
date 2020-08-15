package TestCases.locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver84.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Hello baby");
    }
}
