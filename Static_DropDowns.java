import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_DropDowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // Because of the SeleniumManager(version-4.6.0) we did not use the Set property to invoke the ChromeDriver
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
		//Static Drop downs with Select tagName(options are in drop down is fixed) 
		//Creating an object of Class Select (Select class is present in the selenium) 
		//Create the WebElement where is the drop down is present and give the variable name is the Select object
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown); //this object comes with lots of method present in the Select class
		dropdown.selectByIndex(3); //selecting drop down base upon the index[1]
		System.out.println(dropdown.getFirstSelectedOption().getText());  //to check our option is selected or not
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		dropdown.selectByValue("INR");// check the Value Attribute of the element
		System.out.println(dropdown.getFirstSelectedOption().getText()); 

	}

}
