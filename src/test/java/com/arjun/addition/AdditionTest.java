package com.arjun.addition;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class AdditionTest {

    @Test
    public void testAddition() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open your local HTML file
        driver.get("file://" + System.getProperty("user.dir") + "/src/main/webapp/index.html");

        // Find input fields
        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));

        // Enter numbers
        num1.sendKeys("5");
        num2.sendKeys("7");

        // Click Add button
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(20000);

        // Verify result
        String result = driver.findElement(By.id("result")).getText();
        assertTrue(result.contains("12"));

        driver.quit();
    }
}