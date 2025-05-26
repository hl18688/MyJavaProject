package seleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("hematrue@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("hemaarun");
		
		driver.findElement(By.name("login")).click();
		

	}

}
