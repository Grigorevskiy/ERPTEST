import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;
import java.util.UUID;
import static org.testng.AssertJUnit.assertEquals;


public class RegistrationTest extends BaseTest {

    static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@mail.com";
    }

    @Test
    public void Registration() throws InterruptedException {
        driver.findElement(By.xpath("//div/div[2]/div[1]/a[1]")).click();
        String randomEmail = randomEmail();
        WebElement email = driver.findElement(By.xpath("//div/div/div[1]/div/input[@id='email']"));
        email.sendKeys(randomEmail);
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("111111");
        driver.findElement(By.id("password_confirmation")).clear();
        driver.findElement(By.id("password_confirmation")).sendKeys("111111");
        driver.findElement(By.cssSelector("label")).click();
        driver.findElement(By.cssSelector("button.btn.btn_registration")).click();
        driver.findElement(By.xpath("//div/div[2]/div[1]/a/div[2]")).isDisplayed();
    }

    @Test
    public void WrongEmail() throws InterruptedException, InterruptedIOException {
        driver.findElement(By.xpath("//div/div[2]/div[1]/a[1]")).click();
        WebElement email = driver.findElement(By.xpath("//div/div/div[1]/div/input[@id='email']"));
        email.sendKeys("dqwdq");
        assertEquals("Ange ett giltigt E-post", driver.findElement(By.cssSelector("span.errorSpan.show")).getText());
        Thread.sleep(2000);
    }

    @Test
    public void minSymbPass() throws InterruptedException {
        driver.findElement(By.xpath("//div/div[2]/div[1]/a[1]")).click();
        String randomEmail = randomEmail();
        WebElement email = driver.findElement(By.xpath("//div/div/div[1]/div/input[@id='email']"));
        email.sendKeys(randomEmail);
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("1");
        assertEquals("Lösenord måste vara minst 6 tecken", driver.findElement(By.cssSelector("span.errorSpan.show")).getText());
    }

    @Test
    public void PassDoNotMatch() throws InterruptedException {
        driver.findElement(By.xpath("//div/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//div/div/div[1]/div/input[@id='email']")).sendKeys("mail@mail.ru");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("111111");
        driver.findElement(By.id("password_confirmation")).clear();
        driver.findElement(By.id("password_confirmation")).sendKeys("1111111");
        driver.findElement(By.cssSelector("label")).click();
        driver.findElement(By.cssSelector("button.btn.btn_registration")).click();
        Thread.sleep(2000);
        assertEquals("Bekräfta lösenord bör vara lika med Lösenord", driver.findElement(By.xpath("//div/div/div[3]/div/span")).getText());
    }

    @Test
    public void LogWithFacebook() throws InterruptedException {
        driver.findElement(By.xpath("//div/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//div[1]/div/div/div[7]/button")).click();
        Thread.sleep(2000);
        assertEquals("Facebook",driver.findElement(By.xpath("//div/div/h2")).getText());
    }
}
