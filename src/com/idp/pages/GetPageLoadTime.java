package com.idp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.idp.utilities.FilePaths;

public class GetPageLoadTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Programs/Datadriven/chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().deleteAllCookies();
		
		
		
		EventFiringWebDriver driver = new EventFiringWebDriver(cdriver);
        WebDriverEventListenerClass eventListener = new WebDriverEventListenerClass();
        driver.register(eventListener);
        driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
        driver.quit();

	}

}
