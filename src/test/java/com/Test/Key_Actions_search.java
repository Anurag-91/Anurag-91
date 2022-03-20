package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Key_Actions_search {

	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Mobile OnePLus",Keys.ENTER);
		
		
		
	}
	
	
	
}
