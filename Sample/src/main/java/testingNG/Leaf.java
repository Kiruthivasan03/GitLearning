package testingNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaf {
@Test
	public void leaf() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		/*
		 * driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		 * 
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * 
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 * 
		 * driver.findElement(By.linkText("CRM/SFA")).click();
		 */
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalemanager");
		String text = driver.findElement(By.xpath("//h2[text()='Leaftaps Login']")).getText();
		System.out.println(text);
		
		//ScreenShot
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("sample.png");
		FileUtils.copyFile(src, dest);
		//
	} 

}
