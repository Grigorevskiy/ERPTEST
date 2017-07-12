package Test;
import BaseTest.BaseTest;
import Methods.EasyERP.BalanceSheet;
import Methods.EasyERP.CreatingOrder;
import Methods.EasyERP.LogOut;
import Methods.EasyERP.LoginEasyErp;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;

import static BaseTest.Waits.WaitsMethod.ClickableExplicitXpath;
import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;
import static BaseTest.Waits.WaitsMethod.PresentExplicitXpath;


public class PurchaseOrder2 extends BaseTest {
    @Test(priority=1)
    public void CreateOrder2() throws InterruptedException, InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");

        Thread.sleep(4000);
        CreatingOrder creatingOrder = new CreatingOrder();
        creatingOrder.CreateOrder(driver);

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[2]/table/tbody/tr[1]/td[2]");

        String URL = driver.getCurrentUrl();
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div/fieldset/div[1]/ul/button");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='formContent']/div/div/div[1]/div/ul/li[4]/span");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='formContent']/div/div/div[1]/div/ul/li[4]/ul/li[1]/a/span[1]");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='goodsInNotesSaveBtn']");

        driver.navigate().to(URL);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/li[2]/a")).click();
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[1]/ul/li[2]/ul/li[1]/a/span");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).clear();
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).sendKeys("6.125");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("//div[3]/div/button[1]")).click();

        Thread.sleep(2000);
        driver.navigate().to(URL);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/li[2]/a")).click();
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[1]/ul/li[2]/ul/li[1]/a/span");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).clear();
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).sendKeys("6.125");
        driver.findElement(By.xpath("//div[3]/div/button[1]")).click();

        Thread.sleep(2000);
        driver.navigate().to(URL);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div/fieldset/div[1]/ul/li[2]/a");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[1]/ul/li[2]/ul/li[1]/a/span");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).clear();
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).sendKeys("6.125");
        ClickableExplicitXpath(driver,"//div[3]/div/button[1]");

        Thread.sleep(2000);
        driver.navigate().to(URL);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div/fieldset/div[1]/ul/li[2]/a");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[1]/ul/li[2]/ul/li[1]/a/span");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).clear();
        driver.findElement(By.xpath("//div/div[1]/div[2]/input")).sendKeys("6.125");
        ClickableExplicitXpath(driver,"//div[3]/div/button[1]");

        //CreateInvoice
        driver.navigate().to(URL);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        PresentExplicitXpath(driver,"//div/fieldset/div[1]/ul/button");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='formContent']/div/div/div[1]/div/ul/button[2]");
        //Approve
        InvisibilityExplicit(driver,".//*[@id='loading']");
        Thread.sleep(2000);
        ClickableExplicitXpath(driver,".//*[@id='listTable']/tr[1]/td[2]");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='formContent']/div/fieldset/div/ul/li/button[4]");
        LogOut logOut = new LogOut();
        logOut.logout(driver);
    }

    @Test(priority=2)
    public void BalanceSheet () throws InterruptedException, InterruptedIOException{
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        Thread.sleep(3000);
        BalanceSheet balanceSheet = new BalanceSheet();
        balanceSheet.VerifyBalanceSheet(driver);
    }
}
