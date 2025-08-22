package testselenium.com.Bai8_Checkbox_Radio_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import testselenium.com.common.BaseTest;

import javax.swing.*;

public class DemoCheckbox extends BaseTest {

    // drag and drop ở web 1
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");
        Thread.sleep(1000);

        WebElement elementFrom1 = driver.findElement(By.xpath("//span[.='Draggable 1']"));
        WebElement elementFrom2 = driver.findElement(By.xpath("//span[.='Draggable 2']"));

        WebElement elementTo = driver.findElement(By.xpath("//div[@id='mydropzone']"));
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.dragAndDrop(elementFrom1, elementTo).perform();
        Thread.sleep(1000);
        action.dragAndDrop(elementFrom2, elementTo).perform();
        Thread.sleep(2000);

    }
}
