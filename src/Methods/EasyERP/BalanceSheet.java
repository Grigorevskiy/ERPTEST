package Methods.EasyERP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.InterruptedIOException;



public class BalanceSheet {
    public void VerifyBalanceSheet (WebDriver driver) throws InterruptedIOException,InterruptedException{
        Thread.sleep(3000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/balanceSheet/list");
//        Thread.sleep(2000);
        String TotalAssets = driver.findElement(By.xpath(".//*[@id='totalAssetsSumm']/span")).getText();
        String TotalLiabilities = driver.findElement(By.xpath(".//*[@id='totalSumm']/span")).getText();

        Assert.assertEquals(TotalAssets, TotalLiabilities);

//        if(TotalAssets.equals(TotalLiabilities)){
//            System.out.println("Balance Sheet is completed");
//        }
//        else {
//            System.out.println("Balance Sheet ERROR");
//        }
    }
}
