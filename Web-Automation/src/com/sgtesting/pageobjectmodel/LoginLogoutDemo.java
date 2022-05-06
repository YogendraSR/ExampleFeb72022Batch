package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	public static WebDriver wb=null;
	public static ActiTimePage page1=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyouot();
		createUser();
		deleteUser();
		logout();
		closeapplication();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb=new ChromeDriver();
			page1=new ActiTimePage(wb);
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
			page1.getusername().sendKeys("admin");
			page1.getpassword().sendKeys("manager");
			page1.getlogin().click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyouot()
	{
		try {
			page1.getFlyoutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try {
			page1.getusersclick().click();
			page1.getadduser().click();
			page1.getfirstname().sendKeys("demo2");
			page1.getlastname().sendKeys("sr");
			page1.getemail().sendKeys("jjk@gmail.com");
			page1.getusername1().sendKeys("u1");
			page1.getpassword1().sendKeys("pwd");
			page1.getretypepassword().sendKeys("pwd");
			page1.getcreateuser1().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try {
			page1.getpopup().click();
			Thread.sleep(2000);
			page1.getdeleteuser().click();
			Thread.sleep(2000);
			Alert pag=wb.switchTo().alert();
			pag.accept();
			Thread.sleep(2000);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			page1.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try {
			wb.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
