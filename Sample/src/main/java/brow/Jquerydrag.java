package brow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquerydrag {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");
		
			
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions ac= new Actions(driver);
		
	ac.clickAndHold(drag).moveByOffset(0, 100).release().perform();
		
	}

}
