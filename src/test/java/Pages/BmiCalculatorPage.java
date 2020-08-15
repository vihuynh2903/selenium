package Pages;

import org.openqa.selenium.By;

public class BmiCalculatorPage {
    /*locator naming convention
     * _TAB : --> tab
     * _TXT : --> text box or text field
     * _RAD : --> radio button
     * _BTN : --> button
     * _LBL : --> label
     * */
    public final By metricTab = By.xpath("//a[.='Metric Units']");
    public final By ageTxt = By.id("cage");
    public final By maleRad = By.id("csex1");
    public final By femaleRad = By.id("csex2");
    public final By heightTxt = By.id("cheightmeter");
    public final By weightTxt = By.id("ckg");
    public final By calculateBtn = By.xpath("//input[@value='Calculate']");
    public final By resultLbl = By.className("bigtext");
}
