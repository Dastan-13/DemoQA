package com.demoqa.Z_Others.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class WithProviderTextBox {
     WebDriver driver = new ChromeDriver();

        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/text-box");
        }

        @AfterMethod
        public void metClose() {
            driver.close();
            driver.quit();
        }

@DataProvider(name = "name")
public Object[][] provideNames() {
            return new Object[][] {
                    {"Aijan"},
                    {"Kanykey"},
                    {"Helen"},
                    {"Alina"},
                    {"Bektur"}
            };
}

        @Test(dataProvider = "name")
        void testBoxTest1(String name) {
            WebElement fullnameElement = driver.findElement(By.id("userName"));
            fullnameElement.sendKeys(name);
        }


        @DataProvider(name = "email")
        public Object[][] provideEmail() {
            return new Object[][] {
                    {"akydybaeva@gmail.com"},
                    {"kani.isakova@gmail.com"},
                    {"helen.smith@gmail.com"},
                    {"a.ivanova@gmail.com"},
                    {"bekakydybaev@gmail.com"}
            };
        }

        @Test(dataProvider = "email")
        public void testBoxTest2(String email) {
            WebElement emailElement = driver.findElement(By.id("userEmail"));
            emailElement.sendKeys(email);
        }

        @DataProvider(name = "currentAddress")
        public Object[][] provideCurrentAdress() {
            return new Object[][] {
                    {"KG, Tokmok 25"},
                    {"KG, Osh 127"},
                    {"USA, Toronto"},
                    {"RU, Moscow 217"},
                    {"KG, Tokmok 364"},
            };
        }

        @Test(dataProvider = "currentAddress")
        public void testBoxTest3(String currentAdress) {
            WebElement currentaddressElement = driver.findElement(By.id("currentAddress"));
            currentaddressElement.sendKeys(currentAdress);
        }

        @DataProvider(name = "permanentAddress")
        public Object[][] providePermanentAdress() {
            return new Object[][] {
                    {"KG, Bishkek 54"},
                    {"KG, Osh 127"},
                    {"KG, Bishkek 98"},
                    {"RU, Moscow 217"},
                    {"USA, New York"},
            };
        }

        @Test(dataProvider = "permanentAddress")
        public void testBoxTest4(String permanentAddress) {
            WebElement permanentaddressElement = driver.findElement(By.id("permanentAddress"));
            permanentaddressElement.sendKeys(permanentAddress);
        }


    @DataProvider(name = "data")
    public Object[][] provideData() {
        return new Object[][] {
                {"Aijan", "akydybaeva@gmail.com", "KG, Tokmok 25", "KG, Bishkek 54"},
                {"Kanykey", "kani.isakova@gmail.com", "KG, Osh 127", "KG, Osh 127"},
                {"Helen", "helen.smith@gmail.com", "USA, Toronto", "KG, Bishkek 98"},
                {"Alina", "a.ivanova@gmail.com", "RU, Moscow 217", "RU, Moscow 217"},
                {"Bektur", "bekakydybaev@gmail.com", "KG, Tokmok 364", "USA, New York"}

        };
    }

        @Test(dataProvider = "data")
        public void testBoxTest5(String fullname, String email, String currentAdress, String permanentAdress) throws InterruptedException {
            WebElement fullnameElement = driver.findElement(By.id("userName"));
            fullnameElement.sendKeys(fullname);

            WebElement emailElement = driver.findElement(By.id("userEmail"));
            emailElement.sendKeys(email);

            WebElement currentaddressElement = driver.findElement(By.id("currentAddress"));
            currentaddressElement.sendKeys(currentAdress);

            WebElement permanentaddressElement = driver.findElement(By.id("permanentAddress"));
            permanentaddressElement.sendKeys(permanentAdress);

            WebElement submitElement = driver.findElement(By.id("submit"));
            submitElement.click();

            Thread.sleep(3000);
        }

    }



