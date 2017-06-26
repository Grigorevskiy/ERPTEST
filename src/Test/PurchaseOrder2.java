package Test;
import BaseTest.BaseTest;
import Methods.BalanceSheet;
import Methods.CreatingOrders.CreatingOrder;
import Methods.LoginEasyErp;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;


public class PurchaseOrder2 extends BaseTest {
    @Test
    public void CreateOrder2() throws InterruptedException, InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");

        Thread.sleep(4000);
        CreatingOrder creatingOrder = new CreatingOrder();
        creatingOrder.CreateOrder(driver);

        Thread.sleep(3000);
        //Delivery
        driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[2]")).click();
        String URL = driver.getCurrentUrl();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form/fieldset/div[1]/ul/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[1]/ul/li[5]/ul/li[1]/a/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[3]/div/button[1]")).click();

        driver.navigate().to(URL);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[1]/ul/li[2]/ul/li[1]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).sendKeys("6.125");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[3]/div/button[1]")).click();

        Thread.sleep(2000);
        driver.navigate().to(URL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[1]/ul/li[2]/ul/li[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).sendKeys("6.125");
        driver.findElement(By.xpath("//div[3]/div/button[1]")).click();

        Thread.sleep(2000);
        driver.navigate().to(URL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[1]/ul/li[2]/ul/li[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).sendKeys("6.125");
        driver.findElement(By.xpath("//div[3]/div/button[1]")).click();

        Thread.sleep(2000);
        driver.navigate().to(URL);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[1]/ul/li[2]/ul/li[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).sendKeys("6.125");
        driver.findElement(By.xpath("//div[3]/div/button[1]")).click();

        //CreateInvoice
        driver.navigate().to(URL);
        Thread.sleep(4500);
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='createPersonsForm']/fieldset/div[1]/ul/button")).click();

        Thread.sleep(3000);
        //Approve
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/ul/li/button[4]")).click();
    }

    @Test
    public void BalanceSheet () throws InterruptedException, InterruptedIOException{
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        Thread.sleep(3000);
        BalanceSheet balanceSheet = new BalanceSheet();
        balanceSheet.VerifyBalanceSheet(driver);
    }
}
