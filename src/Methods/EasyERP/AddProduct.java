package Methods.EasyERP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.InterruptedIOException;
import static BaseTest.Waits.WaitsMethod.ClickableExplicitXpath;
import static BaseTest.Waits.WaitsMethod.InvisibilityExplicit;
import static BaseTest.Waits.WaitsMethod.PresentExplicitXpath;



public class AddProduct {
    public void AddProductERP(WebDriver driver) throws InterruptedIOException, InterruptedException {
//        Thread.sleep(3000);
//        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.navigate().to("https://live.easyerp.com/#easyErp/Products/list");
        Thread.sleep(3000);
//        Thread.sleep(2000);
//        PresentExplicitXpath(driver,".//*[@id='submenuHolder']/nav/ul/li[7]/i");
//        InvisibilityExplicit(driver,".//*[@id='loading']");
//
//        ClickableExplicitXpath(driver,".//*[@id='submenuHolder']/nav/ul/li[7]/div/ul/li[2]/a");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        PresentExplicitXpath(driver,".//*[@id='top-bar-createBtn']");
//        driver.findElement(By.xpath(".//*[@id='top-bar-createBtn']")).click();
        InvisibilityExplicit(driver,".//*[@id='loading']");

        driver.findElement(By.xpath(".//*[@id='product']")).clear();
        driver.findElement(By.xpath(".//*[@id='product']")).sendKeys("MacBook");
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath("//div[1]/div[1]/div/div[2]/div[2]/label[1]/span")).click();
        driver.findElement(By.xpath(".//*[@id='SKU']")).clear();
        driver.findElement(By.xpath(".//*[@id='SKU']")).sendKeys("000123");
        driver.findElement(By.xpath(".//*[@id='showBtn']")).click();
        driver.findElement(By.xpath(".//*[@id='productCategories']/li[5]/label[1]/span")).click();
        driver.findElement(By.xpath(".//*[@id='linkProduct']")).click();
        InvisibilityExplicit(driver,".//*[@id='loading']");
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).click();
//CreateList
        InvisibilityExplicit(driver,"//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='createEmployeeForm']/ul/li[4]/a");
        driver.findElement(By.xpath("//div/div/div[1]/div/dl[1]/div[2]/dd/input")).clear();
        driver.findElement(By.xpath("//div/div/div[1]/div/dl[1]/div[2]/dd/input")).sendKeys("10");
        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[1]/dd/input")).clear();
        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[1]/dd/input")).sendKeys("2");
        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[2]/dd/input")).clear();
        driver.findElement(By.xpath("//div/div/div/div[1]/div/dl[2]/div[2]/dd/input")).sendKeys("20");
        driver.findElement(By.xpath(".//*[@id='saveBtn']")).click();
    }
}
