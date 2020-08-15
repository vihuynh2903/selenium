package TestCases;

import Functions.BMICalculatorFunction;
import org.junit.Before;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static Supports.Browser.*;


public class BodyMassIndexTest extends BMICalculatorFunction {
    @BeforeMethod
    public static void preCondition(){
        WebDriver driver = getDriver();
        openBrowser("chrome");
        visit("https://www.calculator.net/bmi-calculator.html");
    }

    @Test (description = "Validate BMI calculator")
    public static void metricCalculator() {
        BMICalculatorFunction calculator = new BMICalculatorFunction();

        calculator.selectMetricTab();
        calculator.fillForm("26", "female", "153", "70");
        Assert.assertEquals(calculator.getResult(), "BMI = 29.9 kg/m2   (Overweight)");
    }

}
