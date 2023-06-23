package webT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wt {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> th = driver.findElements(By.xpath("(//table)[1]//tr/th"));

		
		  for(int i=0; i<th.size();i++) {
		  
		 /*
		 * WebElement head = driver.findElement(By.xpath("(//table)[1]//tr/th["+i+"]"));
		 * System.out.println(head.getText());
		 * 
		 */
		System.out.println(th.get(i).getText()); }
		 

		List<WebElement> tr = driver.findElements(By.xpath("(//table)[1]//tr"));

		List<WebElement> td = driver.findElements(By.xpath("(//table)[1]//tr/td"));
		
		for(int i=0; i<td.size();i++) {
			
			System.out.println(td.get(i).getText());
		}
		
		/*
		 * for (int i = 0; i < tr.size(); i++) {
		 * 
		 * 
		 * WebElement row = driver.findElement(By.xpath("(//table)[1]//tr[" + i + "]"));
		 * System.out.println(row.getText());
		 * 
		 * System.out.println(tr.get(i).getText()); }
		 */

	}

}
