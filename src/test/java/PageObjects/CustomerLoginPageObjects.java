package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPageObjects {
	
	WebDriver driver;
	public CustomerLoginPageObjects(WebDriver driver){
		this.driver=driver;
	}
	
	By customerEmail = By.xpath("//input[@type='email']");
	By customerPassword = By.xpath("//input[@type='password']");
	By submitButton = By.xpath("//button[@type='submit']");
	
	public void enterCredentials(String username, String password) {
		driver.findElement(customerEmail).sendKeys(username);
		driver.findElement(customerPassword).sendKeys(password);
		driver.findElement(submitButton).click();
		
	}

}
