package Test;
import BaseTest.BaseTest;
import Methods.EasyERP.AddProduct;
import Methods.Magento.ChanelMagento;
import Methods.EasyERP.LoginEasyErp;
import Methods.Magento.LoginMagento;
import Methods.Magento.MagentoCreateOrderAndCustomer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;

import static BaseTest.Waits.WaitsMethod.*;


public class MagentoSync extends BaseTest {
    @Test(priority = 1)
    public void DeleteOrders() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        PresentExplicitXpath(driver,".//*[@id='menu-magento-sales-sales']/a/span");
        ClickableExplicitXpath(driver,".//*[@id='menu-magento-sales-sales']/div/ul/li/div/ul/li[1]/a/span");
        InvisibilityExplicit(driver, ".//*[@id='container']/div/div[1]");
        driver.findElement(By.xpath("//div[4]/table/thead/tr/th[1]/div/label")).click();
        driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div[1]/div/button")).click();
        driver.findElement(By.xpath("//div[2]/div[1]/div/ul/li[1]/span")).click();
    }

    @Test(priority = 2)
    public void AddProductERP() throws InterruptedIOException, InterruptedException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        AddProduct addProduct = new AddProduct();
        addProduct.AddProductERP(driver);
    }

    @Test(priority = 3)
    public void CreateOrderAndCustomerMagento1() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        MagentoCreateOrderAndCustomer magentoCreateOrder = new MagentoCreateOrderAndCustomer();
        magentoCreateOrder.CreateOrder(driver);
    }

    @Test(priority = 4)
    public void CreateOrderAndCustomerMagento2() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        MagentoCreateOrderAndCustomer magentoCreateOrder = new MagentoCreateOrderAndCustomer();
        magentoCreateOrder.CreateOrder(driver);

        PresentExplicitXpath(driver,".//*[@id='order-view-hold-button']");
    }

    @Test(priority = 5)
    public void CreateOrderAndCustomerMagento3() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        MagentoCreateOrderAndCustomer magentoCreateOrder = new MagentoCreateOrderAndCustomer();
        magentoCreateOrder.CreateOrder(driver);

        PresentExplicitXpath(driver,".//*[@id='order_invoice']");
        ClickableExplicitXpath(driver,".//div/button[@title='Submit Invoice']");

        WebElement element = driver.findElement(By.xpath(".//*[@id='messages']/div/div/div"));
        String strng = element.getText();
        Assert.assertEquals("The invoice has been created.", strng);
    }

    @Test(priority = 6)
    public void DeleteChanelMagento() throws InterruptedException, InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        ChanelMagento chanelMagento = new ChanelMagento();
        chanelMagento.DeleteChanel(driver);
    }

    @Test(priority = 7)
    public void CreateMagentoChannel() throws InterruptedException, InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        ChanelMagento chanelMagento = new ChanelMagento();
        chanelMagento.CreateChanel(driver);
    }

    @Test(priority = 8)
    public void CreateOrderAndCustomerMagentoSecond1() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");
        MagentoCreateOrderAndCustomer magentoCreateOrder = new MagentoCreateOrderAndCustomer();
        magentoCreateOrder.CreateOrder(driver);
    }

    @Test(priority = 9)
    public void CreateOrderAndCustomerMagentoSecond2() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");

        MagentoCreateOrderAndCustomer magentoCreateOrder = new MagentoCreateOrderAndCustomer();
        magentoCreateOrder.CreateOrder(driver);
        PresentExplicitXpath(driver,".//*[@id='order-view-hold-button']");
    }

    @Test(priority = 10)
    public void CreateOrderAndCustomerMagentoSecond3() throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver, "admin", "admin123456");

        MagentoCreateOrderAndCustomer magentoCreateOrder = new MagentoCreateOrderAndCustomer();
        magentoCreateOrder.CreateOrder(driver);

        PresentExplicitXpath(driver,".//*[@id='order_invoice']");
        ClickableExplicitXpath(driver,".//div/button[@title='Submit Invoice']");

        WebElement element = driver.findElement(By.xpath(".//*[@id='messages']/div/div/div"));
        String str1 = element.getText();
        Assert.assertEquals("The invoice has been created.", str1);
    }
}

