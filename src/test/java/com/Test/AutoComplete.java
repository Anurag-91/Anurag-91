package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement adress=driver.findElement(By.xpath("//input[contains(@id,'autocomplete')]"));
		act.keyDown(Keys.SHIFT).sendKeys(adress, "juinagar new mumbai").build().perform();
		
		WebElement street1=driver.findElement(By.xpath("//input[@id='street_number']"));
		street1.sendKeys("harbour line");
		act.keyUp(Keys.SHIFT).perform();
		
		WebElement street2=driver.findElement(By.xpath("//input[@id='route']"));
		street2.sendKeys("NEAR SUBURBAN RAILWAY STATION");
		
		WebElement city=driver.findElement(By.xpath("//input[@id='locality']"));
		city.sendKeys("MUMBAI");
		
		WebElement state=driver.findElement(By.xpath("//input[@id='administrative_area_level_1']"));
		state.sendKeys("MAHARASHTRA");
		
		WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal_code']"));
		zipcode.sendKeys("400705");
		
		WebElement country=driver.findElement(By.xpath("//input[@id='country']"));
		country.sendKeys("INDIA");
		
		
		driver.navigate().to("https://formy-project.herokuapp.com/");
		
		WebElement btn2=driver.findElement(By.xpath("(//a[@href='/buttons'])[2]"));
		btn2.click();
		Thread.sleep(5000);
	

	}

}
