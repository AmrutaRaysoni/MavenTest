package com.etlhive.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass {
 @Test(priority=0)
	public void required()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guest\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Required is running");
		driver.close();
	}
 @Test(invocationCount=2,priority=1,groups="abc") //run 5 times bcs of invocation,groups if there are multiple methods under group
	public void optional()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guest\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Optional is running");
		driver.close();
	}
 @Test(dependsOnMethods= {"required"},priority=2,alwaysRun=false) // for dependsOnMethods "required" will run first
	public void testing()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guest\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Optional is testing");
		driver.close();
	}
	
		
	}

