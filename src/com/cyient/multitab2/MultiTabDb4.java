package com.cyient.multitab2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTabDb4 {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.get("https://www.db4free.net/");
		  driver.findElement(By.xpath("//a[@target='_blank']")).click();
		 
		 Set<String> tabSession = driver.getWindowHandles();
		 for(String tab : tabSession)
		 {
			 System.out.println(tabSession);
			 driver.switchTo().window(tab);
		 }
		 //
		
		  driver.findElement(By.id("input_username")).sendKeys("db123");
          driver.findElement(By.id("input_password")).sendKeys("test123");
          driver.findElement(By.id("input_go")).click();
        //driver.close();
         
		 //driver.findElement(By.name("pma_username")).sendKeys("aaaaa");
		 
          String actualText = driver.findElement(By.xpath("//div[@role='alert'])[3]")).getText();
          System.out.println(actualText);

	}

}
