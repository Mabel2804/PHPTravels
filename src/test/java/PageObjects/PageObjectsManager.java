package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
	
	public WebDriver driver;
	public HomePageObjects homePage;
	public CustomerLoginPageObjects customerLoginPage;
	public CustomerPageObjects customerPage;
	
	public PageObjectsManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public HomePageObjects getHomePage() {
		homePage = new HomePageObjects(driver);
		return homePage;
	}
	
	public CustomerLoginPageObjects getCustomerLoginPage() {
		customerLoginPage = new CustomerLoginPageObjects(driver);
		return customerLoginPage;
	}
	
	public CustomerPageObjects getCustomerPage() {
		customerPage = new CustomerPageObjects(driver);
		return customerPage;
	}

}
