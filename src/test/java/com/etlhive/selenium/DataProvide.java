package com.etlhive.selenium;

import org.testng.annotations.DataProvider;

public class DataProvide {
	@DataProvider(name="abc")
public static Object[][] googleTest1() //reurn type is Object for all data type bcs we dont know what form data will bet
{
	return new Object[][]{{"ABC","PQR"}};
		
		
		/*{"ABC","12132423534","fsdf","test@gmail.com"}, 
	{"pqr","12132423534","fsdf","test@gmail.com"},
	{"LMN","12132423534","fsdf","test@gmail.com"},
	{"RTY","12132423534","fsdf","test@gmail.com"}};*/
}
}
