package testselenium.com.Bai15Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestWait {
    WebDriver driver;
    @Test(priority = 1)
    public void demoImplicitWait() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://hrm.anhtester.com/");

        driver.findElement(By.id("iusername")).sendKeys("admin_example");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // click menu du an
        driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();

        Thread.sleep(2000);
        driver.quit();

    }
}
