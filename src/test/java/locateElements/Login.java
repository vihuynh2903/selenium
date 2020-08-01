package locateElements;

import org.openqa.selenium.support.How;

import static Supports.Browser.*;
import static locateElements.RedirectionTest.*;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        openBrowser("coccoc");  // https://apkily.com/coc-coc-beta
        visit("https://the-internet.herokuapp.com/login");
        //findElement(How.ID, "username");
        //findElement(How.ID, "password");
        fill(How.ID, "username","tomsmith");
        fill(How.ID, "password","SuperSecretPassword!");
        click(How.CSS, "[type='submit']");
    }
}
