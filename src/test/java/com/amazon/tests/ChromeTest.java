package com.amazon.tests;

import com.amazon.utilities.Assertions;
import com.amazon.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChromeTest {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver=WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("https://www.google.com");
       Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        String firstVariable=driver.getTitle();
       driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        String secondVariable=driver.getTitle();
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println(Assertions.verifyEquals(driver.getTitle(), firstVariable));
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        System.out.println(Assertions.verifyEquals(driver.getTitle(), secondVariable));
        driver.close();


    }
}
