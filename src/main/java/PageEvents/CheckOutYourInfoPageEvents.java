package PageEvents;

import PageObjects.CheckOutYourInfoPageElements;
import Utils.ElementFetch;
import org.openqa.selenium.WebDriver;

public class CheckOutYourInfoPageEvents {

    private WebDriver driver;
    private ElementFetch ele;

    public CheckOutYourInfoPageEvents(WebDriver driver) {
        this.driver = driver;
        this.ele = new ElementFetch(driver);
    }
    public void enterReqDetails() {
        ele.getWebElement("ID", CheckOutYourInfoPageElements.firstNameID).sendKeys("Siva Tej");
        ele.getWebElement("ID", CheckOutYourInfoPageElements.lastNameID).sendKeys("secret_sauce");
        ele.getWebElement("ID", CheckOutYourInfoPageElements.zipCodeID).sendKeys("14221");
        ele.getWebElement("ID", CheckOutYourInfoPageElements.continueID).click();
    }
}
