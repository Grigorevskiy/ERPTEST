package Methods.Magento;

import org.openqa.selenium.WebDriver;

import static BaseTest.Waits.WaitsMethod.ClickableExplicitXpath;
import static BaseTest.Waits.WaitsMethod.PresentExplicitXpath;

public class SignOut {
    public void singOut(WebDriver driver) throws InterruptedException {
        ClickableExplicitXpath(driver,".//*[@id='html-body']/div[2]/header/div[2]/div[1]/a");
        PresentExplicitXpath(driver,".//*[@id='html-body']/div[2]/header/div[2]/div[1]/ul/li[3]/a");
    }
}
