package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.HomePageObjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStepDefinition {
	

	 WebDriver driver;
	 
	 
	@Given("User is at the PHP Travels website")
	public void user_is_on_the_phptravels_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver/chromedriver.exe"); 
		driver = new ChromeDriver();
		 driver.get("https://www.phptravels.net/");
		 driver.manage().window().maximize();
	
		
	}
	
	@When("User wants to login to the travel portal")
	public void user_wants_to_login_to_the_travel_portal() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='ACCOUNT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(), 'Customer Login')]")).click();

	}
	
	@When("^User enters login credentials (.+) and (.+)$")
	public void user_enters_login_credentials(String username, String password) {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	@Then("User should be able to login to the travel portal and see their name")
	public void user_should_be_able_to_login_to_the_travel_portal_and_see_their_name() {
		
		String verifyUserName = driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[1]/div/div[1]/div[1]/div/div/h2")).getText();
		System.out.println("Logged in User:" + verifyUserName);
	
		
	}
	
	@Then("User is able to update their profile")
	public void user_is_able_to_update_their_profile() throws Exception {
	
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//input[@name='phone']")).clear();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@id='cookie_stop']")).click(); 
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
        JavascriptExecutor js = (JavascriptExecutor)driver;    
        // Scrolling down the page till the element is found		
        js.executeScript("window.scrollBy(0,550)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        String successMessage = driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/div")).getText();
		System.out.println(successMessage);
		driver.quit();
	}

}
