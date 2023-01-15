package Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Common.LibGlobal;
import Pageobject.Library;

public class His extends LibGlobal{
	
	public His()
	{
		PageFactory.initElements(driver, Library.class);
	}
	
	@Test
	public void history()
	{
		Library.getHistory().click();
	    log.info("library clicked");
	}

}
