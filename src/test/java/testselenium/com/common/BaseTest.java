package testselenium.com.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseTest {

//    public static WebDriver driver;
//
//    @BeforeMethod
//    public static void createDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        //Set timeout cho chờ đợi ngầm định 10s
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //Bổ trợ cho ổn định hơn
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//
//        System.out.println("createDriver: " + driver);
//
//    }
//
//    @AfterMethod
//    public static void closeDriver() {
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); //Reset timeout
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        if(driver != null) {
//            driver.quit();
//        }
//    }
//
//    public WebElement waitForElementVisible(By by, int timeout){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//
//        return driver.findElement(by);
//    }
//
//    public WebElement waitForElementPresent(By by, int timeout){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//        wait.until(ExpectedConditions.presenceOfElementLocated(by));
//
//        return driver.findElement(by);
//    }

    public WebDriver driver;
    public SoftAssert softAssert;

    @BeforeMethod
    @Parameters({"browser"})
    public void createDriver(@Optional("chrome") String browserName) {

        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                System.out.println("Launching Chrome browser...");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.out.println("Launching Firefox browser...");
                driver = new FirefoxDriver();
                break;
            case "edge":
                System.out.println("Launching Edge browser...");
                WebDriverManager.edgedriver().setup(); //Tải msedgedriver.exe tương ứng version của trình duyệt đang dùng
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser: " + browserName + " is invalid, Launching Chrome as browser of choice...");
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        softAssert = new SoftAssert();
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            softAssert.assertAll();
        }
    }

}