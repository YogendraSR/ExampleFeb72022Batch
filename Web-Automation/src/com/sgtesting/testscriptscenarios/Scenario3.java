package com.sgtesting.testscriptscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
	public static WebDriver wb1=null;
	public static void main(String[] args) {
		launchBrowser(); 
		navigate();
		login();
		minimizeFlyoutwindow();
		logout();
		closeApplication();

	}
	private static void launchBrowser() 
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb1=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			wb1.get("http://localhost/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			wb1.findElement(By.id("username")).sendKeys("admin");
			wb1.findElement(By.name("pwd")).sendKeys("manager");
			wb1.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutwindow()
	{
		try {
			wb1.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			wb1.findElement(By.className("logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void closeApplication()
	{
		try {
			wb1.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
