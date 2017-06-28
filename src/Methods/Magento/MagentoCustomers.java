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

//        Random randomGenerator = new Random();
//        int randomInt = randomGenerator.nextInt(1000);
//        driver.findElement(By.name("customer[email]")).sendKeys("username"+ randomInt +"@gmail.com");
//        String test1 = driver.findElement(By.name("customer[email]")).getText();
//        System.out.print(test1);



//AddAddress
//        JavascriptExecutor jsUp = (JavascriptExecutor) driver;
//        jsUp.executeScript("scroll(200,0);");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(".//*[@id='tab_address']/span[1]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(".//*[@id='container']/div/div/div[2]/div[2]/div/div[2]/fieldset/div/ul/li/button")).click();
//
//        PresentExplicitName(driver,"address[new_0][default_billing]");
//        PresentExplicitName(driver,"address[new_0][default_shipping]");
//
//        driver.findElement(By.name("address[new_0][street][0]")).clear();
//        driver.findElement(By.name("address[new_0][street][0]")).sendKeys("Address");
//
//        driver.findElement(By.name("address[new_0][city]")).clear();
//        driver.findElement(By.name("address[new_0][city]")).sendKeys("Algeria");
//
//        driver.findElement(By.name("address[new_0][country_id]")).click();
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath(".//div/select[@class='admin__control-select']/option[5]")).click();
//
//        driver.findElement(By.name("address[new_0][postcode]")).clear();
//        driver.findElement(By.name("address[new_0][postcode]")).sendKeys("123456");
//
//        driver.findElement(By.name("address[new_0][telephone]")).clear();
//        driver.findElement(By.name("address[new_0][telephone]")).sendKeys("242365412312");
//
//        driver.findElement(By.xpath(".//*[@id='save']")).click();
//        InvisibilityExplicit(driver,".//*[@id='html-body']/div[1]/div");
//        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]/div");
//
//
//        WebElement email = driver.findElement(By.xpath(".//*[@id='container']/div/div[5]/table/tbody//div[contains(text(),'"+name+"')]"));
//        String test = email.getText();

//        System.out.print(test);
    }
}
