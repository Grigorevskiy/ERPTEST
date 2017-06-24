package Test;
import BaseTest.BaseTest;
import Methods.LoginEasyErp;
import Methods.LoginMagento;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;


public class MagentoSync extends BaseTest {
    String OrderPage = "http://magento-test.easyerp.com/admin/sales/order/index/key/77d851f339811c4720628b57fd591dabe6015a4e794e22a4afa2b052173259f4/";

    public static void ExplicitWait (WebDriver driver , String locator) {
        (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    @Test
    public void DeleteOrders () throws InterruptedException, InterruptedIOException{
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver,"admin","admin123456");
        driver.navigate().to(OrderPage);
        ExplicitWait(driver,"//div[4]/table/thead/tr/th[1]/div/label");
        driver.findElement(By.xpath("//div[4]/table/thead/tr/th[1]/div/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div[1]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[1]/div/ul/li[1]/span")).click();
    }

    @Test
    public void AddProduct () throws InterruptedIOException , InterruptedException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver,"grigorevskiiy@gmail.com", "vitya9595");
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
        Thread.sleep(3000);
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

//    @Test
//    public void CreateOrder () throws InterruptedException, InterruptedIOException {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        LoginMagento loginMagento = new LoginMagento();
//        loginMagento.login(driver,"admin","admin123456");
//        driver.navigate().to(OrderPage);
//        driver.findElement(By.xpath(".//*[@id='add']")).click();
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='sales_order_create_customer_grid_table']/tbody/tr[3]/td[2]")))).click();
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(".//*[@id='order-items']/div[1]/div/button")).click();
//
//        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.className("action-secondary action-add")));
//        myDynamicElement.click();
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='sales_order_create_search_grid_table']/tbody/tr[8]/td[2]")))).click();



        // driver.findElement(By.xpath(".//*[@id='sales_order_create_customer_grid_table']/tbody/tr[3]/td[2]")).click();
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='order-items']/div[1]/div/button"))));
//        driver.findElement(By.xpath(".//*[@id='order-items']/div[1]/div/button")).click();
//        driver.findElement(By.xpath(".//*[@id='sales_order_create_search_grid_table']/tbody/tr[8]/td[2]")).click();
//        driver.findElement(By.xpath(".//*[@id='id_108afbf28deed81a5e1f0f4d3faa2c8b']")).click();
//        driver.findElement(By.xpath(".//*[@id='submit_order_top_button']")).click();
//        driver.findElement(By.xpath(".//*[@id='id_80eae0042e0be8a93e5379292d51c615']")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);


//        WebElement myDynamicElement = driver.findElement(By.xpath(".//*[@id='order-items']/div[1]/div/button"));
//        myDynamicElement.click();
    public static void ImplicitWait (WebDriver driver){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    }

