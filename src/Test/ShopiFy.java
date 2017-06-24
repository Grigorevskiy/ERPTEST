package Test;
import BaseTest.BaseTest;
import Methods.LoginEasyErp;
import Methods.LoginShopify;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;


public class ShopiFy  extends BaseTest {
    @Test
    public void CreateOrder() throws InterruptedException, InterruptedIOException {
        LoginShopify loginShopify = new LoginShopify();
        loginShopify.login(driver,"norbert.madyar@thinkmobiles.com","123456qwerty");
        driver.findElement(By.xpath("//aside[@id='AppFrameAside']/div[2]/div[2]/div/div/nav/ul/li[2]/a/span")).click();
       // Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[contains(text(),'Create order')])[2]")).click();
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='']")).clear();
        driver.findElement(By.xpath("//input[@id='']")).sendKeys("I");
        driver.findElement(By.id("product_search_input")).clear();
        driver.findElement(By.id("product_search_input")).sendKeys("Iphone");
        driver.findElement(By.xpath(".//*[@id='product_checkbox_11210373252']")).click();
        driver.findElement(By.id("add-products")).click();
        Thread.sleep(2000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,200);");
        wait = new WebDriverWait(driver,5);

//        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[1]/div/div[1]/div/div/div[2]/div/div[3]/div/button[2]"))).click();
        //myDynamicElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[2]/div[5]/form/div[2]/div/div[2]/div/button")))).click();

    }

    @Test
    public void VerifyOrder () throws InterruptedIOException, InterruptedException{
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver,"grigorevskiiy@gmail.com","vitya9595");
        Thread.sleep(2000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/integrations/shopify");
        Thread.sleep(5000);
        driver.findElement(By.xpath("html/body/div[4]/div[4]/div[2]/div[1]/div/span[1]")).click();
        String ordresValue = driver.findElement(By.xpath(".//*[@id='content-holder']/div[2]/div/div[3]/div[2]/div[2]/span")).getText();
        int waitTo = 0;
        do{
            String finalorderValue = driver.findElement(By.xpath(".//*[@id='content-holder']/div[2]/div/div[3]/div[2]/div[2]/span")).getText();
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

