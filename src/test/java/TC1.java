import org.testng.annotations.*;

public class TC1 {

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
    void test1(){
        System.out.println("This is a test1");
    }

    @Test
    void test2(){
        System.out.println("This is a test2");
    }

    @BeforeTest
    void beforetest(){
        System.out.println("This will execute before the test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after the test");
    }

}
