package Methods.Magento;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.InterruptedIOException;
import java.sql.Driver;
import java.util.List;
import java.util.NoSuchElementException;

import static BaseTest.Waits.WaitsMethod.*;
import static org.openqa.selenium.Keys.ENTER;


public class ChanelMagento {
    String MagentoChanel = "https://live.easyerp.com/#easyErp/integrations/magento";

    public void test1(WebDriver driver) throws InterruptedException, InterruptedIOException {
        Thread.sleep(3000);
        driver.navigate().to(MagentoChanel);
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        Thread.sleep(2000);
        ClickableExplicitXpath(driver, ".//*[@id='content-holder']/div[2]/div/div[1]/div[2]/span");
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        PresentExplicitXpath(driver, ".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]");
        Thread.sleep(2000);

        List<WebElement> element = driver.findElements(By.xpath(".//*[@id='ui-id-3']/button"));
        if (element.size() > 0) {
            InvisibilityExplicit(driver, ".//*[@id='loading']");
            ClickableExplicitXpath(driver, ".//*[@id='ui-id-3']/button");
            InvisibilityExplicit(driver, ".//*[@id='loading']");
            Thread.sleep(4000);
            ClickableExplicitXpath(driver, ".//*[@id='conflictBlock']/div/table/thead/tr/th[1]/label/span");
            ClickableExplicitXpath(driver, ".//*[@id='conflictBlock']/div/table/thead/tr/th[2]/div/div/div[1]");
            PresentExplicitXpath(driver, ".//*[@id='conflictBlock']/div/table/thead/tr/th[2]/div/div/div[2]");
            InvisibilityExplicit(driver, ".//*[@id='loading']");
            Thread.sleep(2000);
//            if (0 != driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[3]/a[2]")).size()) {

//            WebElement element = driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[3]/a[2]"));
//            if (element.size() > 0){
            List<WebElement> element1 = driver.findElements(By.xpath(".//*[@id='listTable']/tr/td[3]/a[2]"));
            if (element1.size() > 0) {
                for (int i = 0; i > element1.size(); i++)


                    ClickableExplicitXpath(driver, ".//*[@id='listTable']/tr[1]/td[3]/a[2]");
                InvisibilityExplicit(driver, ".//*[@id='loading']");

//                    WebElement map = driver.findElement(By.xpath(".//*[@id='buildProduct']"))
                    List<WebElement> element2 = driver.findElements(By.xpath(".//*[@id='buildProduct']"));
                    if (element2.size() > 0) {
                        driver.findElement(By.xpath(".//*[@id='name']")).clear();
                        driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("efwe");
                        driver.findElement(By.xpath(".//*[@id='sku']")).clear();
                        driver.findElement(By.xpath(".//*[@id='sku']")).sendKeys("ewfwe");
                        ClickableExplicitXpath(driver, ".//*[@id='buildProduct']");
                        InvisibilityExplicit(driver, ".//*[@id='loading']");
                        ClickableExplicitXpath(driver, ".//*[@id='resolve-saveBtn']");
                        InvisibilityExplicit(driver, ".//*[@id='loading']");

//                    }else
                    }
//                ClickableExplicitXpath(driver, ".//*[@id='listTable']/tr/td[3]/a[2]");
//                driver.findElement(By.xpath(".//*[@id='name']")).clear();
//                driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("efwe");
//                driver.findElement(By.xpath(".//*[@id='sku']")).clear();
//                driver.findElement(By.xpath(".//*[@id='sku']")).sendKeys("ewfwe");
//                ClickableExplicitXpath(driver, ".//*[@id='buildProduct']");
//                InvisibilityExplicit(driver, ".//*[@id='loading']");
//                ClickableExplicitXpath(driver, ".//*[@id='resolve-saveBtn']");
//                InvisibilityExplicit(driver, ".//*[@id='loading']");

                    for (int i = 0; i > element1.size(); i++)
//                    driver.findElement(By.xpath(".//*[@id='listTable']/tr[2]/td[3]/a[2]")).click();


                        Thread.sleep(3000);
                    driver.navigate().to(MagentoChanel);
                    InvisibilityExplicit(driver, ".//*[@id='loading']");
                    PresentExplicitXpath(driver, ".//*[@id='content-holder']/div[2]/div/div[1]/div[2]/span");
                    InvisibilityExplicit(driver, ".//*[@id='loading']");
                    PresentExplicitXpath(driver, ".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]");
                    Thread.sleep(2000);
                    driver.switchTo().alert().accept();

                }else ClickableExplicitXpath(driver, ".//*[@id='resolve-saveBtn']");
                driver.navigate().to(MagentoChanel);
                InvisibilityExplicit(driver, ".//*[@id='loading']");
                PresentExplicitXpath(driver, ".//*[@id='content-holder']/div[2]/div/div[1]/div[2]/span");
                InvisibilityExplicit(driver, ".//*[@id='loading']");
                PresentExplicitXpath(driver, ".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]");
                Thread.sleep(2000);
                driver.switchTo().alert().accept();

            } else driver.switchTo().alert().accept();
        }

    public void DeleteChanel (WebDriver driver) throws InterruptedException, InterruptedIOException {
//        driver.navigate().to(MagentoChanel);
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='submenuHolder']/nav/ul/li[4]/i");
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        ClickableExplicitXpath(driver,".//*[@id='submenuHolder']/nav/ul/li[4]/div/ul/li[3]/a");
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        ClickableExplicitXpath(driver, ".//*[@id='content-holder']/div[2]/div/div[1]/div[2]");
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        PresentExplicitXpath(driver, ".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]");

