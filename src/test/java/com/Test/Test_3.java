package com.Test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement emailid=driver.findElement(By.xpath("//input[@name='email']"));
		if(emailid.isDisplayed() && emailid.isEnabled()) {
			emailid.sendKeys("anuragchaudhari@gmail.com");
		}else {
			System.out.println("EmailId field is not Enabled");
		}
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		if(pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("123455678");
		}else {
			System.out.println("Password Field is not Enabled");
		}
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
		loginbtn.click();
		driver.navigate().forward();
		WebElement FPbtn=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	    FPbtn.click();
		
		System.out.println(driver.getTitle());
		
		String str=RandomString.make(3);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dstn=new File("C:.\\Users\\Anurag chaudhari\\Pictures\\"+str+".png");
		FileHandler.copy(src, dstn);
		
		List<WebElement> linklist=driver.findElements(By.xpath("//a"));
		System.out.println(linklist.size());
		
		
		driver.close();

	}

}
