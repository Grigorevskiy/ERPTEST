package Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.InterruptedIOException;




public class LoginShopify {
    public void login(WebDriver driver, String email, String pass) throws InterruptedIOException, InterruptedException {
        driver.navigate().to("https://easyerp-test.myshopify.com/admin/auth/login");
        driver.findElement(By.xpath(".//*[@id='Login']")).clear();
        driver.findElement(By.xpath(".//*[@id='Login']")).sendKeys("norbert.madyar@thinkmobiles.com");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("123456qwerty");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("commit")))).click();
        driver.findElement(By.name("commit")).click();
    }
}
