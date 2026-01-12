import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"sanity"})
    void Test1() {

        System.out.println("This is a test1...");
    }
    @Test(groups = {"sanity"})
    void Test2(){
        System.out.println("This is a test2...");
    }
    @Test(groups = {"regression"})
    void Test3(){
        System.out.println("This is a test3...");
    }
    @Test(groups = {"regression"})
    void Test4(){
        System.out.println("This is a test4...");
    }
    @Test(groups = {"sanity","regression"})
    void Test5(){
        System.out.println("This is a test5...");
    }
}
