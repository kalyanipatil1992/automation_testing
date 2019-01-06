package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
         
		String path="D:/Softwares/Chrome Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
 
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
		
		driver.manage().window().maximize();
		
		Select multi=new Select(driver.findElement(By.id("selenium_commands")));
		
		multi.selectByIndex(0);
		Thread.sleep(2000);
		
		multi.deselectByIndex(0);
		Thread.sleep(2000);
		
		multi.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		
		multi.deselectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		
		List<WebElement> ele=multi.getOptions();
		int s=ele.size();
		
		for(int i=0;i<s;i++) {
			String value=ele.get(i).getText();
			System.out.println(value);
			
			multi.selectByIndex(4);
			Thread.sleep(2000);
			
			multi.deselectAll();
			
			//driver.close();
			
				}
	}

}
