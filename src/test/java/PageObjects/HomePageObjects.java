package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
	
	WebDriver driver;
	
	public HomePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By accountButton = By.xpath("//button[@id='ACCOUNT']");
	By customerLoginOption = By.xpath("//*[contains(text(), 'Customer Login')]");
	
	public void accountOptions() throws InterruptedException {
		driver.findElement(accountButton).click();
		Thread.sleep(2000);
		driver.findElement(customerLoginOption).click();
	}
	
	public String getTitleOfTheHomePage() {
		return driver.getTitle();
	}
	

}
