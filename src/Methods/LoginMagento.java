package Methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.InterruptedIOException;

public class LoginMagento {
    public void login (WebDriver driver, String email, String pass) throws InterruptedIOException, InterruptedException {
        Thread.sleep(4000);
        driver.navigate().to("http://magento-test.easyerp.com/admin/admin/index/index/key/20b5b4704850d44c72a95750354fc1c032689422719227d1cb16e8e91f94f541/");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='username']")).clear();
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath(".//*[@id='login']")).clear();
        driver.findElement(By.xpath(".//*[@id='login']")).sendKeys("admin123456");
        driver.findElement(By.xpath("//div[3]/div[1]/button")).click();
    }
}
