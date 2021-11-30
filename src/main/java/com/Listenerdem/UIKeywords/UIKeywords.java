package com.Listenerdem.UIKeywords;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UIKeywords {
	public RemoteWebDriver driver;
	private static UIKeywords UIKeyword;
	static {
		UIKeyword = new UIKeywords();
	}

	private UIKeywords() {
	}

	public static UIKeywords getInstance() {
		return UIKeyword;

	}

	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.get(url);

	}

	public void closeBrowser() {
		driver.quit();

	}
}
