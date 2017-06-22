package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.InterruptedIOException;

/**
 * Created by viktor on 22.06.17.
 */
public class LoginShopify {
    public void login(WebDriver driver, String email, String pass) throws InterruptedIOException, InterruptedException {
        Thread.sleep(4000);
        driver.navigate().to("https://easyerp-test.myshopify.com/admin/auth/login");
        driver.findElement(By.xpath(".//*[@id='Login']")).clear();
        driver.findElement(By.xpath(".//*[@id='Login']")).sendKeys("norbert.madyar@thinkmobiles.com");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("123456qwerty");
        Thread.sleep(2000);
        driver.findElement(By.name("commit")).click();

    }
}
