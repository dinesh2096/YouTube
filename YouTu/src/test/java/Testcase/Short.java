package Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Common.LibGlobal;
import Pageobject.Shortpath;

public class Short extends LibGlobal {
	
	public Short()
	{
		PageFactory.initElements(driver, Shortpath.class);
	}
	
	@Test(priority = 1)
	public void video()
	{
		Shortpath.getSho().click();
	}

}
