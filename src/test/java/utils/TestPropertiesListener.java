package utils;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class TestPropertiesListener implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        ITestContext context = testResult.getTestContext();
        String testPropsFile = context.getCurrentXmlTest().getParameter("testPropsFile");
        if (testPropsFile != null) {
            TestPropertiesLoader.load(testPropsFile);
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // No action needed after invocation
    }
}