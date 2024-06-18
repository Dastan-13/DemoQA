package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.PracticeFormEntity;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class PracticeFormPage extends BasePage {

    @FindBy(css = "#firstName")
    public WebElement firstNameInput;

    @FindBy(css = "#lastName")
    public WebElement lastNameInput;

    @FindBy(css = "#userEmail")
    public WebElement emailInput;

    @FindBy(xpath = "(//div[@class = 'custom-control custom-radio custom-control-inline'])[1]")
    public WebElement maleGenderClick;

    @FindBy(xpath = "(//div[@class = 'custom-control custom-radio custom-control-inline'])[2]")
    public WebElement femaleGenderClick;

    @FindBy(xpath = "(//div[@class = 'custom-control custom-radio custom-control-inline'])[3]")
    public WebElement otherGenderClick;

    @FindBy(css = "#userNumber")
    public WebElement mobileNumberInput;

    @FindBy(css = "#dateOfBirthInput")
    public WebElement dateInput;

    @FindBy(css = "#subjectsInput")
    public WebElement subjInput;

    @FindBy(id = "hobbies-checkbox-1")
    public WebElement sportsHobbyClick;

    @FindBy(id = "hobbies-checkbox-2")
    public WebElement readingHobbyClick;

    @FindBy(id = "hobbies-checkbox-3")
    public WebElement musicHobbyClick;

    @FindBy(css = "#uploadPicture")
    public WebElement pictureInput;

    @FindBy(css = "#currentAddress")
    public WebElement addressInput;

    @FindBy(xpath = "//div[text()='Select State']")
    public WebElement stateInput;

    @FindBy(xpath = "//div[text()='NCR']")
    public WebElement nsrStateInput;

    @FindBy(xpath = "//div[text()='Uttar Pradesh']")
    public WebElement uttarStateInput;

    @FindBy(xpath = "//div[text()='Haryana']")
    public WebElement haryanaStateInput;

    @FindBy(xpath = "//div[text()='Rajasthan']")
    public WebElement rajasthanStateInput;


    @FindBy(xpath = "//div[text()='Select City']")
    public WebElement cityInput;

    // города штата NCR
    @FindBy(xpath = "//div[text()='Delhi']")
    public WebElement delhiCityClick;

    @FindBy(xpath = "//div[text()='Gurgaon']")
    public WebElement gurgaonCityClick;

    @FindBy(xpath = "//div[text()='Noida']")
    public WebElement noidaCityClick;

    // города штата Uttar Pradesh
    @FindBy(xpath = "//div[text()='Agra']")
    public WebElement agraCityClick;

    @FindBy(xpath = "//div[text()='Lucknow']")
    public WebElement lucknowCityClick;

    @FindBy(xpath = "//div[text()='Merrut']")
    public WebElement merrutCityClick;

    // города штата Haryana
    @FindBy(xpath = "//div[text()='Karnal']")
    public WebElement karnalCityClick;

    @FindBy(xpath = "//div[text()='Panipat']")
    public WebElement panipatCityClick;

    // города штата Rajasthan
    @FindBy(xpath = "//div[text()='Jaipur']")
    public WebElement jaipurCityClick;

    @FindBy(xpath = "//div[text()='Jaiselmer']")
    public WebElement jaiselmerCityClick;


    @FindBy(xpath = "//*[@id='submit']")
    public WebElement submitBtn;

    @FindBy(className = "react-datepicker__input-container")
    public WebElement datePickerBtn;


    public PracticeFormPage fillUpPracticeForm(PracticeFormEntity practiceFormEntity) {
        webElementActions.sendKeys(firstNameInput, practiceFormEntity.getFirstName())
                .sendKeys(lastNameInput, practiceFormEntity.getLastName())
                .sendKeys(emailInput, practiceFormEntity.getUserMail())
                .click(randomGenderClick())
                .sendKeys(mobileNumberInput, practiceFormEntity.getMobileNumber())
//                .sendKeys(dateInput, practiceFormEntity.getDate())
                .sendKeysWithEnter(subjInput, practiceFormEntity.getSubjects())
                .sendKeysWithEnter(subjInput, practiceFormEntity.getSubjects())
                .sendKeysWithEnter(subjInput, practiceFormEntity.getSubjects())
                .jsClick(randomHobbiesClick()) // с простым кликом не происходил переход после предыдущего метода
                .sendKeys(pictureInput, practiceFormEntity.getPicture())
                .sendKeys(addressInput, practiceFormEntity.getAddress())
                .click(stateInput) // Открытие списка штатов
                .click(randomStateElement()) // Выбор случайного элемента состояния
                .click(cityInput) // Открытие списка городов
                .click(randomCityElement()) // Выбор случайного города
                .click(submitBtn);


        return this;
    }

@Step("Select Date Month and Year {0}")
    public PracticeFormPage selectDateMonthYear(String dateMonthYear) { // 04 Jun 2024

        String [] dateMonthYearParts = dateMonthYear.split(" ");
        String date = dateMonthYearParts[0];
        String month = dateMonthYearParts[1];
        String year = dateMonthYearParts[2];

        webElementActions.click(datePickerBtn);

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));

        WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-select")));

        WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));

