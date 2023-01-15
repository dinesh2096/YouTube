package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.LibGlobal;

public class Library extends LibGlobal {
	
	@FindBy(xpath = "//yt-formatted-string[contains(text(),'Library')]")
	public static WebElement history;

	public static WebElement getHistory() {
		return history;
	}

	public static void setHistory(WebElement history) {
		Library.history = history;
	}

}
