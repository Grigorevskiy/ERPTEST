package Methods.Magento;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.InterruptedIOException;
import java.util.Random;
import static BaseTest.Waits.WaitsMethod.ClickableExplicit;
import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;
import static BaseTest.Waits.WaitsMethod.PresentExplicit;




public class MagentoCustomers {
    public void CreateCustomer (WebDriver driver) throws InterruptedException,InterruptedIOException{
        PresentExplicit(driver,".//*[@id='menu-magento-customer-customer']/a/span");
//        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        ClickableExplicit(driver,".//*[@id='menu-magento-customer-customer']/div/ul/li[1]/a/span");
        PresentExplicit(driver,".//*[@id='add']");
//        driver.findElement(By.xpath(".//*[@id='add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("customer[firstname]")).clear();
        driver.findElement(By.name("customer[firstname]")).sendKeys("Bret");
        Thread.sleep(2000);
        driver.findElement(By.name("customer[lastname]")).clear();
        driver.findElement(By.name("customer[lastname]")).sendKeys("Smith");
        Thread.sleep(2000);

        WebElement emailRandom = driver.findElement(By.name("customer[email]"));
        emailRandom.click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        emailRandom.sendKeys("username"+ randomInt +"@gmail.com");
        Thread.sleep(1000);
//AddAdress
        JavascriptExecutor jsUp = (JavascriptExecutor) driver;
        jsUp.executeScript("scroll(200,0);");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='tab_address']/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='container']/div/div/div[2]/div[2]/div/div[2]/fieldset/div/ul/li/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("address[new_0][default_billing]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("address[new_0][default_shipping]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("address[new_0][firstname]")).clear();
        driver.findElement(By.name("address[new_0][firstname]")).sendKeys("Name");
        Thread.sleep(1000);
        driver.findElement(By.name("address[new_0][lastname]")).clear();
        driver.findElement(By.name("address[new_0][lastname]")).sendKeys("LastName");
        Thread.sleep(1000);
        driver.findElement(By.name("address[new_0][street][0]")).clear();
        driver.findElement(By.name("address[new_0][street][0]")).sendKeys("Address");
        Thread.sleep(1000);
        driver.findElement(By.name("address[new_0][country_id]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(".//div/select[@class='admin__control-select']/option[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("address[new_0][postcode]")).clear();
        driver.findElement(By.name("address[new_0][postcode]")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.name("address[new_0][telephone]")).clear();
        driver.findElement(By.name("address[new_0][telephone]")).sendKeys("242365412312");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='save']")).click();
//        Thread.sleep(6000);
        Thread.sleep(3000);
        InvisibilityExplicit(driver,".//*[@id='container']/div/div/div");

        PresentExplicit(driver,".//*[@id='messages']/div/div/div");
    }
}
