package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modify4 {
	public static WebDriver wb2=null;
	public static ActiTimePage page4=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyouot();
		createCustomer();
		modifyCustomer();
		deletecustomer();
		logout();
		closeapplication();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb2=new ChromeDriver();
			page4=new ActiTimePage(wb2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			wb2.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() 
	{
		try {
			page4.getusername().sendKeys("admin");
			page4.getpassword().sendKeys("manager");
			page4.getlogin().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void minimizeFlyouot()
	{
		try {
			page4.getFlyoutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createCustomer()
	{
		try {
			page4.getTask().click();
			Thread.sleep(2000);
			page4.getcustomer().click();
			Thread.sleep(2000);
			page4.getnewcustomer().click();
			Thread.sleep(2000);
			page4.getentercustomer().sendKeys("hp");
			page4.getcreatecustomer().click();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private static void modifyCustomer()
	{
		try {
			page4.getsetting1().click();
			Thread.sleep(2000);
			page4.getdescription().sendKeys("laptops");
			Thread.sleep(2000);
			page4.getmodifyclose().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			page4.getsetting1().click();
			Thread.sleep(2000);
			page4.getsaction1().click();
			Thread.sleep(2000);
			page4.getdeletecl().click();
			Thread.sleep(2000);
			page4.getdeletepermanent().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			page4.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb2.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


