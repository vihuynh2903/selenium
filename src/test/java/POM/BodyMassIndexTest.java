package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static POM.BMICalculatorPage.*;
import static Supports.Browser.*;


public class BodyMassIndexTest {
    public static void main(String[] args) {
        openBrowser("chrome");
        WebDriver driver = getDriver();
        visit("https://www.calculator.net/bmi-calculator.html");

        BMICalculatorPage calculator = new BMICalculatorPage();

        calculator.selectMetricTab();
        calculator.fillForm("26", "female", "153", "70");
        System.out.println(calculator.getResult());
    }

}
