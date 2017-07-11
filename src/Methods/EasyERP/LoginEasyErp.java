package Methods.EasyERP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.InterruptedIOException;

import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;


public class LoginEasyErp {
    public void login (WebDriver driver, String email, String pass) throws InterruptedIOException, InterruptedException {
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.navigate().to("https://live.easyerp.com/#login");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.name("ulogin")).clear();
        driver.findElement(By.name("ulogin")).sendKeys("grigorevskiiy@gmail.com");
        driver.findElement(By.id("upass")).clear();
        driver.findElement(By.id("upass")).sendKeys("vitya9595");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.id("loginTrigger")).click();
    }
}
