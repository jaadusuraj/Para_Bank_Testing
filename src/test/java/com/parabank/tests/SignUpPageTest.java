package com.parabank.tests;

import com.parabank.base.TestBase;
import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.pages.SignUpPage;
import com.parabank.util.TestUtil;
import org.testng.annotations.*;

public class SignUpPageTest extends TestBase {

    HomePage homePage;
    SignUpPage signUpPage;

    String sheetName = prop.getProperty("sheetname");

    public SignUpPageTest()
    {
        super();
    }

    @BeforeSuite
    public void startingConfiguration()
    {
        initializeBrowser();
        homePage = new HomePage();
        signUpPage = new SignUpPage();
    }

    @Test(priority = 0)
    public void clickingOnRegistrationButton()
    {
        homePage.clickOnRegisterLink();
    }

    @DataProvider
    public Object[][] getRegisterTestData()
    {
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }

    @Test(priority = 1, dataProvider = "getRegisterTestData")
    public void signingUp(String first_name, String last_name, String address, String city, String state, String zipCode, String ssn, String user_name, String password, String confirmPassword)
    {
        signUpPage.signUp(first_name, last_name, address, city, state, zipCode, ssn, user_name, password,confirmPassword);
    }

    @AfterSuite
    public void closingDown()
    {
        driver.quit();
    }
}
