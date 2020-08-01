package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.How;

import static Supports.Browser.*;

public class Tables {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver84.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");

        /*
        * int[] arr = new int[4][6]
        * how to find "4" and "6"
        * */
        int totalRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
        int columns = driver.findElements(By.xpath("//table[@id='table1']/thead/th")).size();
        //System.out.println("Rows = " + rows + " and columns = " + columns);

        //int tables[][] = new int[rows][columns];

        for (int row=1; row<=totalRows; row++){
            for (int col=1; col<=columns; col++){
                String cell = driver.findElement(By.xpath(String.format("//table[@id='table1']/tbody/tr[%d]/td[%d]",row,col))).getText();
                System.out.println(cell);
            }
        }

        /*for (int row = 1; row <= totalRows; row++){
            String lastName = driver.findElement(By.xpath(String.format("//table[@id='table1']/tbody/tr[%d]/td[%d]",row,1))).getText();
            String firstName = driver.findElement(By.xpath(String.format("//table[@id='table1']/tbody/tr[%d]/td[%d]",row,2))).getText();
            System.out.println(String.format("%s %s", firstName, lastName));
        }*/
    }
}
