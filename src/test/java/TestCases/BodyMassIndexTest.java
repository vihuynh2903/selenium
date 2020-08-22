package TestCases;

import Functions.BMICalculatorFunction;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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

    @DataProvider(name = "bmiTestData")
    // Object: return any data type
    public static Object[][] testData(){
        return new Object[][]{
                {"26", "male", "180", "30", "BMI = 9.3 kg/m2   (Severe thinness)"},
                {"26", "male", "180", "55", "BMI = 17 kg/m2   (Moderate thinness)"},
                {"26", "male", "180", "60", "BMI = 18.5 kg/m2   (Mild thinness)"},
                {"26", "male", "180", "75", "BMI = 23.1 kg/m2   (Normal)"},
                {"26", "male", "180", "85", "BMI = 26.2 kg/m2   (Overweight)"},
                {"26", "male", "180", "100", "BMI = 30.9 kg/m2   (Obese Class I)"},
                {"26", "male", "180", "120", "BMI = 37 kg/m2   (Obese Class II)"},
                {"26", "male", "180", "150", "BMI = 46.3 kg/m2   (Obese Class III)"}
        };
    }

    @Test (description = "Validate BMI calculator", dataProvider = "bmiTestData")
    public static void perform(String age, String gender, String height, String weight, String ExpectedResult) {
        BMICalculatorFunction calculator = new BMICalculatorFunction();

        calculator.selectMetricTab();
        calculator.fillForm(age, gender, height, weight);
        Assert.assertEquals(calculator.getResult(), ExpectedResult);
    }
}
