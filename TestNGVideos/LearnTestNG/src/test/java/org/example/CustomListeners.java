package org.example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {
    public void onStart(ITestContext testContext) {
        System.out.println("Starts Test Execution ..... " + testContext.getName());
    }

    public void onFinish(ITestContext testContext) {
        System.out.println("Finish Test Execution ..... " + testContext.getName());
    }

    public void onTestStart(ITestResult testResult) {
        System.out.printf("Starts test ..... " + testResult.getName());
    }

    public void onTestSkipped(ITestResult testResult) {
        System.out.printf("Skipped test ...... " + testResult.getName());
    }

    public void onTestSuccess(ITestResult testResult) {
        System.out.printf("Passed test ...... " + testResult.getName());
    }

    public void onTestFailure(ITestResult testResult) {
        System.out.printf("Failed test ...... " + testResult.getName());
    }

    public void onTestFailedButWithSuccessPercentage(ITestResult testResult) {
        System.out.println("Failed test but ...... " + testResult.getName());
    }
}
