package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Elements_1 {

	public static void main(String[] args) {

       String path="D:/Softwares/Chrome Driver/chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", path);
       WebDriver driver=new ChromeDriver();
       
       driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
       
       driver.manage().window().maximize();
       
       driver.findElement(By.name("firstname")).sendKeys("abc");
       
       driver.findElement(By.name("lastname")).sendKeys("xyz");
       
       driver.findElement(By.id("submit")).click();
       
       

	}

}
