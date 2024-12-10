package PageEvents;

import PageObjects.HomePageObjects;
import PageObjects.LoginPageOjects;
import Utils.ElementFetch;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageEvents{

    private WebDriver driver;
    private ElementFetch ele;

    public LoginPageEvents(WebDriver driver) {
        this.driver = driver;
        this.ele = new ElementFetch(driver);
    }

    public void enterCredentials() {
        ele.getWebElement("ID", LoginPageOjects.userNameTextBoxID).sendKeys("standard_user");
        ele.getWebElement("ID", LoginPageOjects.passwordTextBoxID).sendKeys("secret_sauce");
    }

    public void clickOnSubmit() {
        ele.getWebElement("ID", LoginPageOjects.loginButtonID).click();
    }
}
