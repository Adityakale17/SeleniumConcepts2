package com.cyient.upload;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  driver.get("https://www.naukri.com/");
		  
		  driver.findElement(By.id("file_upload")).sendKeys("C:\\Users\\ak59127\\Desktop\\TrainAutomation\\SeleniumConcepts2\\File\\profile.docx");
		  
		
	
	}
}
