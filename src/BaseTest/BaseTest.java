package BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    public WebDriver driver;
    public static Integer seconds = 5000;
    public static Wait<WebDriver> wait;

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

        @BeforeTest
        public void SetUp () {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
            //WebDriverWait wait = new WebDriverWait(driver, 10);

        }
        @AfterTest
        public void tearDown () throws Exception {
            driver.quit();
        }
    }