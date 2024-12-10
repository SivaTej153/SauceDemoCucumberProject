package stepDefinitions;

import PageEvents.LoginPageEvents;
import PageObjects.HomePageObjects;
import Utils.Constants;
import Utils.ElementFetch;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginPageStepDef {

    public WebDriver driver;
    public LoginPageEvents loginPage;
    public ElementFetch ele;

    @Before
    public void setup() {
        driver = BaseTest.driverSetup();
        if (driver == null){
            System.out.println("Driver Initialisation Failed");
        }
        else {
            System.out.println("Driver Initialisation Successful");
        }
        driver.manage().window().maximize();
        loginPage = new LoginPageEvents(driver);
        ele = new ElementFetch(driver);
        System.out.println("LoginPage initialized: " + (loginPage != null));

    }

    @After
    public void quitSetup() {
        if(driver!=null) {
            driver.quit();
        }
    }

    @Given("User is in Login page")
    public void user_is_in_login_page() {
        System.out.println("Navigating to URL: " + Constants.url);
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Given("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterCredentials();
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnSubmit();
    }

    @Then("user logs in successfully")
    public void user_logs_in_successfully() {
        Assert.assertFalse(ele.getWebElements("CLASSNAME", HomePageObjects.secondaryContainer).isEmpty(), "element not found");
    }
}