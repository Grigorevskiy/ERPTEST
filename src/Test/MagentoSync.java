package Test;
import BaseTest.BaseTest;
import Methods.EasyERP.AddProduct;
import Methods.EasyERP.ChanelMagento;
import Methods.EasyERP.LoginEasyErp;
import Methods.Magento.LoginMagento;
import Methods.Magento.MagentoCustomers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;

import static BaseTest.Waits.WaitsMethod.*;


public class MagentoSync extends BaseTest {
    String OrderPage = "http://magento-test.easyerp.com/admin/sales/order/index/key/77d851f339811c4720628b57fd591dabe6015a4e794e22a4afa2b052173259f4/";

    @Test
    public void DeleteOrders() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        driver.navigate().to(OrderPage);
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath("//div[4]/table/thead/tr/th[1]/div/label")).click();
        driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div[1]/div/button")).click();
        driver.findElement(By.xpath("//div[2]/div[1]/div/ul/li[1]/span")).click();
    }

    @Test
    public void AddProductERP() throws InterruptedIOException, InterruptedException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        AddProduct addProduct = new AddProduct();
        addProduct.AddProductERP(driver);
//        Thread.sleep(3000);
//        driver.navigate().to("https://live.easyerp.com/#easyErp/Products/list");
//        InvisibilityExplicit(driver,".//*[@id='loading']");
//        PresentExplicitXpath(driver,".//*[@id='top-bar-createBtn']");
//        driver.findElement(By.xpath(".//*[@id='product']")).clear();
//        driver.findElement(By.xpath(".//*[@id='product']")).sendKeys("MacBook");
//        InvisibilityExplicit(driver,".//*[@id='loading']");
//        driver.findElement(By.xpath("//div[1]/div[1]/div/div[2]/div[2]/label[1]/span")).click();
//        driver.findElement(By.xpath(".//*[@id='SKU']")).clear();
//        driver.findElement(By.xpath(".//*[@id='SKU']")).sendKeys("000123");
//        driver.findElement(By.xpath(".//*[@id='showBtn']")).click();
//        driver.findElement(By.xpath(".//*[@id='productCategories']/li[5]/label[1]/span")).click();
//        driver.findElement(By.xpath(".//*[@id='linkProduct']")).click();
//        InvisibilityExplicit(driver,".//*[@id='loading']");
//        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).click();
////CreateList
//        InvisibilityExplicit(driver,"//*[@id='loading']");
//        ClickableExplicitXpath(driver,".//*[@id='createEmployeeForm']/ul/li[4]/a");
//        driver.findElement(By.xpath("//div/div/div[1]/div/dl[1]/div[2]/dd/input")).clear();
//        driver.findElement(By.xpath("//div/div/div[1]/div/dl[1]/div[2]/dd/input")).sendKeys("10");
//        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[1]/dd/input")).clear();
//        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[1]/dd/input")).sendKeys("2");
//        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[2]/dd/input")).clear();
//        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[2]/dd/input")).sendKeys("20");
//        driver.findElement(By.xpath(".//*[@id='saveBtn']")).click();
    }

    @Test
    public void CreateCustomer ()  throws InterruptedIOException , InterruptedException{
        LoginMagento loginMagento =new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        MagentoCustomers magentoCustomers = new MagentoCustomers();
        magentoCustomers.CreateCustomer(driver);
    }

    @Test
    public void DeleteChanelMagento () throws InterruptedException , InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        ChanelMagento chanelMagento = new ChanelMagento();
        chanelMagento.DeleteChanel(driver);
    }

    @Test
    public void CreatMagentoChannel () throws InterruptedException, InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        ChanelMagento chanelMagento = new ChanelMagento();
        chanelMagento.CreateChanel(driver);
    }

    @Test
    public void CreateOrderMagento() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        driver.navigate().to(OrderPage);
        driver.findElement(By.xpath(".//*[@id='add']")).click();
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");

        ClickableExplicitXpath(driver,".//*[@id='sales_order_create_customer_grid_table']/tbody/tr[2]/td[2]");
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");

        driver.findElement(By.xpath(".//*[@id='order-items']/div[1]/div/button")).click();
        JavascriptExecutor jsDown = (JavascriptExecutor) driver;
        jsDown.executeScript("scroll(0,400);");
        driver.findElement(By.xpath(".//*[@id='sales_order_create_search_grid_table']/tbody/tr[8]/td[2]")).click();
        JavascriptExecutor jsUp = (JavascriptExecutor) driver;
        jsUp.executeScript("scroll(400,0);");

        PresentExplicitXpath(driver,".//div/button[@class='action-default scalable action-add action-secondary']");
        jsDown.executeScript("scroll(0,700)");
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
//ShipMethod
        ClickableExplicitXpath(driver,".//*[@id='order-shipping-method-summary']/a/span");
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        PresentExplicitXpath(driver,".//*[@id='order-shipping-method-choose']/dl/dd/ul/li/label");
//subOrder
        InvisibilityExplicit(driver,".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath(".//*[@id='submit_order_top_button']")).click();
    }
}

