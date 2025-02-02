import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // Because of the SeleniumManager(version-4.6.0) we did not use the Set property to invoke the ChromeDriver
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); 
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click(); //we use this syntax when 2 or more element present with same xpath
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).getText());
		
		//another way to find the Element to avoid the indexes (using xpath move parent to child
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']//option[@value='AMD']")).click();
		
		

	}

}
