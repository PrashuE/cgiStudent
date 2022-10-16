package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser(String url) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(url);

	}

	public static void maxim() {
		driver.manage().window().maximize();
	}

	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println("Title of the page is " +title);
	}
	
}
