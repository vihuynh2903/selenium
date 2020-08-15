package TestCases;

import Functions.BMICalculatorFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static Supports.Browser.*;


public class BodyMassIndexTest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        openBrowser("chrome");
        visit("https://www.calculator.net/bmi-calculator.html");

        BMICalculatorFunction calculator = new BMICalculatorFunction();

        calculator.selectMetricTab();
        calculator.fillForm("26", "female", "153", "70");
        Assert.assertEquals(calculator.getResult(), "BMI = 29.9 kg/m2   (Overweight)");
    }

}
