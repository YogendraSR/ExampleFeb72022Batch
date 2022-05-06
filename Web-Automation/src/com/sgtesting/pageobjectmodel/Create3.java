package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create3 {
	public static WebDriver wb1=null;
	public static ActiTimePage page3=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyouot();
		createCustomer();
		deletecustomer();
		logout();
		closeapplication();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb1=new ChromeDriver();
			page3=new ActiTimePage(wb1);
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
			page3.getusername().sendKeys("admin");
			page3.getpassword().sendKeys("manager");
			page3.getlogin().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void minimizeFlyouot()
	{
		try {
			page3.getFlyoutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try {
			page3.getTask().click();
			Thread.sleep(2000);
			page3.getcustomer().click();
			Thread.sleep(2000);
			page3.getnewcustomer().click();
			Thread.sleep(2000);
			page3.getentercustomer().sendKeys("dell");
			page3.getcreatecustomer().click();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	private static void deletecustomer()
	{
		try {
			page3.getsetting1().click();
			Thread.sleep(2000);
			page3.getsaction1().click();
			Thread.sleep(2000);
			page3.getdeletecl().click();
			Thread.sleep(2000);
			page3.getdeletepermanent().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			page3.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb1.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
