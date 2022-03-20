package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();      // Creating object of ChromeDriver class with reference of WebDriver Interface
		driver.get("https://www.facebook.com/");  // will get to the uRL being searched
		driver.manage().window().maximize();     // will maximize the browser
		System.out.println(driver.getCurrentUrl()); // will get URL of the current browser
		Thread.sleep(5000);
		System.out.println(driver.getTitle());                  // will get Title of the Web Page
		
		driver.navigate().to("https://www.makemytrip.com/");    // will navigate from 1st url to the given url.
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());     // Navigate is similar like get Url but it will just hit the Url n will not wait till page fully loaded
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		
		driver.close();              // will close the current browser 
	}

}
      /* WebDriver driver=new ChromeDriver();
       * driver.get("https://www.facebook.com/");
       * driver.manage().window().maximize();
       * System.out.println(driver.getCurrentUrl());
       * Thread.sleep(5000);
       * driver.navigate("https://www.makemytrip.com/");
       * System.out.println(driver.getTtile());
       * System.out.println(driver.getCurrentUrl());
       * Thread.sleep(5000);


      */