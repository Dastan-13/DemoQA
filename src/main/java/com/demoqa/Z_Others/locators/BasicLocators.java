package com.demoqa.Z_Others.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicLocators {
    private  WebDriver driver;

    @Test(description = "Find by 10")
    void findByIdTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

//        WebElement fullname = driver.findElement(By.tagName("input"));
//        fullname.sendKeys("Aijan");
//
//        String textBoxText = driver.findElement(By.id("userName-label")).getText();
//        System.out.println(textBoxText);

//        Home

        WebElement homeLink = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        homeLink.sendKeys("HJGHJGJK");
//        homeLink.click();



        Thread.sleep(3000);


//driver.quit();



    }

}
