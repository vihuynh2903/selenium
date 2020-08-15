package Functions;

import Pages.BmiCalculatorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;

import static Supports.Browser.*;

public class BMICalculatorFunction extends BmiCalculatorPage{

    public void selectMetricTab(){
        //driver.findElement(By.xpath("//a[.=''Metric Units]")).click();
        click2(metricTab);
    }

    public void fillForm(String age, String gender, String height, String weight){
        fill2(ageTxt,age);
        if(gender.equalsIgnoreCase("male"))
            click2(maleRad);
        else
            click2(femaleRad);
        fill2(heightTxt,height);
        fill2(weightTxt,weight);
        click2(calculateBtn);
    }

    public String getResult(){
        return getText2(resultLbl);
    }
}
