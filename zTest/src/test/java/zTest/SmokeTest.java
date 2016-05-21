package zTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SmokeTest
{
	
	
	/*@Test
	public void seleniumgrid() throws IOException
	{
	DesiredCapabilities capability = DesiredCapabilities.firefox();
    WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.32:4444/wd/hub"), capability);
    driver.get("http://www.facebook.com");
    System.out.println("");
	}*/
	
	@Test(enabled=true)
	public void Google() throws IOException, Exception
	{
	FirefoxDriver dr=new FirefoxDriver();
	dr.get("http://www.google.com");
	System.out.println("Google Opened");
	Thread.sleep(5000);
	System.out.println("Google title: "+dr.getTitle());
	dr.close();
	System.out.println("Google closed");
	}
	
	
	@Test(enabled=true)
	public void Facebook() throws IOException, Exception
	{
	FirefoxDriver dr=new FirefoxDriver();
	dr.get("http://www.facebook.com");	
	System.out.println("Facebook Opened");
	Thread.sleep(5000);
	System.out.println("Facebook title: "+dr.getTitle());
	dr.close();
	System.out.println("Facebook closed");
	}
	
	@Test(enabled=true)
	public void Yahoo() throws IOException, Exception
	{
	FirefoxDriver dr=new FirefoxDriver();
	dr.get("http://www.yahoo.com");	
	System.out.println("Yahoo Opened");
	Thread.sleep(5000);
	System.out.println("Yahoo title: "+dr.getTitle());
	dr.close();
	System.out.println("Yahoo closed");
	}
	
	@Test(enabled=true)
	public void msn() throws IOException, Exception
	{
	FirefoxDriver dr=new FirefoxDriver();
	dr.get("http://www.msn.com");	
	System.out.println("MSN Opened");
	Thread.sleep(5000);
	System.out.println("MSN title: "+dr.getTitle());
	dr.close();
	System.out.println("MSN closed");
	}
	
	@Test(enabled=true)
	public void bbc() throws IOException, Exception
	{
	FirefoxDriver dr=new FirefoxDriver();
	dr.get("http://www.bbc.com");	
	System.out.println("BBC Opened");
	Thread.sleep(5000);
	System.out.println("BBC title: "+dr.getTitle());
	dr.close();
	System.out.println("BBC closed");
	}
	
}
