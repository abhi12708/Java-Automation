import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_with_whileLoop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // Because of the SeleniumManager(version-4.6.0) we did not use the Set property to invoke the ChromeDriver
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		//driver.findElement(By.id("hrefIncAdt")).click(); ------ select two adults 
		
		//Select N numbers of adults we are using the loop here instead of copy paste the same code multiple times
	/*	int i=1;
		while(i<5) {  //when we use 'while(true)' with true the loop executing the infinite times so the we will initialize the value in the While loop
			driver.findElement(By.id("hrefIncAdt")).click();  // select 5 adults , loop executed 4 times
			i++;
		}        */
		
		// we have also use the 'for loop' instead of while loop
		for(int i=1;i<6;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();  // select 5 adults , loop executed 4 times
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
