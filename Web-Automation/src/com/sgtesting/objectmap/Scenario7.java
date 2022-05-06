package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {
	public static WebDriver wb7=null;
	public static ObjectMap objmap7=null; 
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createcustomer();
		createproject();
		createtask();
		deletetask();
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
			wb7=new ChromeDriver();
			objmap7=new ObjectMap(filename);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			wb7.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			wb7.findElement(objmap7.getLocator("loginpageusername")).sendKeys("admin");
			wb7.findElement(objmap7.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("loginpageloginbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyout()
	{
		try {
			wb7.findElement(objmap7.getLocator("minimizeflyoutwindow")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createcustomer()
	{
		try {
			wb7.findElement(objmap7.getLocator("taskpage")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("customeraddnewcustomer")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("customercreatenewcustomer")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("customername")).sendKeys("TATA");
			wb7.findElement(objmap7.getLocator("createcustomerbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createproject()
	{
		try {
			wb7.findElement(objmap7.getLocator("createprojectaddnew")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("createnewproject")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("createprojectname")).sendKeys("manfacturing");
			wb7.findElement(objmap7.getLocator("createprojectbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createtask()
	{
		try {
			wb7.findElement(objmap7.getLocator("createtaskicon")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("createnewtask")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("createtaskname")).sendKeys("sales");
			wb7.findElement(objmap7.getLocator("createtaskbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void deletetask()
	{
		try {
			wb7.findElement(objmap7.getLocator("deletetasklist")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deletetaskaction")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deletetaskbutton")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deletetaskpermanently")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteproject()
	{
		try {
			wb7.findElement(objmap7.getLocator("deleteprojectsetting")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deleteprojectaction")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deleteprojectbutton")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deleteprojectpermanently")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			wb7.findElement(objmap7.getLocator("deletecustomersettings")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deletecustomeraction")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deletecustomerbutton")).click();
			Thread.sleep(2000);
			wb7.findElement(objmap7.getLocator("deletecustomerpermanently")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			wb7.findElement(objmap7.getLocator("logoutbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb7.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