        List<WebElement> element = driver.findElements(By.xpath(".//*[@id='ui-id-3']/button"));
        if (element.size() > 0) {
            InvisibilityExplicit(driver, ".//*[@id='loading']");
            ClickableExplicitXpath(driver, ".//*[@id='ui-id-3']/button");
            InvisibilityExplicit(driver, ".//*[@id='loading']");
            Thread.sleep(2000);
            ClickableExplicitXpath(driver, ".//*[@id='conflictBlock']/div/table/thead/tr/th[1]/label/span");
            ClickableExplicitXpath(driver, ".//*[@id='conflictBlock']/div/table/thead/tr/th[2]/div/div/div[1]");
            PresentExplicitXpath(driver, ".//*[@id='conflictBlock']/div/table/thead/tr/th[2]/div/div/div[2]");
            InvisibilityExplicit(driver, ".//*[@id='loading']");




            List<WebElement> CountButton = driver.findElements(By.xpath(".//*[@id='listTable']/tr/td[3]/a[2]"));
//                int waitTo = 1;
            if (CountButton.size() > 0) {

                do {
                    ClickableExplicitXpath(driver, ".//*[@id='listTable']/tr[1]/td[3]/a[2]");
                    InvisibilityExplicit(driver, ".//*[@id='loading']");


//                    waitTo = 0;

//                } while (CountButton.size() == 0) ;

                    if (driver.findElements(By.xpath(".//*[@id='buildProduct']")).size() > 0) {
                        ClickableExplicitXpath(driver, ".//*[@id='buildProduct']");
                        InvisibilityExplicit(driver, ".//*[@id='loading']");
                        driver.findElement(By.xpath(".//*[@id='name']")).clear();
                        driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("efwe");
                        driver.findElement(By.xpath(".//*[@id='sku']")).clear();
                        driver.findElement(By.xpath(".//*[@id='sku']")).sendKeys("ewfwe");
                        InvisibilityExplicit(driver, ".//*[@id='loading']");
                        Thread.sleep(4000);
                        ClickableExplicitXpath(driver, ".//*[@id='buildProduct']");
                        InvisibilityExplicit(driver, ".//*[@id='loading']");

                    } else
                        InvisibilityExplicit(driver, ".//*[@id='loading']");
                    driver.findElement(By.xpath(".//*[@id='resolve-saveBtn']"));
//                        waitTo = 0;

                } while (0 == CountButton.size());
//                }  while(waitTo==0);

            }else
            Thread.sleep(4000);
            ClickableExplicitXpath(driver,".//*[@id='resolve-saveBtn']");
            Thread.sleep(3000);
            InvisibilityExplicit(driver, ".//*[@id='loading']");
            driver.navigate().to(MagentoChanel);
            InvisibilityExplicit(driver, ".//*[@id='loading']");
            PresentExplicitXpath(driver, ".//*[@id='content-holder']/div[2]/div/div[1]/div[2]/span");
            InvisibilityExplicit(driver, ".//*[@id='loading']");
            PresentExplicitXpath(driver, ".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]");
            Thread.sleep(2000);
            driver.switchTo().alert().accept();

        } else driver.switchTo().alert().accept();
    }

    public void CreateChanel(WebDriver driver) throws InterruptedIOException, InterruptedException {
        Thread.sleep(3000);
        driver.navigate().to(MagentoChanel);
        InvisibilityExplicit(driver, ".//*[@id='loading']");
        PresentExplicitXpath(driver, ".//*[@id='content-holder']/div[1]/div/span[2]");
        ClickableExplicitXpath(driver, ".//*[@id='channelLogoContainer']/li[1]/img");

        driver.findElement(By.xpath(".//*[@id='channelName']")).clear();
        driver.findElement(By.xpath(".//*[@id='channelName']")).sendKeys("Magento Test Channel");
        ClickableExplicitXpath(driver, ".//*[@id='continueBtn']");
        driver.findElement(By.xpath(".//*[@id='baseURL']")).sendKeys("http://magento-test.easyerp.com");
        driver.findElement(By.xpath(".//*[@id='apiuser']")).clear();
        driver.findElement(By.xpath(".//*[@id='apiuser']")).sendKeys("admin");

        driver.findElement(By.xpath(".//*[@id='apipassword']")).clear();
        driver.findElement(By.xpath(".//*[@id='apipassword']")).sendKeys("admin123456");
        InvisibilityExplicit(driver, ".//*[@id='loading']");

        ClickableExplicitXpath(driver, ".//*[@id='warehouse']");
        driver.findElement(By.xpath(".//*[@id='57dfc6ea6066337b771e99e2']")).click();
        InvisibilityExplicit(driver, ".//*[@id='loading']");

        driver.findElement(By.xpath(".//*[@id='location']")).click();
        ClickableExplicitXpath(driver, ".//*[@id='57dfc7076066337b771e99e4']");
        InvisibilityExplicit(driver, ".//*[@id='loading']");

        driver.findElement(By.xpath(".//*[@id='priceList']")).click();
        driver.findElement(By.xpath(".//*[@id='58109ae869b3249417f74baf']")).click();
        ClickableExplicitXpath(driver, ".//*[@id='dialogContainer']/div[2]/div[3]/div/button[1]");

        Thread.sleep(3000);
        driver.navigate().to(MagentoChanel);
        InvisibilityExplicit(driver, ".//*[@id='loading']");

        PresentExplicitXpath(driver, ".//*[@id='content-holder']/div[1]/div/span[1]");
        InvisibilityExplicit(driver, ".//*[@id='loading']");

        ClickableExplicitXpath(driver, ".//*[@id='content-holder']/div[2]/div/div[1]/div[1]/div/div");
        ClickableExplicitXpath(driver, ".//*[@id='content-holder']/div[1]/div/span[1]");
    }
}
