package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Button {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
		
		WebElement btn1=driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary'])[1]"));
		
		if(btn1.isEnabled() && btn1.isDisplayed()) {
			btn1.click();
		}else {
			System.out.println("Button is not Enabled");
		}
		Actions act=new Actions(driver);
		WebElement drpdwn=driver.findElement(By.xpath("//button[@id='btnGroupDrop1']"));
		act.click(drpdwn).perform();
		driver.findElement(By.xpath("//a[text()='Dropdown link 2']")).click();
		
		
		
		
		
		
	}

}
