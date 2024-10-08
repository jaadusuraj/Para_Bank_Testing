package com.parabank.tests;

import com.parabank.base.TestBase;
import com.parabank.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage;
    public LoginTest()
    {
        super();
    }

    @BeforeMethod
    public void startingConfiguration()
    {
        initializeBrowser();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void verifyingApplicationTitle()
    {
        String title = loginPage.verifyLoginPageTitle();
        Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
    }

    @Test(priority = 2)
    public void loginIntoApplication()
    {
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void closingDown()
    {
        driver.quit();
    }
}
