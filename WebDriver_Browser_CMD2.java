package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Browser_CMD2 {

	public static void main(String[] args) {

	  String path= "D:/Softwares/Chrome Driver/chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demoqa.com/frames-and-windows/");
	  driver.findElement(By.xpath("//a[@href='http://demoqa.com/?p=1'and @class='btn btn-primary']")).click();
	  driver.quit();

	}

}
