package com.parasoft.parabank.userInterface;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

public class TransferFundsPageUI extends PageObject {

    public static final Target LINK_TRANSFER_FUNDS = Target.the("Link Transfer Funds").locatedBy("//a[text()='Transfer Funds']");
    public static final Target INPUT_AMOUNT = Target.the("Input Amount").locatedBy("(//input[@id='amount'])");
    public static final Target SLT_FROM_ACCOUNT_ID = Target.the("Select From Account Id").locatedBy("//select[@id='fromAccountId']");
    public static final Target OPT_FROM_ACCOUNT_ID = Target.the("Option From Account Id").locatedBy("(//select[@id='fromAccountId']//child::option)[1]");
    public static final Target SLT_TO_ACCOUNT_ID = Target.the("Select To Account Id").locatedBy("//select[@id='toAccountId']");
    public static final Target OPT_TO_ACCOUNT_ID = Target.the("Option To Account Id").locatedBy("(//select[@id='toAccountId']//child::option)[2]");
    public static final Target BTN_TRANSFER = Target.the("Button Transfer").locatedBy("//input[@value='Transfer']");
    public static final Target LBL_SUCCESS_MESSAGE = Target.the("Label Success Message").locatedBy("//h1[contains(text(),'Transfer Complete!')]");
}
