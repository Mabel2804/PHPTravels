package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectsManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public TestBase testBase;
	public PageObjectsManager pageObjectsManager;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectsManager = new PageObjectsManager(testBase.WebDriverManager());
	}

}
