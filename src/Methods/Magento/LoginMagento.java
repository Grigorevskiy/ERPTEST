package Methods.Magento;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginMagento {
    public void login (WebDriver driver, String email, String pass) throws InterruptedException {
        String MagentoURL = "http://magento-test.easyerp.com/admin";
        driver.get(MagentoURL);
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='username']")).clear();
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath(".//*[@id='login']")).clear();
        driver.findElement(By.xpath(".//*[@id='login']")).sendKeys("admin123456");
        driver.findElement(By.xpath("//div[3]/div[1]/button")).click();
    }
}
