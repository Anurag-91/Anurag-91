package com.Test;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_DropDown {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement drpdwn=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select se=new Select(drpdwn);
		se.selectByVisibleText("Option3");
		Thread.sleep(2000);
		se.selectByValue("option2");
		Thread.sleep(2000);
		se.selectByIndex(1);
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		WebElement radiobtn=driver.findElement(By.xpath("//input[@value='radio1']"));
		act.click(radiobtn).perform();
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		act.click(checkbox).perform();
		Thread.sleep(2000);
		
		String str=RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr, new File("C:\\Users\\Anurag chaudhari\\Pictures\\Saved Pictures"+str+"png"));
		
		
		driver.close();

         
	}

}
