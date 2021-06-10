package com.cyient.medibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.medibuddy.in/");
		
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Signup")).click();
		
		//Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Balaji");
		driver.findElement(By.name("phone")).sendKeys("000000");
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("7777");
		
		driver.findElement(By.xpath("//span[text()='Are you a corporate user?']")).click();
		
		 Select selectYear = new Select(driver.findElement(By.xpath("//select[@ng-model='date.year']")));
         selectYear.selectByVisibleText("1998");
         Select selectMonth = new Select(driver.findElement(By.xpath("//select[@ng-model='date.month']")));
         selectMonth.selectByVisibleText("03");
         Select selectDate = new Select(driver.findElement(By.xpath("//select[@ng-model='date.day']")));
         selectDate.selectByVisibleText("16");
		
		driver.findElement(By.xpath("//span[text()='Male']")).click();
	}

}
