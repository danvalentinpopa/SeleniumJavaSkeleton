package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SamplePageElements;

public class SampleActions {
    private final SamplePageElements samplePageElements;

    public SampleActions(WebDriver driver) {
        this.samplePageElements = new SamplePageElements(driver);
    }

    public void clickMoreInfoLink() {
        WebElement moreInfoLink = samplePageElements.getMoreInfoLink();
        moreInfoLink.click();
    }

    // Add more action methods as needed
}
