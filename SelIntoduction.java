import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntoduction {

	public static void main(String[] args) {
		
		//Invoking the browser - 1st step
		//Chrome - ChromeDriver--> Methods
		//System.setProperty("webdriver.edge.driver","E:\\Drivers\\edgedriver_win64.exe");
		 WebDriver Driver = new EdgeDriver();
		  //System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver Driver1 = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		 //Driver.close();
		Driver1.get("https://www.bajajfinserv.in/myaccountlogin/");
		System.out.println(Driver1.getTitle());
		System.out.println(Driver1.getCurrentUrl());
		  

	}

}
