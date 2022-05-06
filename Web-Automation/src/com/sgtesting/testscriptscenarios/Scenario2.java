package com.sgtesting.testscriptscenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario2 {
	public static WebDriver wb=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyout();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			wb=new ChromeDriver(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate() 
	{
		try {
			wb.get("http://localhost/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	private static void login()
	{
		try {
			wb.findElement(By.id("username")).sendKeys("admin");
			wb.findElement(By.name("pwd")).sendKeys("manager");
			wb.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyout()
	{
		try {
			wb.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			wb.findElement(By.className("logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void createUser()
	{
		try
		{
			wb.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			wb.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Raj1");
			wb.findElement(By.name("lastName")).sendKeys("GV");
			wb.findElement(By.id("userDataLightBox_emailField")).sendKeys("abc.@gmail.com");
			wb.findElement(By.name("username")).sendKeys("java2");
			wb.findElement(By.name("password")).sendKeys("pwd");
			wb.findElement(By.name("passwordCopy")).sendKeys("pwd");
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try {
			wb.findElement(By.xpath("//span[text()='GV, Raj1']")).click();
			Thread.sleep(2000);
			wb.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=wb.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try {
			wb.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
