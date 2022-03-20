package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// How to handle Dropdown
		
		WebElement drpdwnel=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select se=new Select(drpdwnel);
		//se.selectByIndex(0);
		//se.selectByValue("option3");
		//se.selectByVisibleText("Option2");
		
		WebElement dfltopt=se.getFirstSelectedOption();
		System.out.println(dfltopt.getText());
		
		String Actualresult=dfltopt.getText();
		String Expetedresult="Select";
		if(Actualresult.equals(Expetedresult)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}	
		 System.out.println(se.getOptions().size());
		 
		 driver.close();
		

	}

}
