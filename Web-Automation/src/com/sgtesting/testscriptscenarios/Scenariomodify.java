package com.sgtesting.testscriptscenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenariomodify {
	public static WebDriver obj2=null;
	public static void main(String[] args) {
		launchBrowser(); 
		navigate();
		login();
		minimizeFlyoutwindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}
	private static void launchBrowser() 
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obj2=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			obj2.get("http://localhost/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			obj2.findElement(By.id("username")).sendKeys("admin");
			obj2.findElement(By.name("pwd")).sendKeys("manager");
			obj2.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutwindow()
	{
		try {
			obj2.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			obj2.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			obj2.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("anna");
			obj2.findElement(By.name("lastName")).sendKeys("das");
			obj2.findElement(By.id("userDataLightBox_emailField")).sendKeys("abc.@gmail.com");
			obj2.findElement(By.name("username")).sendKeys("class1");
			obj2.findElement(By.name("password")).sendKeys("pwd");
			obj2.findElement(By.name("passwordCopy")).sendKeys("pwd");
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try {
			obj2.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1500);
			obj2.findElement(By.name("firstName")).clear();
			obj2.findElement(By.name("firstName")).sendKeys("das1");
			Thread.sleep(2000);
			obj2.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try {
			obj2.findElement(By.xpath("//span[text()='das, das1']")).click();
			Thread.sleep(2000);
			obj2.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=obj2.switchTo().alert();
			String str=obj.getText();
			System.out.println(str);
			obj.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			obj2.findElement(By.className("logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void closeApplication()
	{
		try {
			obj2.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

