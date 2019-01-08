package com.jiffy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_iFrame {

	public static void main(String[] args) {

		String path="D:\\Kalyani\\Applications\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.toolsqa.com/iframe-practice-page");
		
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(1);
		
		System.out.println("Switched to frame 2");
		
		WebElement link=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']"));
		link.click();
		System.out.println("Clicked on Button");
		
		driver.findElement(By.id("author")).sendKeys("Test");
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		
		driver.switchTo().defaultContent();
		System.out.println("Switched to deafult page ");
		driver.switchTo().frame(0);
		System.out.println("Switched to frame 1 ");
		
	}

}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		

