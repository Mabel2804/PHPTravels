package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CustomerPageObjects {
	
	WebDriver driver;
	
	public CustomerPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	By verifyUserName = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[1]/div/div[1]/div[1]/div/div/h2");
	By myProfileOption = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a");
	By phoneNumber = By.xpath("//input[@name='phone']");
	By handleCookieButton = By.xpath("//button[@id='cookie_stop']");
	By updateProfileButton = By.xpath("//button[@type='submit']");
	By successMessage = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/div");
	
	public String verifyUserLogin() {
		return driver.findElement(verifyUserName).getText();
	}
	
	public void updateUserProfile(String userphone) throws InterruptedException {
		driver.findElement(myProfileOption).click();
		driver.findElement(phoneNumber).clear();
		driver.findElement(handleCookieButton).click();
		driver.findElement(phoneNumber).sendKeys(userphone);
		JavascriptExecutor js = (JavascriptExecutor)driver;    
        // Scrolling down the page till the element is found		
        js.executeScript("window.scrollBy(0,550)");
        Thread.sleep(3000);
        driver.findElement(updateProfileButton).click();
        Thread.sleep(3000);
	}
	
	public String validateProfileUpdated() {
		return driver.findElement(successMessage).getText();
	}

}
