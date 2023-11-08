package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthentificationUtils {

    private final WebDriver driver;

    public AuthentificationUtils(WebDriver driver){
        this.driver = driver;
    }

    public void login(String user, String pass){

    }

    public void register(String user, String pass){

        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        WebElement address = driver.findElement(By.id("customer.address.street"));
        WebElement city = driver.findElement(By.id("customer.address.city"));
        WebElement state = driver.findElement(By.id("customer.address.state"));
        WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        WebElement username = driver.findElement(By.id("customer.username"));
        WebElement password = driver.findElement(By.id("customer.password"));
        WebElement repeatedPassword = driver.findElement(By.id("repeatedPassword"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Register']"));

        firstName.sendKeys("Dan");
        lastName.sendKeys("Popa");
        address.sendKeys("bucharest");
        city.sendKeys("bucharest");
        state.sendKeys("bucharest");
        zipCode.sendKeys("123456");
        ssn.sendKeys("456789");
        username.sendKeys(user);
        password.sendKeys(pass);
        repeatedPassword.sendKeys(pass);
        submitButton.click();

    }
}
