package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Brwoser_CMD1 {

	public static void main(String[] args) {
		
		String path= "D:/Softwares/Chrome Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://store.demoqa.com/");
		
		String title=driver.getTitle();
		int length=title.length();
		
		System.out.println("Tile of the page is :"+title);
		
		System.out.println("Length of the title :"+length);
		
		String actualURL=driver.getCurrentUrl();
		
		String expectedURL="http://store.demoqa.com/";
		
		if(actualURL.equals(expectedURL))
		{
			System.out.println("Actual URL is :"+actualURL);
			System.out.println("Expected URL is :" +expectedURL);
			System.out.println("Actual and Expected URL are Same ");
		}
		else 
		{
		System.out.println("Actual URL is :"+actualURL);
		System.out.println("Expected URL is :" +expectedURL);
		System.out.println("Actual and Expected URL are  not Same ");
		}
		
		
	
		
		String expectedTitle="ONLINE STORE|Toolsqa Dummy Test site";
		
		if(title.equals(expectedTitle))
		{
			System.out.println("Actual Title is :"+title);
			System.out.println("Expected Title is :" +expectedTitle);
			System.out.println("Actual and Expected Title are Same ");
		}
		else 
		{
		System.out.println("Actual URL is :"+title);
		System.out.println("Expected URL is :" +expectedTitle);
		System.out.println("Actual and Expected titles are  not Same ");
		}
		String pagesource=driver.getPageSource();
		int pagelength=pagesource.length();
		
		System.out.println("Page Source Lenght is :"+pagelength);
		
		driver.close();
	}
	


}
