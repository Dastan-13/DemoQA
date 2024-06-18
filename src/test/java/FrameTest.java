import com.demoqa.enums.Endpoints;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.demoqa.listener.ScreenshotListener.class)
public class FrameTest extends BaseTest{

    @Test(description = "verify that driver can switch to another frames")
    public void doubleClickTest() throws InterruptedException {
//        browserHelper.open("https://demoqa.com/frames");
        browserHelper.open(ConfigReader.getValue("baseDevURL") + Endpoints.FRAMES.getEndpoint());
        iframeHelper.switchToFrame("frame1"); // Сначала переключиться на frame, внутри котрого уже находим веб-элемент
        System.out.println(driver.findElement(By.id("sampleHeading")).getText()); // Находим элемент внутри фрейма
        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
//        System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
//        System.out.println(driver.findElement(By.cssSelector("h1[class='text-center']")).getText());


    }


}
