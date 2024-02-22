package com.parabank.pages;

import com.parabank.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    public LoginPage()
    {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="username")
    WebElement userName;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginButton;


    public String verifyLoginPageTitle()
    {
        return driver.getTitle();
    }

    public void login(String uName,String pwd)
    {
        userName.sendKeys(uName);
        password.sendKeys(pwd);
        loginButton.click();
    }
}
