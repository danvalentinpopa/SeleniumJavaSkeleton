import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
        protected WebDriver driver;

        @BeforeSuite
        public void setUp() {
            // Set the path to the chromedriver executable (change as needed)
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        @AfterSuite
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
}
