package TestCases.locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver84.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions mouse = new Actions(driver);
        mouse.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).perform();
    }
}
