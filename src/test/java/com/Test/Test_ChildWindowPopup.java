package com.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ChildWindowPopup {

	public static void main(String[] args) throws Exception {
		   
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://demo.guru99.com/popup.php");
		  driver.manage().window().maximize();
		  
		  String parentwindowaddress=driver.getWindowHandle();      // parent window address
		  System.out.println(parentwindowaddress);
		  
		  driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		  Set<String> allwindowaddress=driver.getWindowHandles();    // parent window and child window address 
		  System.out.println(allwindowaddress);
		  
		  Iterator<String> it=allwindowaddress.iterator();
		  
		  while(it.hasNext()) {
			  String childwindow=it.next();
			  
			  if(!parentwindowaddress.equalsIgnoreCase(childwindow)) {
				  
				  driver.switchTo().window(childwindow);
				  
				  // now we can implement test cases for the child window 
				  // after test case implementation close this window
				  driver.close();
			  }
		  }
		  // Switching back to the Parent window
		  driver.switchTo().window(parentwindowaddress);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  
		  
		  
		  
		  
	}

}
