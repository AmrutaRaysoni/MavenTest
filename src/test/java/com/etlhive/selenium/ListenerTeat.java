package com.etlhive.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTeat implements ITestListener  {

	public void onFinish(ITestContext arg0) {
		System.out.print("Test Case exicution Finished");// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		System.out.print("Test Case exicution Started");
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.print("Test Case exicution Percentage Success");
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.print("Test Case Fail");
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.print("Test Case exicution Finished");
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.print("Test Case exicution Finished");//browser launching
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.print("Test Case exicution Finished");// when test cases success what action will perform
		// TODO Auto-generated method stub
		
	}
	

}
