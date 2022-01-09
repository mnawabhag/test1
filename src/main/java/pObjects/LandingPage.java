package pObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.base;

public class LandingPage{
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By login=By.cssSelector("[href*='sign_in']");
	
	
	public LoginPage getLogin() {
		driver.findElement(login).click();
		return new LoginPage(driver);
	}

}
