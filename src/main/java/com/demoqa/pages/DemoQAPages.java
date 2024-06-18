package com.demoqa.pages;

import lombok.*;
import org.testng.annotations.BeforeClass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class DemoQAPages extends BasePage{

    public TextBoxPage textBoxPage;

    public CheckBoxPage checkBoxPage;

    public PracticeFormPage practiceFormPage;

    public AlertPage alertPage;

    public ButtonsPage buttonsPage;

    public MenuPage menuPage;

    public ProgressBarPage progressBarPage;

    public SelectMenuPage selectMenuPage;

    public WebTablesPage webTablesPage;



    //  Метод для инициализации страниц
    public void setUp() {
        textBoxPage = new TextBoxPage();
        checkBoxPage = new CheckBoxPage();
        practiceFormPage = new PracticeFormPage();
        alertPage = new AlertPage();
        buttonsPage = new ButtonsPage();
        menuPage = new MenuPage();
        progressBarPage = new ProgressBarPage();
        selectMenuPage = new SelectMenuPage();
        webTablesPage = new WebTablesPage();




    }
}
