package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_DropDown {

	public static void main(String[] args) throws InterruptedException {

         String path="D:/Softwares/Chrome Driver/chromedriver.exe";
         System.setProperty("webdriver.chrome.driver",path);
         WebDriver driver=new ChromeDriver();
         
         driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
         
         driver.manage().window().maximize();
         
         Select drp_dwn=new Select(driver.findElement(By.id("continents")));
         
         drp_dwn.selectByIndex(1);
         Thread.sleep(2000);
         
         drp_dwn.selectByVisibleText("Africa");
         Thread.sleep(2000);
         
         
         List<WebElement>  ele=drp_dwn.getOptions();
         
         int s=ele.size();
         
         for(int i=0;i<=s;i++) {
        	 
        	 String val=ele.get(i).getText();
        	 System.out.println(val);
        	 
        	 if(val.equals("Antartica"))
        	 {
        		 drp_dwn.selectByVisibleText("Antartica");
        		 break;
        	 }
        	 
        	
         }
         
        

	}

}
