package PageEvents;

import PageObjects.CheckOutOverviewPageElemets;
import Utils.ElementFetch;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPageEvents {

    private WebDriver driver;
    private ElementFetch ele;

    public CheckOutOverviewPageEvents(WebDriver driver) {
        this.driver = driver;
        this.ele = new ElementFetch(driver);
    }
    public void finish() {
        ele.getWebElement("ID", CheckOutOverviewPageElemets.finishID).click();
    }
}