package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamplePageElements {
    private WebDriver driver;

    public SamplePageElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMoreInfoLink() {
        return driver.findElement(By.linkText("More information..."));
    }

    // Add more web element selectors as needed
}
