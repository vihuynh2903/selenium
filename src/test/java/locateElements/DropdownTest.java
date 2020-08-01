package locateElements;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static Supports.Browser.*;

public class DropdownTest {
    public static void main(String[] args) {
        openBrowser("chrome");
        visit("https://the-internet.herokuapp.com/dropdown");

        selectByIndex(How.ID, "dropdown", 1); // index
        selectByValue(How.ID, "dropdown", "2"); //attribute
        //selectByVisibleText(How.ID, "dropdown", "Option 2"); // text
    }
}
