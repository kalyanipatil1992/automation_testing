package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BwoserCommands {

	public static void main(String[] args) {

		String path= "D:/Softwares/Chrome Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        /*  different browser commands 
         *  driver.get(url);
         *  driver.getTitle();
         *  driver.getCurrentUrl();
         *  driver.getPageSource();
         *  driver.Close();
         *  driver.quit();
         *  driver.naviagte().refresh();
        */
        
        String BrowserTitle=driver.getTitle();
        System.out.println("Title of the browser:" +BrowserTitle);
        
        String BrowserUrl=driver.getCurrentUrl();
        System.out.println("Browser URL is:" +BrowserUrl);
        
        driver.navigate().refresh();
        
      //  String PageSource=driver.getPageSource();
      //  System.out.println("Page source is:" +PageSource);
        
        driver.close();
        driver.quit();
        
       
        
        
	}

}
