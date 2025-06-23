package junePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UniqloAutomation {
	
	@Test

	public void runUniqloAutomation() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.uniqlo.com/in/en/kids");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		try {
            driver.findElement(By.xpath("//button[text()='Accept All']")).click();
            
            System.out.println("Clicked 'Accept All' on cookie notice.");
            
        } catch (Exception e) {
        	
            System.out.println("Cookie notice not found or already accepted.");
        }
		
		driver.findElement(By.xpath("//button[contains(@class, 'bottom-navigation-icon-wrapper-center')]")).click();
		
		driver.findElement(By.id("bottomNavSearchInput")).sendKeys("Outerwear", Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Gender']")).click();
		
		driver.findElement(By.xpath("//button[text()='Kids']")).click();
		
		driver.close();
		
		
	}

}
