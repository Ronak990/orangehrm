package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class ParallelTest1 {

    WebDriver driver;
    @Test
    void logoTest() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginSlot = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class,'orangehrm-login-slot')]")));
        //WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']"));

        Assert.assertTrue(loginSlot.isDisplayed());
        Thread.sleep(5000);
    }
    @Test
    void HomePageTitle() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

        Thread.sleep(5000);
    }

    @AfterMethod
    void teardown(){
        driver.quit();

    }
}
