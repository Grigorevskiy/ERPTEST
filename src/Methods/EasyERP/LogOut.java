package Methods.EasyERP;
import org.openqa.selenium.WebDriver;
import java.io.InterruptedIOException;
import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;
import static BaseTest.Waits.WaitsMethod.PresentExplicitXpath;




public class LogOut {
    public void logout (WebDriver driver) throws InterruptedIOException, InterruptedException {
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        PresentExplicitXpath(driver,".//*[@id='loginPanel']/div");
        PresentExplicitXpath(driver,".//*[@id='logout']/a");
        InvisibilityExplicit(driver, ".//*[@id='loading']");
    }
}
