package com.parasoft.parabank.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
public class OpenAccountPageUI extends PageObject {
    public static final Target LINK_OPEN_NEW_ACCOUNT = Target.the("Link Open New Account").locatedBy("//a[text()='Open New Account']");
    public static final Target LBL_ACCOUNT_SERVICE = Target.the("Label Account Services").locatedBy("(//h2[contains(text(),'Account Services')])");
    public static final Target SLT_TYPE_ACCOUNT = Target.the("Select Type Account").locatedBy("//select[@id='type']");
    public static final Target OPT_TYPE_ACCOUNT = Target.the("Option Type Account").locatedBy("//option[@value='1']");
    public static final Target BTN_OPEN_NEW_ACCOUNT = Target.the("Button Open New Account").locatedBy("//input[@value='Open New Account']");
    public static final Target LBL_SUCCESS_MESSAGE = Target.the("Label Success Message").locatedBy("(//p[contains(text(),'Congratulations, your account is now open.')])");
}
