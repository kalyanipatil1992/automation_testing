package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {
		
		String path="D:/Softwares/Chrome Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("kalyanipatil");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@@@kal@@@");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		
	/*	String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath="]/td[2]/a";
		
		for(int i=4;i<=6;i++)
		{
			String name=driver.findElement(By.xpath(before_xpath + i +after_xpath)).getText();
			System.out.println(name);
			if(name.contains("test test"))
					{
				      driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[" +i + "]/td[2]/a" )).click();
					}
			

		}*/
		
	
		driver.findElement(By.xpath("//a[text()='test test']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[text()='testing xpath']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
		
	}

}
