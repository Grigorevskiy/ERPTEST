package Test;
import BaseTest.BaseTest;
import Methods.EasyERP.BalanceSheet;
import Methods.EasyERP.CreatingOrder;
import Methods.EasyERP.LoginEasyErp;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;



public class PurchaseOrder3 extends BaseTest {
    @Test
    public void CreateOrder () throws InterruptedException , InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");

        Thread.sleep(4000);
        CreatingOrder creatingOrder = new CreatingOrder();
        creatingOrder.CreateOrder(driver);

        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        String URLorder = driver.getCurrentUrl();

        //driver.navigate().to(URLorder);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='createPersonsForm']/fieldset/div[1]/ul/button")).click();

        Thread.sleep(3000);
        //Approve
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        String URLinvoice = driver.getCurrentUrl();
        driver.findElement(By.xpath("//div/ul/li/button[4]")).click();

        Thread.sleep(3000);
        //Delivery
        driver.navigate().to(URLorder);
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='editButton']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='createPersonsForm']/fieldset/div[1]/ul[1]/li[3]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[1]/ul[1]/li[3]/ul/li[1]/a/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[3]/div/button[1]")).click();

        //Payment
        Thread.sleep(2000);
        driver.navigate().to(URLinvoice);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/fieldset/div/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/fieldset/div/ul/li[2]/ul/li[1]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='create-payment-dialog']")).click();

        Thread.sleep(3000);
        BalanceSheet balanceSheet = new BalanceSheet();
        balanceSheet.VerifyBalanceSheet(driver);
    }

    @Test
    public void BalanceSheet () throws InterruptedException, InterruptedIOException{
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        Thread.sleep(5000);
        BalanceSheet balanceSheet = new BalanceSheet();
        balanceSheet.VerifyBalanceSheet(driver);
    }
}

