package Test;
import BaseTest.BaseTest;
import Methods.LoginEasyErp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.io.InterruptedIOException;



public class Order extends BaseTest  {

    @Test
    public void orderTest () throws InterruptedException, InterruptedIOException{
        Thread.sleep(2000);
        LoginEasyErp loginEasyErp = new LoginEasyErp();
        loginEasyErp.login(driver,"grigorevskiiy@gmail.com","vitya9595");
        Thread.sleep(3000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/order/list");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[1]/div/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form/div[1]/div[1]/div[2]/div/a[@id='customerDd']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[1]/div[2]/div/a/div/div/ul/li[@id='57cf19b1b99e65f83cfeffa8']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Add an item")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Select SKU")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tr[1]/td[1]/div/div/a/div/div/ul/li[7]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("discount")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("discount")).sendKeys("10.00");
        Thread.sleep(2000);
        driver.findElement(By.id("create-person-dialog")).click();
        Thread.sleep(3000);
        String element = driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[2]")).getText();
        driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/div/fieldset/div[1]/ul/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div/div/form/fieldset/div[1]/ul/li[4]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form/fieldset/div[1]/ul/li[4]/ul/li[1]/a/span[1]")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/order/list");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("html/body/div[4]/div[4]/div[2]/div[1]/div/div[1]/div")).sendKeys(element);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("html/body/div[4]/div[4]/div[2]/div[1]/div/div[1]/div")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[2]/table/tbody/tr[9]/td[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[2]/div[2]/div/fieldset/div[1]/ul/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div/div/form/fieldset/div[1]/ul/li[6]/div/button")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/invoice/list");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/table/tbody/tr[1]/td[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/div/fieldset/div/ul/li/button[4]")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://live.easyerp.com/#easyErp/order/list");
        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//div/fieldset/div[1]/ul/li/button[1]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//form/fieldset/div[1]/ul[1]/li[3]/a")).click();
//        Thread.sleep(2000);



    }
}
