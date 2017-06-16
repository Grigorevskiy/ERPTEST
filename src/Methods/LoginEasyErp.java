package Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.InterruptedIOException;


public class LoginEasyErp {
    public void login (WebDriver driver, String email, String pass) throws InterruptedIOException, InterruptedException {
        driver.navigate().to("https://live.easyerp.com/#login");
        Thread.sleep(2000);
//     driver.findElement(By.cssSelector("div.selectDd")).click();
////        driver.findElement(By.cssSelector("#dbs > li")).click();
//        driver.findElement(By.xpath("//div[2]/div/ul/li[@data-id='CRM']")).click();
//        driver.findElement(By.name("ulogin")).clear();
//        driver.findElement(By.name("ulogin")).sendKeys("grigorevskiiy@gmail.com");
//        driver.findElement(By.id("upass")).clear();
//        driver.findElement(By.id("upass")).sendKeys("vitya9595");
//        driver.findElement(By.id("loginTrigger")).click();
        driver.findElement(By.name("ulogin")).clear();
        driver.findElement(By.name("ulogin")).sendKeys("grigorevskiiy@gmail.com");
        driver.findElement(By.id("upass")).clear();
        driver.findElement(By.id("upass")).sendKeys("vitya9595");
        driver.findElement(By.id("loginTrigger")).click();

    }
}
