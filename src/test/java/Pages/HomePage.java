package pages;

import org.testng.Assert;
import webdriver.Driver;

/**
 * Created by Petro on 27.09.2015.
 */
public class HomePage extends Driver {

    private String LOGIN_PAGE_URL = "https://www.ukr.net/";

    public void Login (String email, String password){
        driver.get(LOGIN_PAGE_URL);


        Assert.assertTrue(driver.getCurrentUrl().equals(LOGIN_PAGE_URL));

    }


}
