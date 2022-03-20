package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_DatePicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("02212022",Keys.ENTER);

	}

}
