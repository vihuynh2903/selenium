package TestCases.locateElements;

import static Supports.Browser.openBrowser;
import static Supports.Browser.visit;

public class BasicAuthenticationTest {
    public static void main(String[] args) {
        openBrowser("chrome");
        visit("https://the-internet.herokuapp.com/basic_auth");


    }
}
