package com.Listenerdem.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Listenerdem.UIKeywords.UIKeywords;

public class BaseClass {
	
	public void m6(){
	}

	UIKeywords ui = UIKeywords.getInstance();

	@BeforeMethod
	public void setUp() {
		ui.openBrowser("");

	}

	@AfterMethod
	public void tearDown() {
		ui.closeBrowser();
	}

	public void m1() {
		// TODO Auto-generated method stub

	}

	public void m2() {
		// TODO Auto-generated method stub

	}

	public void m3() {
		// TODO Auto-generated method stub

	}

	public void m4() {
		// TODO Auto-generated method stub

	}

	private void m5() {
		// TODO Auto-generated method stub

	}

}
