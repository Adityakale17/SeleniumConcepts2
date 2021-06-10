package com.cyient.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.select;

public class DropDownTest {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		/*if id,name is not present then go for xpath*/
		//driver.findElement(By.xpath("//input [@id='authUser']")).sendKeys("admin");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		//dropdown
		Select selectLanguage = new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
		
		//mouse over on profile name
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Billy']"))).perform();
		
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
}

}
