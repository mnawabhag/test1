package pObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class ForgotPassword{
	
	public WebDriver driver;
	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}
	
	By email=By.cssSelector("[id='user_email']");
	By sendme=By.cssSelector("[value='Send Me Instructions']");
	
	public WebElement getForgotpassword() {
		return driver.findElement(email);
		
	}
	
	public void getSendMe() {
		driver.findElement(sendme).click();


		System.out.println("added first sout");
		System.out.println("added first sout");
		bkhggggggggggggjlljkl

	}

}
