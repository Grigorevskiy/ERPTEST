package Methods.Magento;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.InterruptedIOException;
import java.util.Random;
import static BaseTest.Waits.WaitsMethod.ClickableExplicitXpath;
import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;
import static BaseTest.Waits.WaitsMethod.PresentExplicitXpath;



public class MagentoCreateOrderAndCustomer {
    public void CreateOrder(WebDriver driver) throws InterruptedException, InterruptedIOException {
        PresentExplicitXpath(driver,".//*[@id='menu-magento-sales-sales']/a/span");
        ClickableExplicitXpath(driver,".//*[@id='menu-magento-sales-sales']/div/ul/li/div/ul/li[1]/a/span");
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath(".//*[@id='add']")).click();
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        PresentExplicitXpath(driver,".//*[@class='action-default scalable primary'][contains(@title, 'Create New Customer')]");
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        ClickableExplicitXpath(driver,".//*[@id='order-items']/div[1]/div/button");
//        driver.findElement(By.xpath(".//*[@id='order-items']/div[1]/div/button")).click();
        JavascriptExecutor jsDown = (JavascriptExecutor) driver;
        jsDown.executeScript("scroll(0,400);");
        PresentExplicitXpath(driver,".//*[@id='sales_order_create_search_grid_table']/tbody/tr[9]/td[2]");
        JavascriptExecutor jsUp = (JavascriptExecutor) driver;
        jsUp.executeScript("scroll(400,0);");
        ClickableExplicitXpath(driver,".//div/button[@title='Add Selected Product(s) to Order']");
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        WebElement emailRandom = driver.findElement(By.xpath(".//*[@id='email']"));
        emailRandom.sendKeys("username"+ randomInt +"@gmail.com");
        driver.findElement(By.xpath(".//*[@id='order-billing_address_firstname']")).clear();
        driver.findElement(By.xpath(".//*[@id='order-billing_address_firstname']")).sendKeys("John");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath(".//*[@id='order-billing_address_lastname']")).clear();
        driver.findElement(By.xpath(".//*[@id='order-billing_address_lastname']")).sendKeys("Smith");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath(".//*[@id='order-billing_address_street0']")).clear();
        driver.findElement(By.xpath(".//*[@id='order-billing_address_street0']")).sendKeys("Derbi");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath(".//*[@id='order-billing_address_city']")).clear();
        driver.findElement(By.xpath(".//*[@id='order-billing_address_city']")).sendKeys("New York");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        ClickableExplicitXpath(driver,".//*[@id='order-billing_address_city']");
        PresentExplicitXpath(driver,".//*[@id='order-billing_address_region_id']/option[2]");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath(".//*[@id='order-billing_address_postcode']")).clear();
        driver.findElement(By.xpath(".//*[@id='order-billing_address_postcode']")).sendKeys("24235235");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath(".//*[@id='order-billing_address_telephone']")).clear();
        driver.findElement(By.xpath(".//*[@id='order-billing_address_telephone']")).sendKeys("345678887654");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");

        ClickableExplicitXpath(driver,".//*[@id='order-shipping-method-summary']/a/span");
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        ClickableExplicitXpath(driver,".//*[@id='order-shipping-method-summary']/a/span");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        ClickableExplicitXpath(driver,".//*[@id='order-shipping-method-choose']/dl/dd[1]/ul/li/label");

        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        ClickableExplicitXpath(driver,".//*[@id='submit_order_top_button']");
    }
}
