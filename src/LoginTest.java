import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;
import static org.testng.AssertJUnit.assertEquals;


public class LoginTest extends BaseTest {

    @Test
    public void login() throws InterruptedException , InterruptedIOException {
        driver.findElement(By.xpath("//div[1]/div/div[2]/div[1]/a[2]")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("qwerty@mail.ru");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("111111");
        driver.findElement(By.xpath("//div[@id='app']/header/div/div/div[2]/div/div[2]/div/div/div[3]/button")).click();
        driver.findElement(By.xpath("//div/div[2]/div[1]/a/div[2]")).isDisplayed();
    }

    @Test
    public void loginWithFacebook() throws InterruptedException {
        driver.findElement(By.xpath("//div[1]/div/div[2]/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//div/div/div[6]/button")).click();
        driver.findElement(By.xpath("//div/div[1]/div/input")).clear();
        driver.findElement(By.xpath("//div/div[1]/div/input")).sendKeys("grigorevskiiy@gmail.com");
        driver.findElement(By.xpath("//div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("vitya9595");
        driver.findElement(By.xpath("//div[@id='app']/header/div/div/div[2]/div/div[2]/div/div/div[3]/button")).click();
        Thread.sleep(1000);
        assertEquals("Min Profil",driver.findElement(By.xpath("//div/div[2]/div[1]/a/div[2]")).getText());
    }

    @Test
    public void withWrongEmail () throws InterruptedIOException, InterruptedException {
        driver.findElement(By.xpath("//div[1]/div/div[2]/div[1]/a[2]")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("qwerty.ru");
        assertEquals("Ange ett giltigt E-post",driver.findElement(By.xpath("//div/div[1]/div/span")).getText());
    }

    @Test
    public void withWrongPass () throws InterruptedIOException, InterruptedException{
        driver.findElement(By.xpath("//div[1]/div/div[2]/div[1]/a[2]")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("qwerty@mail.ru");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("111111111");
        driver.findElement(By.xpath("//div/div/div[3]/button")).click();
        Thread.sleep(2000);
        assertEquals("Fel användarnamn eller lösenord",driver.findElement(By.xpath("//div/div/div[2]/div/span")).getText());
    }

    @Test
    public void forgotPass () throws InterruptedIOException , InterruptedException {
        driver.findElement(By.xpath("//div[1]/div/div[2]/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div[4]/a")).click();
        driver.findElement(By.xpath("//div[3]/div/div/div[1]/div/input[@id='email']")).clear();
        driver.findElement(By.xpath("//div[3]/div/div/div[1]/div/input[@id='email']")).sendKeys("qwerty@mail.ru");
        driver.findElement(By.xpath("//div/div/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[2]/div/div")).isDisplayed();
    }

    @Test
    public void ToRegFormButton () throws InterruptedIOException, InterruptedException {
        driver.findElement(By.xpath("//div[1]/div/div[2]/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div[7]/a")).click();
        driver.findElement(By.xpath("//div[1]/div/div/div[4]/div/label")).isDisplayed();
    }
}