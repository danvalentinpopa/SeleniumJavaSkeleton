import actions.SampleActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.DriverFactory;

public class SimpleTest extends BaseTest{

    private SampleActions sampleActions;

    @Test
    public void sampleTest() {
        driver.get("https://www.example.com");

        // Perform actions using the SampleActions class
        sampleActions = new SampleActions(driver); // Initialize SampleActions object
        sampleActions.clickMoreInfoLink();

        // Perform assertions or additional actions
        // ...

        // Example assertion (you can replace it with your own)
        Assert.assertEquals(driver.getTitle(), "Example Domains");
    }
}