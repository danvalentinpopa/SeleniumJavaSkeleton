package tests.bdd;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.actions.AccountServices;
import utils.WebDriverManagerBDD;

public class TransferFundsBetweenAccounts {

    private WebDriver driver;
    private AccountServices accountServices;



    @When("I click on the Transfer Funds link")
    public void i_click_on_the_transfer_funds_link() {

        driver = WebDriverManagerBDD.getDriver();

        accountServices = new AccountServices(driver);
        accountServices.clickOnTheTransferFundsButton();

    }
    @And("I transfer {int} between two of my accounts")
    public void i_transfer_between_two_of_my_accounts(Integer int1) {

    }
    @Then("the transfer should be successful")
    public void the_transfer_should_be_successful() {

    }
    @And("the account balances should be updated")
    public void the_account_balances_should_be_updated() {

    }
    @After
    public void tearDownClass() {
        WebDriverManagerBDD.quitDriver();
    }
}
