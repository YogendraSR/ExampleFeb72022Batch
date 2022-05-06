package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static WebDriver wb=null;
	public static ObjectMap objmap=null; 
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createcustomer();
		deleteuser();
		logout();
		closeapplication();
	}
	private static void launchbrowser()
	{
		String filename=null;
		try {
			filename="D:\\JavaAutomation\\Web-Automation\\objectmap\\ObjectMap.Properties";
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb=new ChromeDriver();
			objmap=new ObjectMap(filename);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			wb.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			wb.findElement(objmap.getLocator("loginpageusername")).sendKeys("admin");
			wb.findElement(objmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
			wb.findElement(objmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyout()
	{
		try {
			wb.findElement(objmap.getLocator("minimizeflyoutwindow")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createcustomer()
	{
		try {
			wb.findElement(objmap.getLocator("userslink")).click();
			Thread.sleep(2000);
			wb.findElement(objmap.getLocator("addusers")).click();
			Thread.sleep(2000);
			wb.findElement(objmap.getLocator("userspagefirstname")).sendKeys("basu");
			wb.findElement(objmap.getLocator("userspagelastname")).sendKeys("raju");
			wb.findElement(objmap.getLocator("userspageemail")).sendKeys("fff@gmail.com");
			wb.findElement(objmap.getLocator("userspageusername")).sendKeys("n1");
			wb.findElement(objmap.getLocator("userspagepassword")).sendKeys("pwd");
			wb.findElement(objmap.getLocator("userspageretypepassword")).sendKeys("pwd");
			wb.findElement(objmap.getLocator("userspagecreateuserbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteuser()
	{
		try {
			wb.findElement(objmap.getLocator("deleteuserlist")).click();
			Thread.sleep(2000);
			wb.findElement(objmap.getLocator("deleteuserbutton")).click();
			Thread.sleep(2000);
			wb.switchTo().alert().accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			wb.findElement(objmap.getLocator("logoutbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
