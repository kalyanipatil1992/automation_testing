package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Table1 {

	public static void main(String[] args) throws InterruptedException {

		String path="D:/Softwares/Chrome Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();

        driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        String cell_value=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(cell_value);
        
        driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
        System.out.println("Click event occured");
        driver.close();
	}

}
