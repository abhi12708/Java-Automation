import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Abhishek");
		driver.findElement(By.name("inputPassword")).sendKeys("Abhishek@123");
		driver.findElement(By.className("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println("The Error message is - "+ driver.findElement(By.cssSelector("p.error")).getText());  //--Tagname[attribute='value']
		driver.findElement(By.linkText("Forgot your password?")).click();
			
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhishek");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abh7615@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abhishek0515@gamil.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8707613919"); //(//parent tagName/Chid TagName[Index value])-use this x path when no attribute present in the HTML
		driver.findElement(By.cssSelector(" .reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click(); // xpath and then move to parent to child
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Abhishek");// By id
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //(we use this syntax when last latter of value changes dynamically
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
