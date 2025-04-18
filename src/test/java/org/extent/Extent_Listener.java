package org.extent;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Extent_Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Extent_Reports.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Extent_Reports.exeTest.log(Status.PASS, "TestcasePassed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Extent_Reports.exeTest.log(Status.FAIL,"TestcaseFailed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Extent_Reports.exeTest.log(Status.SKIP, "TestcaseSkipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		Extent_Reports.getInstance();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Extent_Reports.flushReport();
		
	}

}
