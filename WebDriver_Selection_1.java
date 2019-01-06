package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Selection_1 {

	public static void main(String[] args) {
        
		String path="D:/Softwares/Chrome Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
		driver.manage().window().maximize();
		
		List<WebElement> rBtnsex =driver.findElements(By.name("sex"));
		
		boolean sStatus=false;
		
		sStatus=rBtnsex.get(0).isSelected();
		
		if(sStatus==true) {
			rBtnsex.get(1).click();
			System.out.println("Done Selection for: "+rBtnsex.get(1));
		}
		else {
			rBtnsex.get(0).click();
			System.out.println("Done Selection for: "+rBtnsex.get(0));
		}
		
		
		WebElement year_of_exp=driver.findElement(By.id("exp-2"));
		year_of_exp.click();
		System.out.println("Years of Experince is:"+year_of_exp);
		
		
		List<WebElement>  check_prof=driver.findElements(By.name("profession"));	
		
		int size=check_prof.size();
		
		for(int i=0;i<=size;i++)
		{
			String prof_value=check_prof.get(i).getAttribute("value");
			
		
		
		if(prof_value.equalsIgnoreCase("Automation Tester")) {
			check_prof.get(i).click();
			System.out.println("Profession :" +prof_value);
			break;
		}
		}
		
		WebElement auto_tool=driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		auto_tool.click();
		
		System.out.println("Automation Tool is  :" +auto_tool);

	}

}
