package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_FileUpload {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/fileupload");
		driver.manage().window().maximize();
		
		
		WebElement fileupload=driver.findElement(By.xpath("//input[@id='file-upload-field']"));
		fileupload.click();
		Thread.sleep(2000);
		fileupload.sendKeys("C:\\Users\\Anurag chaudhari\\Pictures");
	}

}
