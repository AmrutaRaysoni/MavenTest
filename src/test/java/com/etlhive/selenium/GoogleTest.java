package com.etlhive.selenium;

import java.io.File;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
@Listeners(ListenerTeat.class)
public class GoogleTest {
 
	@Test(dataProvider="abc",dataProviderClass=DataProvide.class)
	//@Parameters({ "firstname", "lastname" })
	public void f1(String ftn, String ltn) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Guest\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		WebElement reg = driver.findElement(By.linkText("REGISTER"));
		reg.click();
		TakesScreenshot srcsht = (TakesScreenshot) driver;
		// reg.click();
		File sourceFile = srcsht.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("c:\\srceenshot\\test.png");
		FileUtils.copyFile(sourceFile, destinationFile);

		WebElement fn = driver.findElement(By.name("firstName"));
		fn.sendKeys(ftn);
		// driver.navigateto().is();
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys(ltn);
		WebElement phno = driver.findElement(By.name("phone"));
		phno.sendKeys("434534");
		WebElement ad = driver.findElement(By.name("address1"));
		ad.sendKeys("Pune");
		WebElement ad2 = driver.findElement(By.name("address2"));
		ad2.sendKeys("India");
		WebElement c = driver.findElement(By.name("city"));
		c.sendKeys("Pune");
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("yture484678");
		WebElement dd = driver.findElement(By.id("select-demo"));
		Select country = new Select(dd);
		// country.selectByValue("");
		country.selectByIndex(1);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
}
