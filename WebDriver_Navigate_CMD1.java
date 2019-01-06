package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Navigate_CMD1 {

	public static void main(String[] args) {
		
		String path="D:/Softwares/Chrome Driver/chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",path);
	    WebDriver driver=new ChromeDriver();
	    
	    String appURL="http://demoqa.com/";
	    driver.get(appURL);
	    
	    driver.findElement(By.xpath("//a[@href='http://demoqa.com/?p=1'and @class='btn btn-primary']")).click();
	    
	    driver.navigate().back();
	    System.out.println("back");
	    
	    driver.navigate().forward();
	    System.out.println("forward");
	    
	    driver.navigate().to(appURL);
	    System.out.println("to");
	    
	    driver.navigate().refresh();
	    System.out.println("refresh");
	    
	    driver.close();
	    
	}
	
}
 
	    
	    
	    	

	
