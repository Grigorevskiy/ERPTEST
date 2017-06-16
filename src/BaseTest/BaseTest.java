package BaseTest;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    public WebDriver driver;
    public String baseUrl = "https://easyerp-test.myshopify.com/admin";
    public static Integer seconds = 5000;


        @BeforeTest
        public void SetUp() {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get(baseUrl);
//        Cookie name = new Cookie("_udr", "yIHd7OO2DC62Y64ouKEuZWX1h1iNEppvxewZU2Z7OVuGhPEQBflzhzZFchFvpX8JTI11U3f438qOr-hU4JefWOq7a7YZUGXoob\n" +
//                "P8d-klA1-geWnyNuLkk5Ux4KIDWG4SbA4UlRKzA27iwDgIE97VTIh1TTfxuhWNFgTpMPRZeFfP3-Phi03JNMc6oACBr7nya-QXfGAc_RSjinIJsHJgyg\n" +
//                "==");
//        driver.manage().addCookie(name);
        }

        @AfterTest
        public void tearDown() throws Exception {
            driver.quit();
        }
    }