package webT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WtColumn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> tr = driver.findElements(By.xpath("(//table)[1]//tr"));
		List<WebElement> th = driver.findElements(By.xpath("(//table)[1]//tr/th"));
		//List<WebElement> td = driver.findElements(By.xpath("(//table)[1]//tr/td"));

		for(int i=0;i<th.size();i++ ) {
			
			System.out.println(th.get(i).getText());
			
			for(int j=2; j<=tr.size(); j++) {
				
				WebElement data = driver.findElement(By.xpath("(//table)[1]//tr["+j+"]/td["+(i+1)+"]"));
				
				System.out.println(data.getText());
			}
			
			
		}

	}

}
