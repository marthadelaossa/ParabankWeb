package com.parasoft.parabank.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPageUI extends PageObject{

    public static final Target INPUT_FIRSTNAME = Target.the("Input Firstname").locatedBy("//input[@id='customer.firstName']");
    public static final Target INPUT_LASTNAME = Target.the("Input Lastname").locatedBy("//input[@id='customer.lastName']");
    public static final Target INPUT_ADDRESS = Target.the("Input Address").locatedBy("//input[@id='customer.address.street']");
    public static final Target INPUT_CITY = Target.the("Input City").locatedBy("//input[@id='customer.address.city']");
    public static final Target INPUT_STATE = Target.the("Input State").locatedBy("//input[@id='customer.address.state']");
    public static final Target INPUT_ZIPCODE = Target.the("Input Zip Code").locatedBy("//input[@id='customer.address.zipCode']");
    public static final Target INPUT_TELEPHONE = Target.the("Input Telephone").locatedBy("//input[@id='customer.phoneNumber']");
    public static final Target INPUT_SSN = Target.the("Input SSN").locatedBy("//input[@id='customer.ssn']");
    public static final Target INPUT_USERNAME = Target.the("Input Username").locatedBy("//input[@id='customer.username']");
    public static final Target INPUT_PASSWORD = Target.the("Input Password").locatedBy("//input[@id='customer.password']");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input Confirm Password").locatedBy("//input[@id='repeatedPassword']");
    public static final Target BTN_REGISTER = Target.the("Button Register").locatedBy("//input[@value='Register']");
    public static final Target LBL_ACCOUNT_CREATED = Target.the("Label Account Created").locatedBy("//*[contains(text(),'Your account was created successfully. You are now logged in.')]");

}
