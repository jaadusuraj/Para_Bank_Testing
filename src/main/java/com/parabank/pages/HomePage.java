package com.parabank.pages;

import com.parabank.base.TestBase;
import com.parabank.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public HomePage()
    {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    public SignUpPage clickOnRegisterLink()
    {
        TestUtil.clickOnElement(registerLink);
        return new SignUpPage();
    }
}
