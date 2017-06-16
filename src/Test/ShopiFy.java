package Test;
import BaseTest.BaseTest;
import Methods.LoginEasyErp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;


public class ShopiFy  extends BaseTest {
    @Test
    public void CreateOrder() throws InterruptedException, InterruptedIOException {
        driver.findElement(By.id("Login")).clear();
        driver.findElement(By.id("Login")).sendKeys("norbert.madyar@thinkmobiles.com");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("123456qwerty");
        Thread.sleep(2000);
        driver.findElement(By.name("commit")).click();
        Thread.sleep(70000);
        driver.findElement(By.xpath("//aside[@id='AppFrameAside']/div[2]/div[2]/div/div/nav/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Create order')])[2]")).click();
        driver.findElement(By.xpath("//input[@id='']")).clear();
        driver.findElement(By.xpath("//input[@id='']")).sendKeys("S");
        driver.findElement(By.id("product_search_input")).clear();
        driver.findElement(By.id("product_search_input")).sendKeys("Samsung");
        Thread.sleep(4000);
        driver.findElement(By.id("product_checkbox_11181011460")).click();
        driver.findElement(By.id("add-products")).click();
        Thread.sleep(2000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,300);");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div/div[2]/div/div[3]/div/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[2]/div[5]/form/div[2]/div/div[2]/div/button")).click();
        Thread.sleep(2000);
       // driver.findElement(By.name("commit")).click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("scroll(0,300);");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//form/div[2]/div/div/div/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div/div/nav/ul[1]/li[2]/ul/li[2]/a/span")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div/div/table/tbody/tr[1]/td[2]/a")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div/div[2]/div/div[3]/div/button[2]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("html/body/div[8]/div[2]/div[5]/form/div[2]/div/div[2]/div/button")).click();
//        Thread.sleep(2000);
//        assertEquals("Draft was created", driver.findElement(By.cssSelector("p.ui-flash__message")).getText());
//        String LogERP = "https://testdemo.easyerp.com/";
//        driver.get(LogERP);
        driver.navigate().to("https://live.easyerp.com/#login");
        Thread.sleep(3000);
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver,"grigorevskiiy@gmail.com","vitya9595");
        Thread.sleep(2000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/integrations/shopify");
        Thread.sleep(4000);
        driver.findElement(By.xpath("html/body/div[4]/div[4]/div[2]/div[1]/div/span[1]")).click();
        Thread.sleep(20000);
//        driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[2]")).isDisplayed();
//        driver.findElement(By.cssSelector("div.selectDd")).click();
//        driver.findElement(By.xpath("//div[2]/div/ul/li[@data-id='CRM']")).click();
//        driver.findElement(By.name("ulogin")).clear();
//        driver.findElement(By.name("ulogin")).sendKeys("superAdmin");
//        driver.findElement(By.id("upass")).clear();
//        driver.findElement(By.id("upass")).sendKeys("111111");
//        driver.findElement(By.id("loginTrigger")).click();
//        Thread.sleep(4000);
//        driver.navigate().to("https://testdemo.easyerp.com/#easyErp/integrations/shopify");
//        Thread.sleep(4000);
    }

    @Test
    public void VerifyOrder () throws InterruptedIOException, InterruptedException{
        String erp = "https://testdemo.easyerp.com/#easyErp/integrations/shopify";
        driver.get(erp);
    }
}
