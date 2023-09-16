package july_23rd;

/* Switching between windows or frames
 * 
 */

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_switching {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		  WebDriver drv = new FirefoxDriver();
		  drv.get("https://www.facebook.com/");
		  
		  //get handle of main/first window
		  String mainId = drv.getWindowHandle();
		  System.out.println("Main window handle is: "+ mainId);
		  
		  drv.findElement(By.linkText("Create new account")).click();
		  Thread.sleep(2000);
		  
		  //click the terms link, it auto-switches to a new page/window
		  drv.findElement(By.xpath("//a[@id='terms-link']")).click();
		  System.out.println("terms and conditions page reached");
		  Thread.sleep(3000);
		  
		  //go back to main window
		  drv.switchTo().window(mainId);
		  Thread.sleep(3000);
		  
		  //click another link
		  drv.findElement(By.id("privacy-link")).click();
		  System.out.println("Privacy page reached"); 
		  Thread.sleep(3000);
		  
		  //get ALL child-window handles
		 Set<String> allWin =  drv.getWindowHandles();
		 System.out.println("Open windows are "+ allWin.size() + " in number ...");
		 
		 //Validate parent/child window is active and print our url/title
		 for(String w: allWin) {
			 if(w.matches(mainId)) {
				 drv.switchTo().window(w);
				 System.out.println("parent: " + drv.getTitle());
				 }
			 else {
				 drv.switchTo().window(w);
				 System.out.println("child: " + drv.getCurrentUrl());
			 }
		 }
		 
		 drv.close(); 
	}

}
