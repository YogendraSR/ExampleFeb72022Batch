package com.sgtesting.cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		selectItemsFromDropDown();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JavaAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file://C:/Users/User/Downloads/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void selectItemsFromDropDown()
	{
		WebElement oList=null;
		try
		{
			oList=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oList);
			oSelect.selectByIndex(1);
			Thread.sleep(2000);
			oSelect.selectByValue("rc");
			Thread.sleep(2000);
			oSelect.selectByVisibleText("Selenium WebDriver");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
