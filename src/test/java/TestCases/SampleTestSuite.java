package TestCases;

import org.testng.annotations.Test;

public class SampleTestSuite {
    @Test(groups = {"smoke"})
    void tc01(){
        System.out.println("the first test");
    }

    @Test
    void tc02(){
        System.out.println("the second test");
    }

    @Test(groups = {"chrome"})
    void tc03(){
        System.out.println("the third test");
    }

    @Test
    void tc04(){
        System.out.println("the fourth test");
    }

    @Test
    void tc05(){
        System.out.println("the fifth test");
    }
}
