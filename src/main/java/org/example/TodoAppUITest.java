package org.example;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TodoAppUITest {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
            // Set path to ChromeDriver if not already set in system
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EZEH CHIOMA CYNTHIA\\Desktop\\QA\\Task\\QA_AUTOMATION_TASK\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000"); // your React app
    }

    @Test
    public void testHomepageLoads() {
        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);
        assert driver.getPageSource().contains("Welcome to the Todo App");
    }
    public void takeScreenshot(String name) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        try {
            FileHandler.copy(srcFile, new File("screenshots/" + name + "_" + timestamp + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
