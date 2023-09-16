package july_23rd;

//import java.awt.Desktop.Action;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Demo {
	static WebDriver driver=null;
	static Actions action;
	
	public void drag(WebDriver driver){ 
		//the above args is neccesary bcos we will call the method in another class
		
		WebElement frEle = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frEle);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement tgt = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDrop(src, tgt).perform();
		System.out.println("Succesfuly dragged and dropped");
	}
	
	public void drop_validate(){
		//use drag to a coordinate method
		WebElement frEle = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frEle);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement tgt = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDropBy(src, 35, 79).perform();
		if(tgt.getText().matches("Dropped")) {
			System.out.println("Drag succssful");
		}
		else {
			System.out.println("Not successful");
		}
		
	}



	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		action = new Actions(driver);
		
//		call each method
		Drag_Demo  obj = new Drag_Demo();
		obj.drag(driver);
//		obj.drop_validate();

		Thread.sleep(4000);
//		driver.close();
		System.out.println("Driver Quit/closed");

	}

}
