import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeclass(){
        System.out.println("This will execute before class");
    }

    @AfterClass
    void afterclass(){
        System.out.println("This will execute after class");
    }

    @BeforeMethod
    void beforemethod(){
        System.out.println("This will execute before method");
    }

    @AfterMethod
    void afteremethod(){
        System.out.println("This will execute after method");
    }

    @Test
    void test4(){
        System.out.println("This is a test4");
    }

    @Test
    void test3(){
        System.out.println("This is a test3");
    }

    @BeforeSuite
    void beforesuite(){
        System.out.println("This will execute before suite");
    }

    @AfterSuite
    void afteresuite(){
        System.out.println("This will execute after suite");
    }

}
