package kz.beeline.test.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListenerImpl implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + " --- Started");
        Reporter.log(iTestResult.getName() + " --- Started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + " --- Success");
        Reporter.log(iTestResult.getName() + " --- Success");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + " --- Failed");
        Reporter.log(iTestResult.getName() + " --- Failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
