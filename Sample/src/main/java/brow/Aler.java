package brow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aler {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement fr = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(fr);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert a= driver.switchTo().alert();		
		a.accept();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.id("runbtn")).getText();
		System.out.println(text);
	}

}
