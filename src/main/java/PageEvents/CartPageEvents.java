package PageEvents;

import PageObjects.CartPageElements;
import Utils.ElementFetch;
import org.openqa.selenium.WebDriver;

public class CartPageEvents {

    private WebDriver driver;
    private ElementFetch ele;

    public CartPageEvents(WebDriver driver) {
        this.driver = driver;
        this.ele = new ElementFetch(driver);
    }
    public void clickOnCheckout() {
        ele.getWebElement("ID", CartPageElements.checkOutID).click();
    }
}
