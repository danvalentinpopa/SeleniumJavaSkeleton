package tests.bdd;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.actions.AuthentificationUtils;
import pages.actions.HomePage;
import utils.WebDriverManagerBDD;

public class ViewAccountDetails{

    public WebDriver driver;

//    @Before
//    public void setUpClass() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://parabank.parasoft.com/parabank/index.htm");
//    }

    @Given("I am logged in to my Parabank account")
    public void i_am_logged_in_to_my_parabank_account() {

        driver = WebDriverManagerBDD.getDriver();

        HomePage homePage = new HomePage(driver);
        homePage.clickOnRegisterButton();

        AuthentificationUtils authentificationUtils = new AuthentificationUtils(driver);
        authentificationUtils.register("test123", "pass");
    }

    @When("I click on the Accounts link")
    public void i_click_on_the_accounts_link() {

    }

    @And("I select an account")
    public void i_select_an_account() {

    }

    @Then("I should see the account details")
    public void i_should_see_the_account_details() {

    }


    @After
    public void tearDownClass() {
        WebDriverManagerBDD.quitDriver();
    }
}
