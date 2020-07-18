package locateElements;
import org.openqa.selenium.support.How;

import static Supports.Browser.*;

public class locatorExample {
    public static void addRemoveElements(){
        visit("https://the-internet.herokuapp.com/");
        click(How.LINK_TEXT,"Add/Remove Elements");
    }
}
