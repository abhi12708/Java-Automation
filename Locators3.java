import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		//Absolute XPath-- Starting from the root of html and then go to the child --(/html/body/header)
		
		//Relative XPath--- Directly jumping to the middle of the DOCs
		//parent to child travels --("//header/div/button[1])
		//parent to child to sibling to sibling travels --("//header/div/button[1]/following-sibling::button[1]")
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); //sibling to sibling travels
		
		// child to parent then again parent to child travels in same syntax-- (//header/div/button[1]/parent::div/parent::header/a[2])
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		//these travels is not possible in the Css selector

	}

}
