package com.parasoft.parabank.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountsOverviewPageUI extends PageObject  {
    public static final Target LINK_ACCOUNTS_OVERVIEW = Target.the("Link Accounts Overview").locatedBy("//a[text()='Accounts Overview']");
    public static final Target LBL_SUCCESS_MESSAGE = Target.the("Label Success Message").locatedBy("(//td[contains(text(),'*Balance includes deposits that may be subject to hold')])");
}
