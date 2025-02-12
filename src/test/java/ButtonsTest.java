import org.testng.Assert;
import org.testng.annotations.Test;




public class ButtonsTest extends BaseTest {


    @Test(description = "verify double click button is working propertly",priority = 2)
    public void doubleClickTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/buttons");
        webElementActions.doubleClick(demoQAPages.getButtonsPage().doubleClickBtn);
        Assert.assertEquals(demoQAPages.getButtonsPage().doubleClickMessage.getText(), "You have done a double click");
        Thread.sleep(2000);
    }

    @Test(description = "verify right click button is working propertly", priority = 1)
    public void rightClickTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/buttons");
        webElementActions.rightClick(demoQAPages.getButtonsPage().rightClickBtn);
        Assert.assertEquals(demoQAPages.getButtonsPage().rightClickMessage.getText(), "You have done a right click");
        Thread.sleep(2000);

    }

    @Test(description = "verify click button is working propertly",priority = 3)
    public void  clickTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/buttons");
        webElementActions.click(demoQAPages.getButtonsPage().clickBtn);
        Assert.assertEquals(demoQAPages.getButtonsPage().clickMessage.getText(), "You have done a dynamic click");
        Thread.sleep(2000);

    }

    }
