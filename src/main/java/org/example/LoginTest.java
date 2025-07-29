package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to your ChromeDriver if not in PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithValidCredentials() {
        driver.get("http://localhost:3000/login");
        driver.findElement(By.id("username")).sendKeys("cynthia");
        driver.findElement(By.id("password")).sendKeys("cynthia23");
        driver.findElement(By.id("loginBtn")).click();

        WebElement todoPage = driver.findElement(By.id("todoPage"));
        Assert.assertTrue(todoPage.isDisplayed(), "Todo page should be visible after login");
    }

    @Test
    public void loginWithInvalidCredentials() {
        driver.get("http://localhost:3000/login");
        driver.findElement(By.id("username")).sendKeys("chioma");
        driver.findElement(By.id("password")).sendKeys("chioma23");
        driver.findElement(By.id("loginBtn")).click();

        WebElement error = driver.findElement(By.id("loginError"));
        Assert.assertTrue(error.isDisplayed(), "Login error should be visible");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
