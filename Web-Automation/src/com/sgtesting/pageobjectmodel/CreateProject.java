package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProject {
	public static WebDriver wb3=null;
	public static ActiTimePage act=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyouot();
		createCustomer();
		createproject();
		deletecustomer();
		logout();
		closeapplication();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb3=new ChromeDriver();
			act=new ActiTimePage(wb3);
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
			act.getusername().sendKeys("admin");
			act.getpassword().sendKeys("manager");
			act.getlogin().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void minimizeFlyouot()
	{
		try {
			act.getFlyoutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createCustomer()
	{
		try {
			act.getTask().click();
			Thread.sleep(2000);
			act.getcustomer().click();
			Thread.sleep(2000);
			act.getnewcustomer().click();
			Thread.sleep(2000);
			act.getentercustomer().sendKeys("lenovo");
			act.getcreatecustomer().click();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private static void createproject()
	{
		try {
			act.getcustomer().click();
			Thread.sleep(2000);
			act.getnewproject().click();
			Thread.sleep(2000);
			act.getenterproject().sendKeys("Testing1");
			Thread.sleep(2000);
			
			act.getcreateproject1().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			act.getsetting1().click();
			Thread.sleep(2000);
			act.getsaction1().click();
			Thread.sleep(2000);
			act.getdeletecl().click();
			Thread.sleep(2000);
			act.getdeletepermanent().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			act.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb3.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
