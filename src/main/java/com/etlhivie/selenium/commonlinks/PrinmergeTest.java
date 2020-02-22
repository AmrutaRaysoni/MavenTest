package com.etlhivie.selenium.commonlinks;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.etlhive.selenium.ListenerTeat;
@Listeners(ListenerTeat.class)
public class PrinmergeTest  {
		@Test
		public void f2() {
			try {

				System.setProperty("webdriver.chrome.driver",
						"C:\\\\Users\\\\Guest\\\\eclipse-workspace\\\\chromedriver_win32\\\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); // create selenium web driver instance
				String baseurl = "https://lgsuat.neeyamo.com"; //
				driver.get(baseurl); // navigate to url
				// WebElement
				// link=driver.findElement(By.linkText("https://lgsuat.neeyamo.com"));
				// String check=link.getcurrenturl();

				/*
				 * WebElement
				 * link=driver.findElement(By.linkText("https://lgsuat.neeyamo.com"));
				 * if(link.isDisplayed()) { System.out.println("Yes Link is there."); } else
				 * System.out.println("Link is not there");
				 */
				driver.manage().window().maximize();

				// WebElement d=
				// driver.findElement(By.xpath(".//*[@src='images/PrinMerge_logo.png']"));
				WebElement t = driver.findElement(By.xpath(".//*[@src='images/PrinMerge_icon.jpg']"));

				// Thread.sleep(2000);
				if (t.isDisplayed()) {
					System.out.println("Link Verified");
				} else {
					System.out.println("Nort Verified");
				}

				WebElement u = driver.findElement(By.id("txtUsername"));
				u.clear();
				u.sendKeys("payrolladmin");
				WebElement p = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
				p.clear();
				p.sendKeys("Prinmerge@111");
				WebElement b = driver.findElement(By.id("Button1"));
				b.click();
				
				TakesScreenshot srcsht = (TakesScreenshot) driver;
				// reg.click();
				File sourceFile = srcsht.getScreenshotAs(OutputType.FILE);
				File destinationFile = new File("C:\\Users\\Guest\\Desktop\\sreenshot\\test.png");
				FileUtils.copyFile(sourceFile, destinationFile);

				Thread.sleep(2000);

				// Select wrappertable=new
				// Select(driver.findElement(By.xpath(".//*[@src='../../images/Master.png']")));
				// wrappertable.selectByVisibleText("Wrapper Table");
				// wrappertable.click();
				// WebElement wt
				// =driver.findElement(By.xpath(".//*[@src='../../images/Master.png']"));
				// Thread.sleep(1000);
				// Actions action = new Actions(driver);
				// Thread.sleep(2000);
				// action.moveToElement(driver.findElement(By.xpath(".//*[@src='../../images/Master.png']"));
				// action.click().build().perform();
				// Thread.sleep(2000);
				// wt.click();
				// For Masters
				WebElement link = driver.findElement(By.xpath(".//*[@alt='Masters']"));

				Actions builder = new Actions(driver);
				builder.moveToElement(link).build().perform();
				Thread.sleep(1500);

				// For Warpper Table
				WebElement link2 = driver.findElement(By.xpath(".//a[contains(text(),'Wrapper Table')]"));
				link2.click();
				// Actions builder2 = new Actions(driver);
				// builder2.moveToElement(link2).build().perform();
				Thread.sleep(1500);
				// builder.moveToElement(link).moveToElemnt(By.xpath(".//a[contains(text(),'Wrapper
				// Table')]"))
				builder.build().perform();
				Thread.sleep(2000);
				// driver.close();
				WebElement A1 = driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ddlApplication']"));
				A1.click();

				// Select S1= new
				// Select(driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ddlApplication']/*[contains(text(),'PayNComp')]")));
				// S1.selectByVisibleText("PayNComp");

				Select s1 = new Select(
						driver.findElement(By.xpath(".//*[@id=\"ctl00_ContentPlaceHolder1_ddlApplication\"]")));
				s1.selectByValue("8");

				// for creating table
				WebElement txt1 = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperTable']"));
				txt1.sendKeys("TestDemo");

				// for click on submit
				// WebElement
				// btn=driver.findElement(.//*[@id='ctl00_ContentPlaceHolder1_lnkbtSubmit'])
				WebElement btn = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkbtSubmit"));
				btn.click();
				Thread.sleep(2000);

				// For Warpper fields

				WebElement link3 = driver.findElement(By.xpath(".//*[@alt='Masters']"));

				Actions builder2 = new Actions(driver);
				builder2.moveToElement(link3).build().perform();
				Thread.sleep(1500);

				WebElement wf = driver.findElement(By.xpath(".//*[@href='WrapperField.aspx']"));
				wf.click();
				Select s3 = new Select(
						driver.findElement(By.xpath(".//*[@name='ctl00$ContentPlaceHolder1$ddlApplication']")));
				s3.selectByValue("8");

				Thread.sleep(1000);
				Select s2 = new Select(
						driver.findElement(By.xpath(".//*[@name='ctl00$ContentPlaceHolder1$ddlWrapperTable']")));
				s2.selectByValue("34504");

				// wrapperTableName
				WebElement wfname = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperField']"));
				wfname.sendKeys("EmployeeName");

				Thread.sleep(2000);

				WebElement btn3 = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_lnkbtSubmit']"));
				btn3.click();
				Thread.sleep(2000);
				WebElement wfname1 = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperField']"));
				wfname1.clear();
				Thread.sleep(2000);

				WebElement wfname2 = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperField']"));
				wfname2.sendKeys("EmployeeID");

				Thread.sleep(2000);

				WebElement btn4 = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_lnkbtSubmit']"));
				btn4.click();

				WebElement wfname3 = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperField']"));
				wfname3.clear();

				Thread.sleep(2000);

				WebElement wfname5 = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperField']"));
				wfname5.sendKeys("Table1");
				Thread.sleep(2000);

				WebElement btn5 = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_lnkbtSubmit']"));
				btn5.click();
				Thread.sleep(2000);

				WebElement wfname7 = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperField']"));
				wfname7.clear();
				Thread.sleep(2000);

				WebElement wfname6 = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperField']"));
				wfname6.sendKeys("Table2");
				Thread.sleep(2000);

				WebElement btn6 = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_lnkbtSubmit']"));
				btn6.click();
				Thread.sleep(2000);

				WebElement wfname8 = driver
						.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWrapperField']"));
				wfname8.clear();
				Thread.sleep(2000);

				// Template Creation

				WebElement tclink = driver.findElement(By.xpath(".//*[@src='../../images/template-icon.png']"));

				Actions builder3 = new Actions(driver);
				builder3.moveToElement(tclink).build().perform();
				Thread.sleep(1500);
				System.out.println("i am here");
				WebElement temcre = driver.findElement(By.xpath("//a[contains(text(),'Create Template')]"));
				System.out.println("Template creation found");

				temcre.click();
				Thread.sleep(1500);

				Select app = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlApplication")));
				app.selectByValue("8");

				Thread.sleep(2000);

				Select client = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlClient")));
				client.selectByValue("138");
				Thread.sleep(2000);

				WebElement tname = driver.findElement(By.id("txtTemplateName"));
				tname.sendKeys("NeeyamoDemo_SeleniumTest_Payslip");
				Thread.sleep(2000);

				Select wratbl = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlWrapper")));
				wratbl.selectByValue("34504");
				Thread.sleep(2000);

				WebElement temdes = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txttemplateDesc"));
				temdes.sendKeys("NeeyamoDemo_SeleniumTest_Payslip");
				Thread.sleep(2000);

				WebElement subject = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSubject"));
				subject.sendKeys("NeeyamoDemo_SeleniumTest_Payslip");
				Thread.sleep(2000);

				WebElement radio1 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rbMultiLangYes"));
				radio1.click();
				Thread.sleep(2000);

				WebElement radio2 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rbYes"));
				radio2.click();
				Thread.sleep(2000);

				WebElement xaxis = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtXPos"));
				xaxis.sendKeys("200");
				Thread.sleep(2000);

				WebElement yaxis = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtYPos")); 
				yaxis.sendKeys("200");
				Thread.sleep(2000);

			} catch (Exception e) {
			}

		}

	}



