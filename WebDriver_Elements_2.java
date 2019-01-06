package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Elements_2 {

	public static void main(String[] args) {

         String path="D:/Softwares/Chrome Driver/chromedriver.exe";
         System.setProperty("webdriver.chrome.driver",path);
         WebDriver driver=new ChromeDriver();
         
         driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
         
         driver.findElement(By.partialLinkText("Partial")).click();
         
         String tagname=driver.findElement(By.tagName("button")).toString();
         
         System.out.println("TagName is: "+tagname);
         
         driver.findElement(By.linkText("Link Test")).click();


	}

}
