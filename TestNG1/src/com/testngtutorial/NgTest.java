package com.testngtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NgTest {

	@Test(priority =1)
	public void m2()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.out.println("This is test m2");
	}
	// my second commit
	//my third commit
	@Test(invocationCount=7)
	public void m3()
	{
		System.out.println("This is test m3");
	}
	@Parameters({"firstname"})
	@Test(priority =3, description= "vinoth", enabled = true)
	public void m1(String first)
	{
		System.out.println("This is test m1"+ first );
		Assert.assertEquals("Test", "Test");
	}
	
	
}
