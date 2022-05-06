package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modifyproject6 {
	public static WebDriver wb4=null;
	public static ActiTimePage page5=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyouot();
		createCustomer();
		createproject();
		modifyproject();
		deleteProject();
		deletecustomer();
		logout();
		closeapplication();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb4=new ChromeDriver();
			page5=new ActiTimePage(wb4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			wb4.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() 
	{
		try {
			page5.getusername().sendKeys("admin");
			page5.getpassword().sendKeys("manager");
			page5.getlogin().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void minimizeFlyouot()
	{
		try {
			page5.getFlyoutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createCustomer()
	{
		try {
			page5.getTask().click();
			Thread.sleep(2000);
			page5.getcustomer().click();
			Thread.sleep(2000);
			page5.getnewcustomer().click();
			Thread.sleep(2000);
			page5.getentercustomer().sendKeys("TCS");
			page5.getcreatecustomer().click();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private static void createproject()
	{
		try {
			page5.getcustomer().click();
			Thread.sleep(2000);
			page5.getnewproject().click();
			Thread.sleep(2000);
			page5.getenterproject().sendKeys("Devops");
			Thread.sleep(2000);
			page5.getcreateproject1().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyproject()
	{
		try {
			page5.getsettings().click();
			Thread.sleep(2000);
			page5.getdesc1().sendKeys("cloud aws");
			Thread.sleep(2000);
			page5.getclosep().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try {
			page5.getsettingp().click();
			Thread.sleep(2000);
			page5.getactionp().click();
			Thread.sleep(2000);
			page5.getdeletepro().click();
			Thread.sleep(2000);
			page5.getdeletep().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			page5.getsetting1().click();
			Thread.sleep(2000);
			page5.getsaction1().click();
			Thread.sleep(2000);
			page5.getdeletecl().click();
			Thread.sleep(2000);
			page5.getdeletepermanent().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void logout()
	{
		try {
			page5.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb4.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
