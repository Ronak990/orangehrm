import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firsttest {

    @Test(priority = 1)
    void setup() {
        System.out.println("Opening Browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is a login test");
    }

    @Test(priority = 3)
    void teardown() {
        System.out.println("Closing Browser");
    }


//        ChromeOptions options = new chromeoptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver("https://www.orangehrm.com/");

}
