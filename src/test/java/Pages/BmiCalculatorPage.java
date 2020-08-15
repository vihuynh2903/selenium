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
    protected By metricTab = By.xpath("//a[.='Metric Units']");
    protected By ageTxt = By.id("cage");
    protected By maleRad = By.id("csex1");
    private final By femaleRad = By.id("csex2");
    private final By heightTxt = By.id("cheightmeter");
    private final By weightTxt = By.id("ckg");
    private final By calculateBtn = By.xpath("//input[@value='Calculate']");
    private final By resultLbl = By.className("bigtext");
}