dropdownHelper.selectByVisibleText(monthDropDown,month)
        .selectByVisibleText(yearDropDown,year);

WebElement day = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'react-datepicker__day') and not (contains(@class,'react-datepicker__day--outside-month')) and text()='" + date  + "']")));
webElementActions.click(day);
return this;

    }


    private final Random random = new Random();
    private String selectedState; // Сохраняет выбранный штат


// Создаем метод для рандомного выбора гендера
    private WebElement randomGenderClick() {
        int gender = random.nextInt(3); // 0, 1, или 2
        return switch (gender) {
            case 0 -> maleGenderClick;
            case 1 -> femaleGenderClick;
            default -> otherGenderClick;
        };
    }

    // Создаем метод для рандомного выбора хобби
    private WebElement randomHobbiesClick() {
        int hobby = random.nextInt(3); // 0, 1, или 2
        return switch (hobby) {
            case 0 -> sportsHobbyClick;
            case 1 -> readingHobbyClick;
            default -> musicHobbyClick;
        };
    }

//    Создаем метод для рандомного выбора штата и сохраняем состояние выбранного штата, от которого зависит выбор городов
    private WebElement randomStateElement() {
        int state = random.nextInt(4); // Генерируем случайное число от 0 до 3
        return switch (state) { // Используем выражение switch для определения выбранного штата
            case 0 -> {
                selectedState = "NCR"; // Если выбран 0, то штат - NCR
                yield nsrStateInput; // Возвращаем элемент для выбора штата NCR.
                // yield - это ключевое слово, чтобы вернуть значение из блока switch.
            }
            case 1 -> {
                selectedState = "Uttar Pradesh";
                yield uttarStateInput;
            }
            case 2 -> {
                selectedState = "Haryana";
                yield haryanaStateInput;
            }
            default -> {
                selectedState = "Rajasthan";
                yield rajasthanStateInput;
            }
        };
    }

// Создаем метод для рандомного выбора города в зависимости от selectedState
    private WebElement randomCityElement() {
        return switch (selectedState) { // Используем значение selectedState для определения штата
            case "NCR" -> {
                int city = random.nextInt(3); // Генерируем случайное число, в зависимости от количества городов в выбранном штате
                yield switch (city) { // Используем выражение switch для выбора города в зависимости от случайного числа
                    case 0 -> delhiCityClick;
                    case 1 -> gurgaonCityClick;
                    default -> noidaCityClick;
                };
            }
            case "Uttar Pradesh" -> {
                int city = random.nextInt(3);
                yield switch (city) {
                    case 0 -> agraCityClick;
                    case 1 -> lucknowCityClick;
                    default -> merrutCityClick;
                };
            }
            case "Haryana" -> {
                int city = random.nextInt(2);
                yield switch (city) {
                    case 0 -> karnalCityClick;
                    default -> panipatCityClick;
                };
            }
            case "Rajasthan" -> {
                int city = random.nextInt(2);
                yield switch (city) {
                    case 0 -> jaipurCityClick;
                    default -> jaiselmerCityClick;
                };
            }
            default -> throw new IllegalStateException("Unexpected value: " + selectedState);
        };

    }
}
