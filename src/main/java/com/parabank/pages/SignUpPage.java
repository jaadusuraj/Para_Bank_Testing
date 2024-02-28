package com.parabank.pages;

import com.parabank.base.TestBase;
import com.parabank.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase {

    public SignUpPage()
    {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "customer.firstName")
    WebElement firstNameField;

    @FindBy(id = "customer.lastName")
    WebElement lastNameField;

    @FindBy(id = "customer.address.street")
    WebElement addressField;

    @FindBy(id = "customer.address.city")
    WebElement cityField;

    @FindBy(id = "customer.address.state")
    WebElement stateField;

    @FindBy(id = "customer.address.zipCode")
    WebElement zipcodeField;

    @FindBy(id = "customer.ssn")
    WebElement ssnField;

    @FindBy(id = "customer.username")
    WebElement userNameField;

    @FindBy(id = "customer.password")
    WebElement passwordField;

    @FindBy(id = "repeatedPassword")
    WebElement confirmPasswordField;

    @FindBy(css = "input[value='Register']")
    WebElement registerButton;

    public void signUp(String fName, String lName, String add, String city, String state, String zip, String ssn, String uName, String pwd, String cpwd)
    {
        TestUtil.sendValues(firstNameField, fName);
        TestUtil.sendValues(lastNameField,lName);
        TestUtil.sendValues(addressField,add);
        TestUtil.sendValues(cityField,city);
        TestUtil.sendValues(stateField,state);
        TestUtil.sendValues(zipcodeField,zip);
        TestUtil.sendValues(ssnField,ssn);
        TestUtil.sendValues(userNameField,uName);
        TestUtil.sendValues(passwordField,pwd);
        TestUtil.sendValues(confirmPasswordField,cpwd);
        TestUtil.clickOnElement(registerButton);
    }


}
