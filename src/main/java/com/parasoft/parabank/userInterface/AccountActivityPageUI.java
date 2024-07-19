package com.parasoft.parabank.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountActivityPageUI extends PageObject {

    public static final Target LINK_ACCOUNTS_OVERVIEW = Target.the("Link Accounts Overview").locatedBy("//a[text()='Accounts Overview']");
    public static final Target LBL_SUCCESS_MESSAGE = Target.the("Label Success Message").locatedBy("//td[contains(text(),'*Balance includes deposits that may be subject to holds')]");
    public static final Target LINK_TO_ONE_ACCOUNT = Target.the("Link to One Account").locatedBy("(//tbody//child::a)[1]");
    public static final Target LBL_MESSAGE_ACCOUNT = Target.the("Label Message Account").locatedBy("//h1[contains(text(),'Account Details')]");
    public static final Target SLT_ACTIVITY_PERIOD = Target.the("Select Activity Period").locatedBy("//select[@id='month']");
    public static final Target OPT_ACTIVITY_PERIOD = Target.the("Option Activity Period").locatedBy("(//option[@value='All'])[1]");
    public static final Target SLT_TYPE = Target.the("Select Type").locatedBy("//select[@id='transactionType']");
    public static final Target OPT_TYPE = Target.the("Option Type").locatedBy("(//option[@value='All'])[2]");
    public static final Target BTN_GO = Target.the("Button Go").locatedBy("//input[@value='Go']");


}
