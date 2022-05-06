package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario5 {
	public static WebDriver wb3=null;
	public static ObjectMap objmap3=null; 
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createcustomer();
		createproject();
		modifyproject();
		deleteproject();
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
			wb3=new ChromeDriver();
			objmap3=new ObjectMap(filename);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			wb3.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			wb3.findElement(objmap3.getLocator("loginpageusername")).sendKeys("admin");
			wb3.findElement(objmap3.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("loginpageloginbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyout()
	{
		try {
			wb3.findElement(objmap3.getLocator("minimizeflyoutwindow")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createcustomer()
	{
		try {
			wb3.findElement(objmap3.getLocator("taskpage")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("customeraddnewcustomer")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("customercreatenewcustomer")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("customername")).sendKeys("Suzuki");
			wb3.findElement(objmap3.getLocator("createcustomerbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createproject()
	{
		try {
			wb3.findElement(objmap3.getLocator("createprojectaddnew")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("createnewproject")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("createprojectname")).sendKeys("car manfacturing");
			wb3.findElement(objmap3.getLocator("createprojectbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyproject()
	{
		try {
			wb3.findElement(objmap3.getLocator("modifyprojectsetting")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("modifyprojectdescription")).sendKeys("automobiles");
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("modifyprojectclose")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try {
			wb3.findElement(objmap3.getLocator("deleteprojectsetting")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("deleteprojectaction")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("deleteprojectbutton")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("deleteprojectpermanently")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			wb3.findElement(objmap3.getLocator("deletecustomersettings")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("deletecustomeraction")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("deletecustomerbutton")).click();
			Thread.sleep(2000);
			wb3.findElement(objmap3.getLocator("deletecustomerpermanently")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			wb3.findElement(objmap3.getLocator("logoutbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb3.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
