package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {
	
	//precoditions

	@BeforeSuite
	public void setup(){
		
		System.out.println("setup system property for chrome-before suite");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome browser-before test");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("login to app-before class");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL-before method");
	}
	
	//testcase
	
	@Test(priority=1,groups="Test")
	public void googleTitletest() {
		System.out.println("google title text");
	}
	
	@Test(priority=3,groups="Test")
	public void searchText() {
		System.out.println("search text");
	}
	
	@Test(priority=2,groups="Logo")
	public void findLogo() {
		System.out.println("findLogo");
	}
	
	//postcondition
	
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("delete all cookies");
	}
		
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test report");
	}
}
