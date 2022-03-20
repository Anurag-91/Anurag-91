package com.Test;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_AlertPopup {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456789");;
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		/* Pop_up Handling
		 * 1) Alert Pop_up
		 * we use getText(); for getting Text from Pop_up
		 * we use accept(); to select "OK" from Pop_up
		 * we use dismiss(); to select "Cancel" From Pop_up
		 * 2) Child Window Pop_up
		 */
		
		Alert alert=driver.switchTo().alert();  // for switching to Alert Pop_up
		System.out.println(alert.getText());    // to get the text from the Alert Pop_up
		alert.accept();                         // to Select "OK" from the Pop_up
		System.out.println(alert.getText());     
		alert.accept();
		
		
/*		Actions act=new Actions(driver);
		WebElement uid=driver.findElement(By.xpath("//input[@name='cusid']"));
		act.moveToElement(uid).click(uid).sendKeys("123456789").keyDown(Keys.ENTER).keyUp(Keys.ENTER)build().perform();
*/
		
	}

}
