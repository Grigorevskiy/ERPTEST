package Methods.EasyERP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.InterruptedIOException;

import static BaseTest.Waits.WaitsMethod.ClickableExplicitXpath;
import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;
import static BaseTest.Waits.WaitsMethod.PresentExplicitXpath;


public class CreatingOrder {
    public void CreateOrder(WebDriver driver) throws InterruptedException, InterruptedIOException {
        driver.navigate().to("https://live.easyerp.com/#easyErp/purchaseOrders/list");

        Thread.sleep(4000);
        InvisibilityExplicit(driver,".//*[@id='loading']");

        ClickableExplicitXpath(driver,"//div[4]/div[1]/div/a[1]");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[2]/form/div[1]/div[1]/div[2]/div/a");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.id("57c993c1d07eb4d23e0b8c42")).click();

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[1]/div[3]/div[1]/div/a");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[1]/div/a/div/div/ul/li[1]");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[2]/div/div/div/table/tbody/tr/td/a");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//tr[1]/td[1]/div/div/a");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='57d688229a9879d511e835b5']/b");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[2]/div/div/div/table/tbody/tr/td/a");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div/table/tbody/tr[3]/td[1]/div/div/a");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='content']/ul/li[11]/a[2]");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='5898663372c8e19c34cd6919']/b");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//div[2]/div/div/div/table/tbody/tr/td/a");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver,"//tr[5]/td[1]/div/div/a");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        ClickableExplicitXpath(driver, ".//*[@id='content']/ul/li[11]/a[2]");

        InvisibilityExplicit(driver,".//*[@id='loading']");
        PresentExplicitXpath(driver,".//*[@id='5898663372c8e19c34cd691b']/b");
        driver.findElement(By.id("discount")).clear();
        driver.findElement(By.id("discount")).sendKeys("10.00");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.id("create-person-dialog")).click();
        InvisibilityExplicit(driver,".//*[@id='loading']");
    }
}
