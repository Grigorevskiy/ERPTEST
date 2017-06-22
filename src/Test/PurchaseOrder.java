package Test;
import BaseTest.BaseTest;
import Methods.LoginEasyErp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;

import static org.testng.AssertJUnit.assertEquals;


public class PurchaseOrder extends BaseTest{
//  public static String ordername;
    @Test
    public void CreateOrder () throws InterruptedException , InterruptedIOException {
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver, "grigorevskiiy@gmail.com", "vitya9595");
        Thread.sleep(3000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/purchaseOrders/list");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[4]/div[1]/div/a[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/form/div[1]/div[1]/div[2]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("57c993c1d07eb4d23e0b8c42")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[1]/div[3]/div[1]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[1]/div/a/div/div/ul/li[1]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div/div/div/table/tbody/tr/td/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tr[1]/td[1]/div/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='57d688229a9879d511e835b5']/b")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div/div/div/table/tbody/tr/td/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/table/tbody/tr[3]/td[1]/div/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='5898663372c8e19c34cd6919']/b")).click();
        Thread.sleep(1000);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div/div/div/table/tbody/tr/td/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tr[5]/td[1]/div/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='5898663372c8e19c34cd691b']/b")).click();

        driver.findElement(By.id("discount")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("discount")).sendKeys("10.00");
        Thread.sleep(2000);
        driver.findElement(By.id("create-person-dialog")).click();
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
        String ordername = name.getText();
        name.click();
        Thread.sleep(1000);

        String URL = driver.getCurrentUrl();
        Thread.sleep(1000);
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

        driver.navigate().to(URL);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//fieldset/div[1]/ul/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[1]/ul/li[5]/ul/li[1]/a/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[3]/div/button[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[2]/div/fieldset/div[1]/ul/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/form/fieldset/div[1]/ul/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/fieldset/div/ul/li/button[4]")).click();
        Thread.sleep(2000);

        //Balance Sheet
//        driver.navigate().to("https://live.easyerp.com/#easyErp/balanceSheet/list");
//        Thread.sleep(2000);
//        String TotalAssets = driver.findElement(By.xpath(".//*[@id='totalAssetsSumm']/span")).getText();
//        String TotalLiabilities = driver.findElement(By.xpath(".//*[@id='totalSumm']/span")).getText();
//
//        if(TotalAssets.equals(TotalLiabilities)){
//            System.out.println("Balance Sheet is completed");
//        }
//        else {
//            System.out.println("Balance Sheet ERROR");
//        }


    }

    @Test
    public void PartialPayments() throws InterruptedIOException,InterruptedException{
        driver.navigate().to("https://live.easyerp.com/#easyErp/balanceSheet/list");
        Thread.sleep(2000);
        String TotalAssets = driver.findElement(By.xpath(".//*[@id='totalAssetsSumm']/span")).getText();
        String TotalLiabilities = driver.findElement(By.xpath(".//*[@id='totalSumm']/span")).getText();

        if(TotalAssets.equals(TotalLiabilities)){
            System.out.println("Balance Sheet is completed");
        }
        else {
            System.out.println("Balance Sheet ERROR");
        }
    }
}


