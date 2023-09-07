package com.amazon.tests.day01;

import com.amazon.utilities.Assertions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.List;
import java.util.function.Function;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://checkboxrace.com/");
        for (WebElement element : driver.findElements(By.xpath("//input"))) {
            element.click();
        }
        Thread.sleep(10000);

    }
}
