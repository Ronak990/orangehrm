import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class Secondtest {

    @Test(priority = 1)
    void setup() {
        System.out.println("Opening Browser");
    }

    @Test(priority = 3)
    void searchCustomer() {
        System.out.println("This is a search customer test");
    }

    @Test(priority = 2)
    void addCustomer() {
        System.out.println("This is a add customer test");
    }

    @Test(priority = 4)
    void teardown() {
        System.out.println("Closing Browser");
    }


}
