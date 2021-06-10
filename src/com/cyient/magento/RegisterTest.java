package com.cyient.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.com/");
		
		
		driver.findElement(By.id("gnav_557")).click();
		
        driver.findElement(By.id("register")).click();
        driver.findElement(By.id("firstname")).sendKeys("ABC");
        driver.findElement(By.id("lastname")).sendKeys("XYZ");
        driver.findElement(By.id("email_address")).sendKeys("ABC@gmail.com");
        driver.findElement(By.id("self_defined_company")).sendKeys("Cyient");
        
        Select selectCompany = new Select(driver.findElement(By.id("company_type")));
        selectCompany.selectByVisibleText("Tech Partner");
        
        Select selectRole = new Select(driver.findElement(By.id("individual_role")));
        selectRole.selectByVisibleText("Technical/developer");
        
        Select selectCountry = new Select(driver.findElement(By.id("country")));
        selectCountry.selectByVisibleText("India");
       
        driver.findElement(By.id("agree_terms")).click();
		
	}

}
