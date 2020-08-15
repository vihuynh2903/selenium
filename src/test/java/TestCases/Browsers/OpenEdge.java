package TestCases.Browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        new EdgeDriver();
    }
}
