package pObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class LoginPage{
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By email=By.cssSelector("[name='user[email]']");
	By password=By.cssSelector("[name='user[password]']");
	By forgotpasssword=By.cssSelector("[href*='password/new']");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPasword() {
		return driver.findElement(password);
	}
	public ForgotPassword getForgotPassword() {
		driver.findElement(forgotpasssword).click();
		return new ForgotPassword(driver);
	}

}
