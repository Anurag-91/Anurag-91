package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_DragnDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://formy-project.herokuapp.com/dragdrop");
		 driver.manage().window().maximize();
		 
		WebElement drag= driver.findElement(By.xpath("//img[@alt='Selenium logo']"));
		WebElement drop= driver.findElement(By.xpath("(//div[contains(.,'Drop here')])[2]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();

	}

}
