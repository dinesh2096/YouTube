package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.LibGlobal;

public class Sub extends LibGlobal {
	
	@FindBy(xpath = "//yt-formatted-string[contains(text(),\"Subscriptions\")]")
	public static WebElement subs;

	public static WebElement getSubs() {
		return subs;
	}

	public static void setSubs(WebElement subs) {
		Sub.subs = subs;
	}
	

}
