package com.Listenerdem.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import com.Listenerdem.UIKeywords.UIKeywords;

public class BaseClass {
	 
	UIKeywords ui = UIKeywords.getInstance();

	@BeforeMethod
	public void setUp() {
		ui.openBrowser("");

	}
	public void tearDown() {
		ui.closeBrowser();
	}

}
