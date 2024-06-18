package com.demoqa.Z_Others.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class May22CoverSamolet {
@Test
        public void NambaFoodTest() {
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();
    driver.get("https://dostavka312.kg/");

    WebElement edaElement = driver.findElement(By.xpath("//img[@alt='edaG']"));
    edaElement.click();

    WebElement kuhnyaElement = driver.findElement(By.xpath("//img[contains(@src,'kuhni.png')]"));
    kuhnyaElement.click();

    WebElement menuElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/article[2]/div/div/div[2]/div[4]/div/div[2]/div[2]/a"));
    menuElement.click();

    WebElement addElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/article[2]/div/div/div[2]/div[12]/div/div[2]/form/button"));
    addElement.click();

    WebElement basketElement = driver.findElement(By.xpath("//div[@class='pulse2']"));
    basketElement.click();

    WebElement acceptElement = driver.findElement(By.xpath("//a[text()='Оформить']"));
    acceptElement.click();

    WebElement nameElement = driver.findElement(By.xpath("//input[@placeholder='Ваше имя']"));
    nameElement.sendKeys("Айжан");
    nameElement.click();

    WebElement addressEleement = driver.findElement(By.xpath("//input[@name='address']"));
    addressEleement.sendKeys("Токтогула 18");
    addressEleement.click();

    WebElement numberElement = driver.findElement(By.xpath("//input[@placeholder='Ваш телефон']"));
    numberElement.sendKeys("787565454");
    numberElement.click();

    WebElement changeElement = driver.findElement(By.xpath("//input[@name='money']"));
    changeElement.sendKeys("1000");
    changeElement.click();

    WebElement commentsElement = driver.findElement(By.xpath("//textarea[@placeholder='Примечания и специальные запросы']"));
   commentsElement.sendKeys("Доставить через 2 часа");
    commentsElement.click();

    WebElement buttonElement = driver.findElement(By.xpath("//button[normalize-space(text())='Заказать']"));
    buttonElement.click();

    String endElement = driver.findElement(By.xpath("//h2[text()='Благодарим Вас за заказ! Для подтверждения заказа в течение 5 минут с Вами свяжется оператор.']")).getText();
    System.out.println(endElement);

    driver.close();
    driver.quit();


}

}
