package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
	private static Properties prp=null;
	FileInputStream fi=null;
	public ObjectMap(String filenme)
	{
		try {
			fi=new FileInputStream(filenme);
			prp=new Properties();
			prp.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public By getLocator(String logicalname)
	{
		By b=null;
		try {
			String locatordetails=prp.getProperty(logicalname);
			String locator[]=locatordetails.split("!");
			String locatorname=locator[0];
			String locatorvalue=locator[1];
			switch(locatorname.toLowerCase())
			{
			case "id":
				b=By.id(locatorvalue);
				break;
			case "name":
				b=By.name(locatorvalue);
				break;
			case "xpath":
				b=By.xpath(locatorvalue);
				break;
			case "linktext":
				b=By.linkText(locatorvalue);
				break;
			case "tagname":
				b=By.tagName(locatorvalue);
				break;
			case "cssselector":
				b=By.cssSelector(locatorvalue);
				break;
			default:
				System.out.println("invalid locator name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;

	}

}
