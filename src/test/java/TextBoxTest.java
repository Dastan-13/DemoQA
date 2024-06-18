import com.demoqa.entities.TextBoxEntity;
import com.demoqa.listener.ScreenshotListener;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void textBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        TextBoxEntity textBoxEntity = randomUtils.generateRandomTextBoxEntity();
demoQAPages.getTextBoxPage().fillUpTextBoxForm(textBoxEntity);
Thread.sleep(5000);


    }
}
