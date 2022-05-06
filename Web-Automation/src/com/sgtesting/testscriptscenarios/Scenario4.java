package com.sgtesting.testscriptscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {
	public static WebDriver wb1=null;
	public static void main(String[] args) {
		launchBrowser(); 
		navigate();
		login();
		minimizeFlyoutwindow();
		createcustomer();
		modifycustomer();
		deletecustomer();
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
	
	private static void createcustomer()
	{
		try
		{
			wb1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			wb1.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			wb1.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			wb1.findElement(By.id("customerLightBox_nameField")).sendKeys("sg");
			wb1.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifycustomer()
	{
		try
		{
			wb1.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			wb1.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("course");
			Thread.sleep(2000);
			wb1.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deletecustomer()
	{
		try {
			wb1.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			wb1.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			wb1.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			wb1.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
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
