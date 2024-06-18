package com.demoqa.Z_Others.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class May22DemoQA {
@Test(description = "locatorsTest")
    public void findByXpath() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement fullnameElement = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullnameElement.sendKeys("Dmitriy Petrov");

        WebElement emailElement = driver.findElement(By.xpath("//input[@type='email']"));
        emailElement.sendKeys("dm.petrov@gmail.com");

        WebElement currentAddressElement = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAddressElement.sendKeys("Lenina 231");

        WebElement permanentAddressElement = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressElement.sendKeys("Panfilova 65");


        WebElement submitElement = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submitElement.click();

    String expectedName = "Ivan Petrov";
    String expectedEmail = "dm.petrov@gmail.com";
    String expectedCurrentAddress = "Lenina 54";
    String expectedPermanentAddress = "Panfilova 65";

    String actualName = fullnameElement.getAttribute("value");
    String actualEmail = emailElement.getAttribute("value");
    String actualCurrentAddress = currentAddressElement.getAttribute("value");
    String actualPermanentAddress = permanentAddressElement.getAttribute("value");

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(actualName,expectedName,"Неверное значение для поля Full Name:  ");
    softAssert.assertEquals(actualEmail, expectedEmail, "Неверное значение для поля Email:  ");
    softAssert.assertEquals(actualCurrentAddress, expectedCurrentAddress, "Неверное значение для поля Current Address:  ");
    softAssert.assertEquals(actualPermanentAddress, expectedPermanentAddress, "Неверное значение для поля Permanent Address:    ");

    softAssert.assertAll();

    driver.close();
    driver.quit();

    }

}
