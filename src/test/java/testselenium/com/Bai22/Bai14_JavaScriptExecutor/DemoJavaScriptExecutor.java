package testselenium.com.Bai22.Bai14_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testselenium.com.common.BaseTest;

public class DemoJavaScriptExecutor extends BaseTest {
    @Test
    public void demoClickElementWithJavaScriptExecutor() throws InterruptedException {
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

       // WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
       // WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));

      // js.executeScript("arguments[0].")
        js.executeScript("document.getElementById('email').setAttribute('value', 'admin@example.com');");
        js.executeScript("document.getElementById('password').setAttribute('value', '123456');");
        Thread.sleep(3000);

        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();
        Thread.sleep(3000);


    }

    @Test
    public void demoClickElementWithJavaScriptExecutor_CMS() throws InterruptedException {

    }

    @Test
    public void demoScrollToElement() throws InterruptedException {
        driver.get("https://anhtester.com/");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Tất Cả Khóa Học')]"));
        js.executeScript("arguments[0].scrollIntoView(false);", element);
        Thread.sleep(5000);

    }

}
