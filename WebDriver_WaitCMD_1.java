package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_WaitCMD_1 {

	public static void main(String[] args) {

        String path="D:/Softwares/Chrome Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("timingAlert")).click();
        
        WebDriverWait wait=new WebDriverWait(driver,10);
        
        Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
        
        System.out.println("Either pop up is displayed or it is TimeOut");
        myalert.accept();
        
        System.out.println("Alert accepted");
        
        driver.close();
		

	}

}
