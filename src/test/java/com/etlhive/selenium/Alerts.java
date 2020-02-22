package com.etlhive.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args)
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guest\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		WebElement button1=driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button"));
		button1.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("Alert 1 Tested .");
		
		WebElement button2=driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button"));
		
		
		button2.click();
		driver.switchTo().alert().accept();
		button2.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(15000);
		System.out.println("Alert 2 Tested .");

		
		WebElement button3=driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[3]/div[2]/button"));
		button3.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("Amruta");
		al.accept();
		button3.click();
		al.sendKeys("Ray");
		al.dismiss();
		Thread.sleep(4000);
		System.out.println("Alert 3 Tested Successfully ");
		driver.close();
		System.out.println("Alert Tested Successfully ");
		
		}	
		catch(Exception e)
		{
		}
		
	}
		// TODO Auto-generated method stub

	}


