package Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.LibGlobal;
import Pageobject.Gametrac;

public class Searchresult extends LibGlobal {
	
	public Searchresult()
	{
		PageFactory.initElements(driver , Gametrac.class);

	}
	@BeforeSuite
	public void launch()
	{
		browser();
		openurl("https://www.youtube.com/");
	}


	@Test(priority = 0)
	public void result()
	{
		Gametrac.getSearch().sendKeys("gametract");	
		Gametrac.getSub().click();
	}

	
}
