package Test;
import BaseTest.BaseTest;
import Methods.EasyERP.LoginEasyErp;
import Methods.Login.LoginShopify;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;
import static BaseTest.Waits.WaitsMethod.ClickableExplicit;
import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;
import static BaseTest.Waits.WaitsMethod.PresentExplicit;


public class ShopiFy  extends BaseTest {
    @Test
    public void CreateOrder() throws InterruptedException, InterruptedIOException {
        LoginShopify loginShopify = new LoginShopify();
        loginShopify.login(driver,"norbert.madyar@thinkmobiles.com","123456qwerty");
        driver.findElement(By.xpath("//aside[@id='AppFrameAside']/div[2]/div[2]/div/div/nav/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Create order')])[2]")).click();
        driver.findElement(By.xpath("//input[@id='']")).clear();
        driver.findElement(By.xpath("//input[@id='']")).sendKeys("I");
        driver.findElement(By.id("product_search_input")).clear();
        driver.findElement(By.id("product_search_input")).sendKeys("Iphone");
        driver.findElement(By.xpath(".//*[@id='product_checkbox_11210373252']")).click();
        driver.findElement(By.id("add-products")).click();
        Thread.sleep(2000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,200);");
        PresentExplicit(driver,"//form/div[1]/div/div[1]/div/div/div[2]/div/div[3]/div/button[2]");
        ClickableExplicit(driver,"//div[2]/div[5]/form/div[2]/div/div[2]/div/button");
    }

    @Test
    public void VerifyOrder () throws InterruptedIOException, InterruptedException{
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver,"grigorevskiiy@gmail.com","vitya9595");
        Thread.sleep(3000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/integrations/shopify");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("html/body/div[4]/div[4]/div[2]/div[1]/div/span[1]")).click();
        String ordresValue = driver.findElement(By.xpath(".//*[@id='content-holder']/div[2]/div/div[4]/div[2]/div[2]/span")).getText();
        int waitTo = 0;
        do{
            String finalorderValue = driver.findElement(By.xpath(".//*[@id='content-holder']/div[2]/div/div[4]/div[2]/div[2]/span")).getText();
            if(!ordresValue.equals(finalorderValue)){
                waitTo = 1;
            }
            else {
                Thread.sleep(5000);
                driver.navigate().refresh();
            }
        }
        while(waitTo==0);
    }
}

