package PracticeSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pObjects.ForgotPassword;
import pObjects.LandingPage;
import pObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initTest() throws IOException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
				
	}
	
	@Test
	public void basePageNav() throws InterruptedException {
		
		LandingPage l=new LandingPage(driver);
		LoginPage lp=l.getLogin();
		lp.getEmail().sendKeys("abc@extra.com");
		lp.getPasword().sendKeys("sdsldjskbkzcb");
		ForgotPassword fp=lp.getForgotPassword();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[value='Send Me Instructions']")));
		fp.getForgotpassword().sendKeys("whatevere@gmail.com");
		fp.getSendMe();
		
	}
	
	@AfterTest
	public void closeDrivers() {
		driver.close();
	}

}
