package locateElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.How;

import static Supports.Browser.*;

public class RedirectionTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[type='submit']")).click();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Redirect Link")).click();
        driver.findElement(By.id("redirect")).click();

        driver.findElement(By.linkText("200")).click();
        driver.findElement(By.xpath("//a[.='here']")).click();

        driver.findElement(By.xpath("//a[@href='status_codes/301']")).click();
        driver.findElement(By.xpath("//a[text()='here']")).click();

        driver.findElement(By.cssSelector("[href='status_codes/404']")).click();
        driver.navigate().back();

        driver.findElement(By.linkText("500")).click();
        backToPreviousPage();

        driver.findElement(By.linkText("here")).click();
    }
}
