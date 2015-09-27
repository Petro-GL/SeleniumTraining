package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import webdriver.Driver;

import javax.xml.bind.annotation.W3CDomHandler;

/**
 * Created by Petro on 27.09.2015.
 */
public class LoginTest extends Driver {
    @Test
    public void testLogin() {
        HomePage home = new HomePage();
        home.Login("vidmind1@ukr.net", "password1");
    }

}
