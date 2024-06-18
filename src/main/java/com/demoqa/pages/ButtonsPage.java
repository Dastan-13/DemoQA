package com.demoqa.pages;

import com.demoqa.entities.TextBoxEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage{

    @FindBy(id="doubleClickBtn")
    public WebElement doubleClickBtn;

    @FindBy(id="doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id="rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(id="rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickBtn;

    @FindBy(xpath = "//p[text()='You have done a dynamic click']")
    public WebElement clickMessage;





}
