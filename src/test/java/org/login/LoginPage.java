package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClasss;
import java.util.List;

public class LoginPage extends BaseClasss {
public LoginPage() {
	PageFactory.initElements(driver, this);
}


@FindBy(id="email")
private WebElement txtUserName;
@FindBy(id="pass")
private WebElement txtPassword;

public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}


}