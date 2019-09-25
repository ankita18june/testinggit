package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	/*@Test(timeOut=4000)
	public void infiniteLoopTest() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}*/
	
	@Test(dataProvider="getData")
	public void anotherTest(String username, String password) {
		System.out.println("to test");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		//second set data
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//third set
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
	}

}
