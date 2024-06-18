import com.demoqa.enums.Endpoints;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import static com.demoqa.enums.Endpoints.ALERT;

public class AlertTest extends BaseTest {

    @Test(groups = {"Smoke", "UI", "1721"}, description = "Alert test")
    @Description("Verify that alert is present")
    @Owner("Nuta")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GCPINT-8877")
    @Epic("Registration")
    @Link("www.google.com")


    void alertTest()  {
browserHelper.open(ConfigReader.getValue("baseDevURL") + ALERT.getEndpoint());
webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
webElementActions.pause(3);
alertHelper.acceptAlert();
webElementActions.pause(5);
    }


    @Test(groups = {"Regression", "API", "1722"}, description = "Alert test 1")
    void alertTest1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().promtAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptPromt("HJBHJBHJ");
        Thread.sleep(3000);
    }

    @Test(groups = {"E2E", "SQL", "1723"}, description = "Alert test 2")
    void alertTest2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().alertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlertIfPresented();
        Thread.sleep(3000);
    }


}
