package com.Test;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_Enable_Disable {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/enabled");
		driver.manage().window().maximize();
		
		WebElement disable=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		if(disable.isEnabled()==true) {
			disable.click();
		}else {
			System.out.println("Tab is Disable");
		}
		String str=RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:.\\Users\\Anurag chaudhari\\Pictures\\Saved Pictures"+str+".png"));
		
		WebElement inp=driver.findElement(By.xpath("//input[@id='input']"));
		if(inp.isDisplayed()==true && inp.isEnabled()==true) {
			inp.sendKeys("Its Anurag");
		}else {
			System.out.println("Field is Disable");
		}
		
		
	}

}
