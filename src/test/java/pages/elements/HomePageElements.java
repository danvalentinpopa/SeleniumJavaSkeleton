package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements {
    private final WebDriver driver;

    public HomePageElements(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getRegisterButton(){
        return driver.findElement(By.linkText("Register"));
    }
}
