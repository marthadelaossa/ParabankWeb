package com.parasoft.parabank.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MainPageUI extends PageObject {
    public static final Target LNK_MENU_REGISTER = Target.the("Link Menu Register").locatedBy("//a[text()='Register']");
    public static final Target INPUT_USERNAME=Target.the("Input User name").locatedBy("//input[@name='username']");
    public static final Target INPUT_PASSWORD=Target.the("Input Password").locatedBy("//input[@name='password']");
    public static final Target BTN_LOGIN=Target.the("Button Login").locatedBy("//input[@value='Log In']");
}
