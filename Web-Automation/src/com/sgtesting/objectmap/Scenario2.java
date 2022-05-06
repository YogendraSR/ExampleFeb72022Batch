package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
	public static WebDriver wb1=null;
	public static ObjectMap objmap1=null; 
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createuser();
		modifyuser();
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
			wb1=new ChromeDriver();
			objmap1=new ObjectMap(filename);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			wb1.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			wb1.findElement(objmap1.getLocator("loginpageusername")).sendKeys("admin");
			wb1.findElement(objmap1.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
			wb1.findElement(objmap1.getLocator("loginpageloginbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyout()
	{
		try {
			wb1.findElement(objmap1.getLocator("minimizeflyoutwindow")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		try {
			wb1.findElement(objmap1.getLocator("userslink")).click();
			Thread.sleep(2000);
			wb1.findElement(objmap1.getLocator("addusers")).click();
			Thread.sleep(2000);
			wb1.findElement(objmap1.getLocator("userspagefirstname")).sendKeys("basu");
			wb1.findElement(objmap1.getLocator("userspagelastname")).sendKeys("raju");
			wb1.findElement(objmap1.getLocator("userspageemail")).sendKeys("fff@gmail.com");
			wb1.findElement(objmap1.getLocator("userspageusername")).sendKeys("n1");
			wb1.findElement(objmap1.getLocator("userspagepassword")).sendKeys("pwd");
			wb1.findElement(objmap1.getLocator("userspageretypepassword")).sendKeys("pwd");
			wb1.findElement(objmap1.getLocator("userspagecreateuserbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyuser()
	{
		try {
			wb1.findElement(objmap1.getLocator("modifyuserclick")).click();
			Thread.sleep(2000);
			wb1.findElement(objmap1.getLocator("modifyuserfirstname")).clear();
			Thread.sleep(2000);
			wb1.findElement(objmap1.getLocator("modifyuserfirstname")).sendKeys("raju");
			Thread.sleep(2000);
			wb1.findElement(objmap1.getLocator("modifyusersavechanges")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			wb1.findElement(objmap1.getLocator("deleteuserlist")).click();
			Thread.sleep(2000);
			wb1.findElement(objmap1.getLocator("deleteuserbutton")).click();
			Thread.sleep(2000);
			wb1.switchTo().alert().accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			wb1.findElement(objmap1.getLocator("logoutbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
