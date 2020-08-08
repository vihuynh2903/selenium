package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;

import static Supports.Browser.*;

public class BMICalculatorPage {

    /*locator naming convention
     * _TAB : --> tab
     * _TXT : --> text box or text field
     * _RAD : --> radio button
     * _BTN : --> button
     * _LBL : --> label
     * */
    private final By metricTab = By.xpath("//a[.=''Metric Units]");
    private final By ageTxt = By.id("cage");
    private final By maleRad = By.id("csex1");
    private final By femaleRad = By.id("csex2");
    private final By heightTxt = By.id("cheightmeter");
    private final By weightTxt = By.id("ckg");
    private final By calculateBtn = By.xpath("//input[@value='Calculate']");
    private final By resultLbl = By.className("bigtext");


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
