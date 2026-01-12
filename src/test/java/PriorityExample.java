import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 0)
    void Testone(){
        System.out.println("This is a test1");
    }
    @Test(priority = 1)
    void Testtwo(){
        System.out.println("This is a test2");
    }
    @Test(priority = 2)
    void Testthree(){
        System.out.println("This is a test3");
    }
    @Test(priority = 3, enabled = false)
    void Testfour(){
        System.out.println("This is a test4");
    }
}
