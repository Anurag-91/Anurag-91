package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ActionsClass {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        
        WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement dstn=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        
        Actions act=new Actions(driver);
        act.dragAndDrop(src, dstn).perform();
        
        WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement dstn1=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
        
        act.dragAndDrop(src1, dstn1).perform();
        
        //WebElement link=driver.findElement(By.xpath("(//a)[30]"));
        // act.moveToElement(link).click(link).build().perform();
       
      
	}

}
