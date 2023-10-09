package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenshotUtility {
    private final WebDriver driver;
    private final ExtentTest test;

    public ScreenshotUtility(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public void captureScreenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            Path screenshotPath = Paths.get("TestReport/screenshots", result.getName() + ".png");

            try {
                FileUtils.copyFile(source, screenshotPath.toFile());
                test.addScreenCaptureFromPath(screenshotPath.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
