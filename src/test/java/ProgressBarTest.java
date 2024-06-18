import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{
    @Test(description = "ariaValueNow")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");
        webElementActions.click(demoQAPages.getProgressBarPage().startStopBtn);

        String valueNow; // Создаем переменную для хранения текущего значения aria-valuenow
        while (true) { // Начало бесконечного цикла, пока не прервется с помощью break
            valueNow = demoQAPages.getProgressBarPage().areaValueNow.getAttribute("aria-valuenow"); // Извлечение текущего значения aria-valuenow
            if (valueNow.equals("52")) { // Проверка
                webElementActions.click(demoQAPages.getProgressBarPage().startStopBtn); // Остановка процесса в связи с выполнением условия выше
                break;
            }
        }

        Assert.assertEquals(valueNow, "52"); // Сравнение полученного значения с ожидаемым

    }

}
