package Methods.Magento;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.InterruptedIOException;
import java.util.Random;
import static BaseTest.Waits.WaitsMethod.*;


public class MagentoCustomers {
    String name;

    public void CreateCustomer (WebDriver driver) throws InterruptedException,InterruptedIOException{
        PresentExplicitXpath(driver,".//*[@id='menu-magento-customer-customer']/a/span");
        ClickableExplicitXpath(driver,".//*[@id='menu-magento-customer-customer']/div/ul/li[1]/a/span");
        PresentExplicitXpath(driver,".//*[@id='add']");
        driver.findElement(By.name("customer[firstname]")).clear();
        driver.findElement(By.name("customer[firstname]")).sendKeys("Bret");
        driver.findElement(By.name("customer[lastname]")).clear();
        driver.findElement(By.name("customer[lastname]")).sendKeys("Smith");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        WebElement emailRandom = driver.findElement(By.name("customer[email]"));
        emailRandom.sendKeys("username"+ randomInt +"@gmail.com");
        name = emailRandom.getText();
        System.out.print(name);
        Thread.sleep(1000);
    }
}
