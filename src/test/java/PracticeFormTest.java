import com.demoqa.entities.PracticeFormEntity;

import org.testng.annotations.Test;



public class PracticeFormTest extends BaseTest{
    @Test
    public void practiceFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        PracticeFormEntity practiceFormEntity = randomUtils.generateRandomPracticeFormEntity();
        demoQAPages.getPracticeFormPage().fillUpPracticeForm(practiceFormEntity);
        Thread.sleep(5000);

    }

    @Test
    public void test123() throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");

        demoQAPages.getPracticeFormPage().selectDateMonthYear("30 June 2020");
        Thread.sleep(5000);
    }

    // Local Date
    // Local Time


}
