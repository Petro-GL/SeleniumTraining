package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import webdriver.Driver;

/**
 * Created by Petro on 27.09.2015.
 */
public class LoginTest extends Driver {
    @Test
    public void testLogin() {
        HomePage homePage = new HomePage();
        if (homePage.isLoggedIn()){
            homePage.logout();
            waitForPageLoaded();}
        homePage.login("vidmind1@ukr.net", "password");
    }

    @Test
public void testLogout() {
        HomePage homePage = new HomePage();
        if (!homePage.isLoggedIn()){
        homePage.login("vidmind1@ukr.net", "password");
        waitForPageLoaded();}
        homePage.logout();
        }



        }
