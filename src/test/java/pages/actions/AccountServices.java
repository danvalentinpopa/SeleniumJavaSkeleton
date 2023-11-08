package pages.actions;

import org.openqa.selenium.WebDriver;
import pages.elements.AccountServicesElements;

public class AccountServices {
    private AccountServicesElements elements;

    public AccountServices(WebDriver driver){
        this.elements = new AccountServicesElements(driver);
    }

    public void clickOnTheAccountOverviewButton(){
        elements.getAccountOverview().click();
    }

    public void clickOnTheFirstAccount(){
        elements.getFirstAccount().click();
    }

    public String firstAccountNumber(){
        return  elements.getFirstAccount().getText();
    }

    public String accountDetailTitle(){
        return elements.getAccountDetailsTitle().getText();
    }

    public String accountNumberFromAccountDetail(){
        return elements.getAccountNumberFromAccountDetails().getText();
    }

    public void clickOnTheTransferFundsButton(){
        elements.getTransferFundsButton().click();
    }
}
