package TestCases.locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver84.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.id("hot-spot"))).perform();
    }
}
