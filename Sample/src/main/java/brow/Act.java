package brow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions(); 
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);	
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");		
		
		WebElement ele = driver.findElement(By.xpath("//strong[text()='TRAINS']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).perform();
		
		

	}

}
