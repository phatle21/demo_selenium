package testselenium.com.Bai13AlertPopupIframe;

import testselenium.com.common.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleAlert extends BaseTest {
    @Test
    public void demoHandleAlertAccept() throws InterruptedException {
        driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
        Thread.sleep(2000);

        // Click vào button có text la = JavaScript Alerts
      //  driver.findElement(By.xpath("//div[@class='mt-30 rounded']/p[text()='JavaScript Alerts']/button")).click();
        driver.findElement(By.xpath("(//button[.='Click Me'])[1]")).click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);
    }
}
