package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import webdriver.Driver;

/**
 * Created by Petro on 27.09.2015.
 */
public class HomePage extends Driver {

    private String loginPageUrl = "https://www.ukr.net/";
    private String loginField = "Login";
    private String passwordField = "Password";
    private String username = "username";
    private String logout = "logout";

    public void logout() {

        driver.get(loginPageUrl);
        driver.findElement(By.className(logout)).click();
        waitForPageLoaded();
        Assert.assertTrue(driver.findElement(By.name(loginField)).isDisplayed());

    }

    public void login(String email, String password){


        driver.get(loginPageUrl);
        driver.findElement(By.name(loginField)).sendKeys(email);
        driver.findElement(By.name(passwordField)).sendKeys(password);
        driver.findElement(By.name(passwordField)).submit();
        waitForPageLoaded();

        Assert.assertEquals(driver.findElement(By.className(username)).getText(), email);

    }

   public boolean isLoggedIn (){
       driver.get(loginPageUrl);
       boolean logedIn = driver.findElement(By.className(username)).isDisplayed();
       return logedIn;

    }


}
