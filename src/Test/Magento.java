package Test;
import BaseTest.BaseTest;
import Methods.LoginMagento;
import org.junit.Test;
import org.openqa.selenium.By;
import java.io.InterruptedIOException;



public class Magento extends BaseTest{
    @Test
    public void CreateOrderMagento () throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver,"admin","admin123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div[4]/table/thead/tr/th[1]/div/label")).click();

    }
}
