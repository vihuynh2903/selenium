package locateElements;

import Supports.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;

import static Supports.Browser.*;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        openBrowser("chrome");
        visit("https://the-internet.herokuapp.com/login");
        //findElement(How.ID, "username");
        //findElement(How.ID, "password");
        fill(How.ID, "username","tomsmith");
        fill(How.ID, "password","SuperSecretPassword!");
        click(How.CSS, "[type='submit']");
    }
}
