package com.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_Key_Action {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		act.keyDown(Keys.SHIFT).sendKeys(username, "anuragchaudhari").keyUp(Keys.SHIFT).build().perform();

		String str=RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File(".\\C:\\Users\\Anurag chaudhari\\Pictures\\Saved Pictures\\"+str+"img1.png")) ;
}
}