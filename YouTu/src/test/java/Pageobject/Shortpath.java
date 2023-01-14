package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shortpath {
	
	@FindBy(xpath = "//yt-formatted-string[contains(text(),'Shorts')]")
	public static WebElement sho;

	public static WebElement getSho() {
		return sho;
	}

	public static void setSho(WebElement sho) {
		Shortpath.sho = sho;
	}

}
