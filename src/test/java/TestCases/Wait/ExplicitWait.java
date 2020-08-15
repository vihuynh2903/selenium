package TestCases.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver84.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebDriverWait wait = new WebDriverWait(driver, 60);

        driver.findElement(By.xpath("//button[.='Start']")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
        System.out.println(driver.findElement(By.id("finish")).getText());
    }
}