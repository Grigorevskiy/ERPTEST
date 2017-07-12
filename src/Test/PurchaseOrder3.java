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


public class PurchaseOrder3 extends BaseTest {
    @Test(priority=1)
    public void CreateOrder () throws InterruptedException , InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");

        Thread.sleep(3000);
        CreatingOrder creatingOrder = new CreatingOrder();
        creatingOrder.CreateOrder(driver);


        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='listTable']/tr[1]/td[2]");
        String URLorder = driver.getCurrentUrl();

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div/fieldset/div[1]/ul/button");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='formContent']/div/div/div[1]/div/ul/button");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        //Approve
        Thread.sleep(2000);
        ClickableExplicitXpath(driver,".//*[@id='listTable']/tr[1]/td[2]");
        InvisibilityExplicit(driver,".//*[@id='loading']");

        String URLinvoice = driver.getCurrentUrl();
        ClickableExplicitXpath(driver,"//div/ul/li/button[4]");
        driver.navigate().to(URLorder);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        Thread.sleep(2000);
        ClickableExplicitXpath(driver,".//*[@id='editButton']");
        InvisibilityExplicit(driver,".//*[@id='loading']");
//        ClickableExplicitXpath(driver,".//*[@id='editButton']");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='formContent']/div/div/div[1]/div/ul[1]/li[3]/span");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='formContent']/div/div/div[1]/div/ul[1]/li[3]/ul/li[1]/a/span[2]");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='goodsInNotesSaveBtn']");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        //Payment
        driver.navigate().to(URLinvoice);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div/fieldset/div/ul/li[2]/a");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div/fieldset/div/ul/li[2]/ul/li[1]/a/span");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='create-payment-dialog']");
        LogOut logOut = new LogOut();
        logOut.logout(driver);
    }

    @Test(priority=2)
    public void BalanceSheet () throws InterruptedException, InterruptedIOException{
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        Thread.sleep(5000);
        BalanceSheet balanceSheet = new BalanceSheet();
        balanceSheet.VerifyBalanceSheet(driver);
    }
}

