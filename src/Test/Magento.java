package Test;


import BaseTest.BaseTest;
import Methods.LoginMagento;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.InterruptedIOException;

public class Magento extends BaseTest{
    @Test
    public void CreateOrderMagento () throws InterruptedException, InterruptedIOException {
        LoginMagento loginMagento = new LoginMagento();
        loginMagento.login(driver,"admin","admin123456");

    }
}
