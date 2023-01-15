package Common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.apache.logging.log4j.core.config.properties.PropertiesConfigurationFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibGlobal {
	
	public static WebDriver driver = 	new ChromeDriver(); ;
	WebElement element;
	public static Logger log = Logger.getLogger(LibGlobal.class);
	public  void browser()
	{
	
		driver.manage().window().maximize();
		
	}
	
	public void openurl(String url)
	{
		driver.get(url);
	}
	
	public WebElement byid(String id)
	{
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	public WebElement byxpath(String xpath)
	{
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
		
	}
	public void sendkeys(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	public void click(WebElement element)
	{
		element.click();
	}
	public void enter() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);	
		r.keyRelease(KeyEvent.VK_ENTER);	
	}
	public void screenshot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Preet\\eclipse-workspace\\YOU\\Screenshot\\1.png");
		FileUtils.copyFile(src, desc);         
	}
	public void wa (WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void mouse(WebElement element)
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(element).contextClick().perform();
	}
	
	public void Visiblity (WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void log()
	{
		String log4jpath = "/YouTu/log4j.properties";
		PropertyConfigurator.configure(log4jpath);
	}
	public void quit()
	{
		driver.quit();
	}
	
	


}
