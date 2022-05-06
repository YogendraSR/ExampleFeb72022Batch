package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modify2 {
	public static WebDriver ab=null;
	public static ActiTimePage page2=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyouot();
		createUser();
		modifyUser1();
		deleteUser();
		logout();
		closeapplication();
		
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			ab=new ChromeDriver();
			page2=new ActiTimePage(ab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			ab.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login() 
	{
		try {
			page2.getusername().sendKeys("admin");
			page2.getpassword().sendKeys("manager");
			page2.getlogin().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyouot()
	{
		try {
			page2.getFlyoutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try {
			page2.getusersclick().click();
			page2.getadduser().click();
			page2.getfirstname().sendKeys("demo3");
			page2.getlastname().sendKeys("sry");
			page2.getemail().sendKeys("jhjkg@gmail.com");
			page2.getusername1().sendKeys("u2");
			page2.getpassword1().sendKeys("pwd");
			page2.getretypepassword().sendKeys("pwd");
			page2.getcreateuser1().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyUser1()
	{
		try {
			page2.getpopup1().click();
			Thread.sleep(2000);
			page2.getFirstname().clear();
			Thread.sleep(2000);
			page2.getFirstname().sendKeys("demo4");
			Thread.sleep(2000);
			page2.getsaveschanges().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try {
			page2.getpopup2().click();
			Thread.sleep(2000);
			page2.getdeleteuser().click();
			Thread.sleep(2000);
			Alert pag=ab.switchTo().alert();
			pag.accept();
			Thread.sleep(2000);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			page2.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			ab.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
