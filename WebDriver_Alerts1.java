package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Alerts1 {
	
	public static void main(String[] args) throws InterruptedException {
		String path="D:/Softwares/Chrome Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		element.click();
		Thread.sleep(2000);
		
		Alert simpleAlert=driver.switchTo().alert();
		
		String s=simpleAlert.getText();
		
		System.out.println("Simple Alert:" +s);
		
		simpleAlert.accept();
		Thread.sleep(2000);
		
		WebElement element1=driver.findElement(By.xpath("//button[text()='Confirm Pop up']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element1);
		Thread.sleep(2000);
		
		Alert confirmationAlert=driver.switchTo().alert();
		
		String s1=confirmationAlert.getText();
		
		System.out.println("Confirmation Pop up"+s1);
		
		confirmationAlert.dismiss();
		Thread.sleep(2000);
		
		
		WebElement element2=driver.findElement(By.xpath("//button[text()='Prompt Pop up']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",element2);
		Thread.sleep(2000);
		
		Alert promptAlert=driver.switchTo().alert();
		String s2=promptAlert.getText();
		
		System.out.println(s2);
		promptAlert.sendKeys("Accepting the alert");
		Thread.sleep(4000);
		promptAlert.accept();
		Thread.sleep(2000);
		
	}

}
