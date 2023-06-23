package brow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDn {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select S=new Select(day);
		S.selectByIndex(0);
		
		WebElement mon = driver.findElement(By.id("month"));
		
		Select s2=new Select(mon);
		
		s2.selectByVisibleText("Oct");
		
		List<WebElement> options = s2.getOptions();
		
	for(WebElement month: options) {
		System.out.println(month.getText());
		
	}	
	
		
	}

}
