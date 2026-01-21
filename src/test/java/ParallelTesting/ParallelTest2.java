package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest2 {

    WebDriver driver;

    @Test
    void LoginTest() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
