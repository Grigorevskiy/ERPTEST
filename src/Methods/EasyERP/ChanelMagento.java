package Methods.EasyERP;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.InterruptedIOException;

import static BaseTest.Waits.WaitsMethod.*;


public class ChanelMagento {
    String MagentoChanel = "https://live.easyerp.com/#easyErp/integrations/magento";

    public void DeleteChanel(WebDriver driver) throws InterruptedException, InterruptedIOException {
        Thread.sleep(3000);
        driver.navigate().to(MagentoChanel);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        PresentExplicitXpath(driver, ".//*[@id='content-holder']/div[2]/div/div[1]/div[2]/span");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        PresentExplicitXpath(driver, ".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]");
//        driver.switchTo().alert().accept();
    }

    public void CreateChanel(WebDriver driver) throws InterruptedIOException, InterruptedException {
        Thread.sleep(3000);
        driver.navigate().to(MagentoChanel);
        InvisibilityExplicit(driver,".//*[@id='loading']");
        PresentExplicitXpath(driver, ".//*[@id='content-holder']/div[1]/div/span[3]");
        ClickableExplicitXpath(driver, ".//*[@id='channelLogoContainer']/li[1]/img");

        driver.findElement(By.xpath(".//*[@id='channelName']")).clear();
        driver.findElement(By.xpath(".//*[@id='channelName']")).sendKeys("Magento Test Channel");
        ClickableExplicitXpath(driver, ".//*[@id='continueBtn']");
//        driver.findElement(By.xpath(".//*[@id='baseURL']")).clear();
        driver.findElement(By.xpath(".//*[@id='baseURL']")).sendKeys("http://magento-test.easyerp.com");
        driver.findElement(By.xpath(".//*[@id='apiuser']")).clear();
        driver.findElement(By.xpath(".//*[@id='apiuser']")).sendKeys("admin");

        driver.findElement(By.xpath(".//*[@id='apipassword']")).clear();
        driver.findElement(By.xpath(".//*[@id='apipassword']")).sendKeys("admin123456");
        InvisibilityExplicit(driver,".//*[@id='loading']");

        ClickableExplicitXpath(driver, ".//*[@id='warehouse']");
        driver.findElement(By.xpath(".//*[@id='57dfc6ea6066337b771e99e2']")).click();
        InvisibilityExplicit(driver,".//*[@id='loading']");

        driver.findElement(By.xpath(".//*[@id='location']")).click();
//        Thread.sleep(1000);
        ClickableExplicitXpath(driver,".//*[@id='57dfc7076066337b771e99e4']");
//        driver.findElement(By.xpath(".//div/ul/li[1]")).click();
        InvisibilityExplicit(driver,".//*[@id='loading']");

        driver.findElement(By.xpath(".//*[@id='priceList']")).click();
        driver.findElement(By.xpath(".//*[@id='58109ae869b3249417f74baf']")).click();
        ClickableExplicitXpath(driver,".//*[@id='dialogContainer']/div[2]/div[3]/div/button[1]");

Thread.sleep(3000);
        driver.navigate().to(MagentoChanel);

    }
}
