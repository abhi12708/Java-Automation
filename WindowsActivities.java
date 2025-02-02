import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); // Because of the SeleniumManager(version-4.6.0) we did not use the Set property to invoke the ChromeDriver
		driver.manage().window().maximize();
		driver.get("https://google.com/"); // implicit time is inbuilt in the get
		driver.navigate().to("https://rahulshettyacademy.com/"); // when we use navigate then page is not wait for load the all element present in the page 
		driver.navigate().back();
		driver.navigate().forward();
	
	

	}

}
