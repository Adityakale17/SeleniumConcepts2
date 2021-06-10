package com.cyient.threadsleeep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.get("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
		 
		// driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("submitForm")).click();

	}

}
