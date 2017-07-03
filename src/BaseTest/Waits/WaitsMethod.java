package BaseTest.Waits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsMethod {
    public static WebElement PresentExplicitXpath(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
        return null;
    }

    public static void ClickableExplicitXpath(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
    }

    public static void InvisibilityExplicit(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }

    public static WebElement PresentExplicitName(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.presenceOfElementLocated(By.name(locator))).click();
        return null;
    }

    public static void ClickableExplicitName(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.elementToBeClickable(By.name(locator))).click();
    }

    public static WebElement PresentExplicitXpathWithOutClick(WebDriver driver, String locator) {
        (new WebDriverWait(driver, 14))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        return null;
    }
}
