package TestCases.locateElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver84.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
        driver.switchTo().frame(driver.findElement(By.name("frame-left")));
        System.out.println(driver.findElement(By.xpath("html/body")).getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        System.out.println(driver.findElement(By.xpath("html/body")).getText());

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.xpath("html/body")).getText());
    }
}
