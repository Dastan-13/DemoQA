package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//*[@id='nav']/li[2]/a")
    public WebElement menuElement;


}
