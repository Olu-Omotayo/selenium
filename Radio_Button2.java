package sele_demo;

import java.util.List;

/*
 * The goal is to click through all radio buttons to simulate a real scenario where we see if all works
 * We create different methods that could be called to iterate through all radio buttons.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button2 {
	
	static WebDriver driver;
	
	public void getMale() {
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		System.out.println(" Male Radio button successfully selected");		
	}
	
	public void getFemale() {
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		System.out.println("Female Radio button successfully selected");		
	}
	
	public void getCust() {
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		System.out.println("Cusotm radio button successfully selected");		
	}
	
	public void allradio() throws InterruptedException 
	{
		List<WebElement> allEle = driver.findElements(By.xpath("//input[@name='sex']"));  //sex is value that applies to all gender options
		int cnt = allEle.size();
		System.out.println("Count is: " + cnt);
		
//		for(int e=0; e<cnt; e++) {
//			allEle.get(e).click();
//			Thread.sleep(1000);
//		}
		
		// OR
//		for(WebElement f: allEle) 
//		{
//			f.click();
//		}
	}
	public void getsingleelement() throws InterruptedException
	{
		// Instead of iterating through, we want to pinpoint one specific gender option
		List<WebElement> allEle = driver.findElements(By.xpath("//label[@class='_58mt']"));
		int cnt = allEle.size();
		System.out.println("count is : "+ cnt);
		
		for(WebElement g : allEle) 
		{
			String txt = g.getText();
			if(txt.matches("Male"))
			{
				System.out.println(g.getText());
				g.click();
				Thread.sleep(1000);
				break;
			}
		}
	}


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/oluswagger/Oluswagger Documents/_Cloud Learnings/Intellipaat/Java_Selenium_Eclipse/drivers/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
				
		// find "create new account" menu
		driver.findElement(By.linkText("Create new account")).click();
		
	    Thread.sleep(3000);    
		
	    // Manually call the methods
		Radio_Button2 r = new Radio_Button2();
//		r.getFemale();
//		r.getMale();
//		r.getCust();
		
		
//		OR use the loop method created above ...useful when you have a lot of buttons 
	    r.allradio();
	    r.getsingleelement();
//	    System.out.println("All radio buttons clicked ... ");
		
		
		Thread.sleep(2000);
		driver.quit();			

	}

}
