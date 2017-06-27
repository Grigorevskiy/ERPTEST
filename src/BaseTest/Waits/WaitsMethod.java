package BaseTest.Waits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsMethod {
    public static WebElement PresentExplicit(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
        return null;
    }


    public static void ClickableExplicit(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
    }


    public static void InvisibilityExplicit(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }
}
