package TestCases.locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTest {
    public static void main(String[] args) {
        // selenium keystrokes
        // Double click and Right Click
        // Hover

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver84.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][2]"))).perform();
    }
}
