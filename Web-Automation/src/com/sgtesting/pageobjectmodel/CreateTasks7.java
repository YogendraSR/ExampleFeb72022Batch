package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTasks7 {

	public static WebDriver wb5=null;
	public static ActiTimePage crt=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyouot();
		createCustomer();
		createproject();
		createTask();
		deleteTask();
		deleteProject();
		deletecustomer();
		logout();
		closeapplication();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb5=new ChromeDriver();
			crt=new ActiTimePage(wb5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			wb5.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() 
	{
		try {
			crt.getusername().sendKeys("admin");
			crt.getpassword().sendKeys("manager");
			crt.getlogin().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void minimizeFlyouot()
	{
		try {
			crt.getFlyoutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createCustomer()
	{
		try {
			crt.getTask().click();
			Thread.sleep(2000);
			crt.getcustomer().click();
			Thread.sleep(2000);
			crt.getnewcustomer().click();
			Thread.sleep(2000);
			crt.getentercustomer().sendKeys("HCL");
			crt.getcreatecustomer().click();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private static void createproject()
	{
		try {
			crt.getcustomer().click();
			Thread.sleep(2000);
			crt.getnewproject().click();
			Thread.sleep(2000);
			crt.getenterproject().sendKeys("Backend");
			Thread.sleep(2000);
			crt.getcreateproject1().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createTask()
	{
		try {
			crt.getaddtask1().click();
			Thread.sleep(2000);
			crt.getcreatenewtask().click();
			Thread.sleep(2000);
			crt.gettaskname().sendKeys("deployment");
			Thread.sleep(2000);
			crt.getcreatetask().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteTask()
	{
		try {
			crt.getviewtask1().click();
			Thread.sleep(2000);
			crt.getactiontask1().click();
			Thread.sleep(2000);
			crt.getdeletetask().click();
			Thread.sleep(2000);
			crt.getdeleteperm().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try {
			crt.getsettingp().click();
			Thread.sleep(2000);
			crt.getactionp().click();
			Thread.sleep(2000);
			crt.getdeletepro().click();
			Thread.sleep(2000);
			crt.getdeletep().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			crt.getsetting1().click();
			Thread.sleep(2000);
			crt.getsaction1().click();
			Thread.sleep(2000);
			crt.getdeletecl().click();
			Thread.sleep(2000);
			crt.getdeletepermanent().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void logout()
	{
		try {
			crt.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb5.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
