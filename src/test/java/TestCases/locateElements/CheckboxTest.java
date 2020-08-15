package TestCases.locateElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.How;

import static Supports.Browser.*;

public class CheckboxTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //todo: check checkboxes are enable
        check(How.XPATH, "//form[@id='checkbox']/input[1]");
        uncheck(How.XPATH, "//form[@id='checkbox']/input[2]");
    }
}
