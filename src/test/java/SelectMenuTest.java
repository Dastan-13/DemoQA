import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectMenuTest extends BaseTest{

    @BeforeClass
    public void set() {
        driver.get("https://demoqa.com/select-menu");
    }

    @Test(description = "valueTest")
    void  selectValueTest() throws InterruptedException {
        demoQAPages.getSelectMenuPage().fillUpSelectMenuPage();
        Thread.sleep(6000);
    }


    @Test(description = "multiTest")
    void  multiSelectTest() throws InterruptedException {
        WebElement multiSelect = driver.findElement(By.id("cars"));
        dropdownHelper.selectByVisibleText(multiSelect,"Opel");
        Thread.sleep(2000);
        dropdownHelper.selectByValueText(multiSelect,"audi");
        Thread.sleep(2000);
        dropdownHelper.selectByIndex(multiSelect,1);
        Thread.sleep(2000);
        dropdownHelper.getOptions(multiSelect);

    }


    @Test(description = "menuTest")
    void  selectMenuTest() throws InterruptedException {
      WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));
       dropdownHelper.selectByVisibleText(selectMenu,"Purple");
        Thread.sleep(2000);
        dropdownHelper.selectByValueText(selectMenu,"5");
        Thread.sleep(2000);
        dropdownHelper.selectByIndex(selectMenu, 3);
        Thread.sleep(2000);
        dropdownHelper.getOptions2(selectMenu);
        Thread.sleep(2000);
//        dropdownHelper.getAllSelectedOptions(selectMenu);

    }

}
