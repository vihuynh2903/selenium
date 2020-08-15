package TestCases;

import Functions.BMICalculatorFunction;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;

import static Supports.Browser.*;


public class BodyMassIndexTest{

    @Parameters ({"browser","url"})
    @BeforeMethod
    public static void preCondition(String browser, String url){
        WebDriver driver = getDriver();
        openBrowser(browser);
        visit(url);
    }

    @Test (description = "Validate BMI calculator")
    public static void metricCalculator() {
        BMICalculatorFunction calculator = new BMICalculatorFunction();

        calculator.selectMetricTab();
        calculator.fillForm("26", "female", "153", "70");
        Assert.assertEquals(calculator.getResult(), "BMI = 29.9 kg/m2   (Overweight)");
    }

}
