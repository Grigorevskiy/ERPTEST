package Methods.EasyERP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.InterruptedIOException;
import static BaseTest.Waits.WaitsMethod.ClickableExplicitXpath;
import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;
import static BaseTest.Waits.WaitsMethod.PresentExplicitXpath;




public class LogOut {
    public void logout (WebDriver driver) throws InterruptedIOException, InterruptedException {
        InvisibilityExplicit(driver, ".//*[@id='loading']");
PresentExplicitXpath(driver,".//*[@id='loginPanel']/div");
//        driver.findElement(By.xpath(".//*[@id='loginPanel']/div")).click();
        PresentExplicitXpath(driver,".//*[@id='logout']/a");
        InvisibilityExplicit(driver, ".//*[@id='loading']");


    }
}
