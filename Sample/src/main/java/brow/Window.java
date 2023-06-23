package brow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions(); 
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);	
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");		
		
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> allwind = driver.getWindowHandles();
		
		List<String> tarwin =new ArrayList<String>();
		
		tarwin.addAll(allwind);
		
		driver.switchTo().window(tarwin.get(1));
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
		driver.switchTo().window(tarwin.get(0));
		
String title2 = driver.getTitle();
		
		System.out.println(title2);

	}

}
