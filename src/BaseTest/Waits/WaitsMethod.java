package BaseTest.Waits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsMethod {
    public static void PresentExplicit(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
    }
    public static void ClickableExplicit(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
    }
    public static void InvisibilityExplicit(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }
}
