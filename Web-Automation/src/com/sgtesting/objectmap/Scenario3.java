package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
	public static WebDriver oBrow=null;
	public static ObjectMap objmap4=null; 
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createcustomer();
		deletecustomer();
		logout();
		closeapplication();
	}
	private static void launchbrowser()
	{
		String filename=null;
		try {
			filename="D:\\JavaAutomation\\Web-Automation\\objectmap\\ObjectMap.Properties";
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrow=new ChromeDriver();
			objmap4=new ObjectMap(filename);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			oBrow.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			oBrow.findElement(objmap4.getLocator("loginpageusername")).sendKeys("admin");
			oBrow.findElement(objmap4.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
			oBrow.findElement(objmap4.getLocator("loginpageloginbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyout()
	{
		try {
			oBrow.findElement(objmap4.getLocator("minimizeflyoutwindow")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createcustomer()
	{
		try {
			oBrow.findElement(objmap4.getLocator("taskpage")).click();
			Thread.sleep(2000);
			oBrow.findElement(objmap4.getLocator("customeraddnewcustomer")).click();
			Thread.sleep(2000);
			oBrow.findElement(objmap4.getLocator("customercreatenewcustomer")).click();
			Thread.sleep(2000);
			oBrow.findElement(objmap4.getLocator("customername")).sendKeys("amazon");
			oBrow.findElement(objmap4.getLocator("createcustomerbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void deletecustomer()
	{
		try {
			oBrow.findElement(objmap4.getLocator("deletecustomersettings")).click();
			Thread.sleep(2000);
			oBrow.findElement(objmap4.getLocator("deletecustomeraction")).click();
			Thread.sleep(2000);
			oBrow.findElement(objmap4.getLocator("deletecustomerbutton")).click();
			Thread.sleep(2000);
			oBrow.findElement(objmap4.getLocator("deletecustomerpermanently")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			oBrow.findElement(objmap4.getLocator("logoutbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			oBrow.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
