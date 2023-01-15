package Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Common.LibGlobal;
import Pageobject.Sub;

public class Subscription extends LibGlobal {
	
	public Subscription()
	{
		PageFactory.initElements(driver, Sub.class);
	}

	@Test
	public void subs()
	{
		Sub.getSubs().click();
	}
}
