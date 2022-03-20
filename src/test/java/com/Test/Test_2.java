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

public class Test_2 {

	public static void main(String[] args) throws Exception {
		// 1. Launch the browser--chrome(url)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// 2. Enter Emailid--anuragchaudhari89@gmail.com
		
		WebElement emailid=driver.findElement(By.xpath("//input[@name='email']"));
		emailid.sendKeys("7038132641");
		
		// 3. Enter Password--12345678
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");
		
		// 4. Click on Log in Button
		
		WebElement loginbtn=driver.findElement(By.name("login"));
		loginbtn.click();
		
		String ActualtiTle=driver.getTitle();
		String ExpectedTitle="Facebook – log in or sign up";
		if(ActualtiTle.equalsIgnoreCase(ExpectedTitle)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		String str=RandomString.make(4);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dstn=new File("C:.\\Users\\Anurag chaudhari\\Pictures\\"+str+".png");
		FileHandler.copy(src, dstn);
        driver.close();
	}

}
