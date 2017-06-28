package Methods.Magento;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.InterruptedIOException;
import java.util.Random;

import static BaseTest.Waits.WaitsMethod.*;


public class MagentoCustomers {
//    String name;

    public void CreateCustomer (WebDriver driver) throws InterruptedException,InterruptedIOException{
        PresentExplicitXpath(driver,".//*[@id='menu-magento-customer-customer']/a/span");
//        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        ClickableExplicitXpath(driver,".//*[@id='menu-magento-customer-customer']/div/ul/li[1]/a/span");
        PresentExplicitXpath(driver,".//*[@id='add']");


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
       String name = emailRandom.getText();
        Thread.sleep(1000);
//AddAddress
        JavascriptExecutor jsUp = (JavascriptExecutor) driver;
        jsUp.executeScript("scroll(200,0);");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='tab_address']/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='container']/div/div/div[2]/div[2]/div/div[2]/fieldset/div/ul/li/button")).click();

        PresentExplicitName(driver,"address[new_0][default_billing]");
        PresentExplicitName(driver,"address[new_0][default_shipping]");

        driver.findElement(By.name("address[new_0][street][0]")).clear();
        driver.findElement(By.name("address[new_0][street][0]")).sendKeys("Address");
        Thread.sleep(1000);
        driver.findElement(By.name("address[new_0][country_id]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(".//div/select[@class='admin__control-select']/option[5]")).click();

        driver.findElement(By.name("address[new_0][postcode]")).clear();
        driver.findElement(By.name("address[new_0][postcode]")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.name("address[new_0][telephone]")).clear();
        driver.findElement(By.name("address[new_0][telephone]")).sendKeys("242365412312");
        Thread.sleep(2000);
        driver.findElement(By.name("address[new_0][street][0]")).clear();
        driver.findElement(By.name("address[new_0][street][0]")).sendKeys("City");
;
        driver.findElement(By.xpath(".//*[@id='save']")).click();
//        Thread.sleep(15000);
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(".//*[@id='save']")).click();
//        Thread.sleep(6000);
        InvisibilityExplicit(driver,".//*[@id='html-body']/div[1]/div");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]/div");

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//       WebElement ema =  wait.until(ExpectedConditions.presenceOfElementLocated(By.name(".//*[@id='container']/div/div[5]/table/tbody//div[contains(text(),'"+name+"')]")));
//       ema.getText();


Thread.sleep(3000);
WebElement email = driver.findElement(By.xpath(".//*[@id='container']/div/div[5]/table/tbody//div[contains(text(),'"+name+"')]"));
email.getText();
//        WebElement email = PresentExplicit(driver,".//*[@id='container']/div/div[5]/table/tbody//div[contains(text(),'"+name+"')]");
//        email.getText();
System.out.print(email);

//        PresentExplicit(driver,".//*[@id='messages']/div/div/div");
    }
}
