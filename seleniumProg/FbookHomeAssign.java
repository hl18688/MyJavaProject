package seleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbookHomeAssign {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//launch the application
		
		driver.get("https://www.facebook.com");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//click create new account
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[5]")).click();
		
		//enter First name
		
		driver.findElement(By.name("firstname")).sendKeys("Hemalatha");
		
        //enter Surname
		
		driver.findElement(By.name("lastname")).sendKeys("Venugopal");
		
		//enter DOB
		
		WebElement DayDD = driver.findElement(By.id("day"));

		Select select = new Select(DayDD);
		
		select.selectByValue("18");
		
		WebElement MonthDD = driver.findElement(By.id("month"));
		
		Select select1 = new Select(MonthDD);
		
		select1.selectByVisibleText("Jun");
		
		WebElement YearDD = driver.findElement(By.id("year"));
		
		Select select2 = new Select(YearDD);
		
		select2.selectByValue("1988");
		

		
		
	}

}
