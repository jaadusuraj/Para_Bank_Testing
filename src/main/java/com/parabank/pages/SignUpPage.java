package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.parabank.base.TestBase;

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
//        TestUtil.sendValues(firstNameField, fName);
        firstNameField.sendKeys(fName);
//        TestUtil.sendValues(lastNameField,lName);
        lastNameField.sendKeys(lName);
//        TestUtil.sendValues(addressField,add);
        addressField.sendKeys(add);
//        TestUtil.sendValues(cityField,city);
        cityField.sendKeys(city);
//        TestUtil.sendValues(stateField,state);
        stateField.sendKeys(state);
//        TestUtil.sendValues(zipcodeField,zip);
        zipcodeField.sendKeys(zip);
//        TestUtil.sendValues(ssnField,ssn);
        ssnField.sendKeys(ssn);
//        TestUtil.sendValues(userNameField,uName);
        userNameField.sendKeys(uName);
//        TestUtil.sendValues(passwordField,pwd);
        passwordField.sendKeys(pwd);
//        TestUtil.sendValues(confirmPasswordField,cpwd);
        confirmPasswordField.sendKeys(cpwd);
//        TestUtil.clickOnElement(registerButton);
        registerButton.click();
    }
}
