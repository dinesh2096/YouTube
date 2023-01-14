package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.LibGlobal;

public class Gametrac {

	public static WebElement getSearch() {
		return search;
	}

	public static void setSearch(WebElement search) {
		Gametrac.search = search;
	}

	@FindBy(xpath = "//input[@id=\"search\"]")
	public static  WebElement search;
	
	@FindBy(xpath = "//button[@id=\"search-icon-legacy\"]")
	public static WebElement sub;

	public static WebElement getSub() {
		return sub;
	}

	public static void setSub(WebElement sub) {
		Gametrac.sub = sub;
	}


	
}
