package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngFeatures {
	public WebDriver driver=null;
	
	@Test
	public void googleTitletest1() {
		System.out.println("google title text");
		
	}
	
	@Parameters(("Url"))
	@Test
	public void searchText1(String Url) {
		System.out.println("search text");
		System.out.println(Url);
		
	}
	
	@Test(dependsOnMethods="googleTitletest1")
	public void findLogo1() {
		System.out.println("findLogo");
	}
	
	@Test
	public void getup() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream f1 = new FileInputStream("C:\\Users\\Mitali Shrivastava\\eclipse\\javanewlearn\\src\\learning.properties");
		prop.load(f1);
		System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").contains("Chrome")){
			
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").contains("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else {
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}
}
