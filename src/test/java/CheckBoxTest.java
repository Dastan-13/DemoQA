import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest() {
        driver.get("https://demoqa.com/checkbox");

        SoftAssert softAssert = new SoftAssert();

        demoQAPages.getCheckBoxPage().clickHomeElement();
        demoQAPages.getCheckBoxPage().clickDesktopElement();
        demoQAPages.getCheckBoxPage().clickNotesElement();

        String actualNotesElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expecteNotesElement = "You have selected :\n" + "notes";
        softAssert.assertEquals(actualNotesElement, expecteNotesElement, "Несовпадение в MessageOfNotes");

        demoQAPages.getCheckBoxPage().clickCommandsElement();
        String actualCommandsElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedCommandsElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands";
        softAssert.assertEquals(actualCommandsElement, expectedCommandsElement, "Несовпадение в MessageOfCommands");

        demoQAPages.getCheckBoxPage().clickDocumentsElement();
        demoQAPages.getCheckBoxPage().clickWorkSpaceElement();

        demoQAPages.getCheckBoxPage().clickReactElement();
        String actualReactElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedReactElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "react";
        softAssert.assertEquals(actualReactElement, expectedReactElement, "Несовпадение в ReactElement");

        demoQAPages.getCheckBoxPage().clickAngularElement();
        String actualMessageOfAngularElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedAngularElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "react\n" + "angular";
        softAssert.assertEquals(actualMessageOfAngularElement, expectedAngularElement, "Несовпадение в AngularElement");

        demoQAPages.getCheckBoxPage().clickVeuElement();
        String actualVeuElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedVeuElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "workspace\n" + "react\n" + "angular\n" + "veu";
        softAssert.assertEquals(actualVeuElement, expectedVeuElement, "Несовпадение в VeuElement");

        demoQAPages.getCheckBoxPage().clickOfficeElement();

        demoQAPages.getCheckBoxPage().clickPublicElement();
        String actualPublicElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedPublicElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "public";
        softAssert.assertEquals(actualPublicElement, expectedPublicElement, "Несовпадение в Public");

        demoQAPages.getCheckBoxPage().clickPrivateElement();
        String actualPrivateElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedPrivateElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "public\n" + "private";
        softAssert.assertEquals(actualPrivateElement, expectedPrivateElement, "Несовпадение в Private");

        demoQAPages.getCheckBoxPage().clickClassifiedElement();
        String actualClassifiedElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedClassifiedElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "public\n" + "private\n" + "classified";
        softAssert.assertEquals(actualClassifiedElement, expectedClassifiedElement, "Несовпадение в Сlassified");

        demoQAPages.getCheckBoxPage().clickGeneralElement();
        String actualGeneralElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedGeneralElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general";
        softAssert.assertEquals(actualGeneralElement, expectedGeneralElement, "Несовпадение в General");

        demoQAPages.getCheckBoxPage().clickDownloadsElement();

        demoQAPages.getCheckBoxPage().clickWordFiledocElement();
        String actualWordFiledocElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedWordFiledocElement = "You have selected :\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" + "wordFile";
        softAssert.assertEquals(actualWordFiledocElement, expectedWordFiledocElement, "Несовпадение в WordFiledoc");

        demoQAPages.getCheckBoxPage().clickExcelFiledocElement();
        String actualExcelFiledocElement = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedExcelFiledocElement = "You have selected :\n" + "home\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile";
        softAssert.assertEquals(actualExcelFiledocElement, expectedExcelFiledocElement, "Несовпадение в ExcelFiledoc");

        demoQAPages.getCheckBoxPage().clickHomeElementReturn();
        String actualHomeElementReturn = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[3]")).getText();
        String expectedHomeElementReturn = "";
        softAssert.assertEquals(actualHomeElementReturn, expectedHomeElementReturn, "Несовпадение в HomeElementReturn");

        softAssert.assertAll();
    }
}
