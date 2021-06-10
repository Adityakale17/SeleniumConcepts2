package com.cyient.multitabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabTest {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.get("https://www.online.citibank.co.in/");
		 driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		 
		// driver.findElement(By.linkText("Travel")).click();
		 
		 System.out.println("tab1");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String tab1 = driver.getWindowHandle();
		 System.out.println(tab1);
		 
		 System.out.println("----------------------");
		 
		 Set<String> tabSession = driver.getWindowHandles();
		 
		 for(String tabSession1 : tabSession)
		 {
			 System.out.println(tabSession);
			 driver.switchTo().window(tabSession1);
			 
			 String currenttitle = driver.getTitle();
			 System.out.println(currenttitle);
			 
			 if(currenttitle.equals("CitiBank India"))
			 {
				 break;
			 }
		 }
		 
		 //click on travel
		 driver.findElement(By.linkText("Travel")).click();
		 driver.findElement(By.id("Email_Id")).sendKeys("abc@gmail.com");
		 
		 driver.close();
		 
	}

}
