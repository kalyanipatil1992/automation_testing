package com.practice.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_SwitchCMD1 {

	public static void main(String[] args) {

             String path="D:/Softwares/Chrome Driver/chromedriver.exe";
             System.setProperty("webdriver.chrome.driver",path);
             WebDriver driver=new ChromeDriver();
             
             driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             
             driver.get("http://toolsqa.com/automation-practice-switch-windows/");
             
             driver.manage().window().maximize();
             
             String handle=driver.getWindowHandle();
             System.out.println(handle);
             
             driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
             
             Set<String>  handles=driver.getWindowHandles();
             System.out.println(handles);
             
             
             for(String handle1:driver.getWindowHandles())
             {
            	 System.out.println(handle1);
            	 driver.switchTo().window(handle1);
             }

             driver.close();
             
             driver.quit();
	}

}
