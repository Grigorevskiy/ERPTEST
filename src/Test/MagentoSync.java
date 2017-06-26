package Test;
import BaseTest.BaseTest;
import Methods.EasyERP.LoginEasyErp;
import Methods.Login.LoginMagento;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;
import java.util.Random;


public class MagentoSync extends BaseTest {
    String OrderPage = "http://magento-test.easyerp.com/admin/sales/order/index/key/77d851f339811c4720628b57fd591dabe6015a4e794e22a4afa2b052173259f4/";

    public static void ExplicitWait(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
    }
    @Test
    public void DeleteOrders() throws InterruptedException, InterruptedIOException {
        // driver.manage().timeouts().implicitlyWait(5 ,TimeUnit.SECONDS);
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        driver.navigate().to(OrderPage);
        //  ExplicitWait(driver,"//div[4]/table/thead/tr/th[1]/div/label");
//        wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[1]/div/div[1]/div/div/div[2]/div/div[3]/div/button[2]"))).click();
        //  WebDriverWait wait = new WebDriverWait(driver, 10);

//new WebDriverWait(driver,5)
//        .until(ExpectedConditions.(By.xpath("//div[4]/table/thead/tr/th[1]/div/label")));
        //Thread.sleep(4000);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[4]/table/thead/tr/th[1]/div/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div[1]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[1]/div/ul/li[1]/span")).click();
    }

    @Test
    public void AddProduct() throws InterruptedIOException, InterruptedException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        Thread.sleep(3000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/Products/list");
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='top-bar-createBtn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='product']")).clear();
        driver.findElement(By.xpath(".//*[@id='product']")).sendKeys("MacBook");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[1]/div[1]/div/div[2]/div[2]/label[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='SKU']")).clear();
        driver.findElement(By.xpath(".//*[@id='SKU']")).sendKeys("000123");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='showBtn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='productCategories']/li[5]/label[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='linkProduct']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='createEmployeeForm']/ul/li[4]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div/div[1]/div/dl[1]/div[2]/dd/input")).clear();
        driver.findElement(By.xpath("//div/div/div[1]/div/dl[1]/div[2]/dd/input")).sendKeys("10");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[1]/dd/input")).clear();
        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[1]/dd/input")).sendKeys("2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[2]/dd/input")).clear();
        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[2]/dd/input")).sendKeys("20");
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='saveBtn']")).click();
    }

    @Test
    public void CreateOrderMagento() throws InterruptedException, InterruptedIOException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        driver.navigate().to(OrderPage);
        driver.findElement(By.xpath(".//*[@id='add']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='sales_order_create_customer_grid_table']/tbody/tr[3]/td[2]")))).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='order-items']/div[1]/div/button")).click();
        Thread.sleep(2000);
        JavascriptExecutor jsDown = (JavascriptExecutor) driver;
        jsDown.executeScript("scroll(0,400);");

        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='sales_order_create_search_grid_table']/tbody/tr[8]/td[2]")).click();
Thread.sleep(2000);
        JavascriptExecutor jsUp = (JavascriptExecutor) driver;
        jsUp.executeScript("scroll(400,0);");
Thread.sleep(2000);

        driver.findElement(By.xpath(".//*[@id='id_7cbd301c5b53736710337c068e67db60'][contains(@title, 'Add Selected Product(s) to Order')]")).click();
      Thread.sleep(2000);
jsDown.executeScript("scroll(0,700)");
Thread.sleep(3000);

//ShipMethod
driver.findElement(By.xpath(".//*[@id='order-shipping-method-summary']/a/span")).click();
Thread.sleep(2000);
driver.findElement(By.xpath(".//*[@id='s_method_flatrate_flatrate']")).click();
//subOrder
        driver.findElement(By.xpath(".//*[@id='submit_order_top_button']")).click();

    }

    @Test
    public void CreteCustomers () throws InterruptedIOException, InterruptedException {
        LoginMagento loginMagento =new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='html-body']/div[4]/aside[1]/div[2]/header/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='menu-magento-customer-customer']/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='menu-magento-customer-customer']/div/ul/li[1]/a/span")).click();
        //driver.navigate().to("http://magento-test.easyerp.com/admin/customer/index/index/key/5254ebfaca251cccfc08a3f6403b43fa34913a6a8ad3b59f972186b4c994f923/");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='add']")).click();
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
        driver.findElement(By.xpath(".//*[@id='save']")).click();
    }
}

