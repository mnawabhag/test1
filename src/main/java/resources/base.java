package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class base {

	public WebDriver driver;
	public Properties prop;

	@Test
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Arjun\\eclipse-workspace\\BroSele\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Desktop\\ChromeDriver\\chromedriver.exe");
			ChromeOptions ch=new ChromeOptions();
			ch.addArguments("headless");
			driver = new ChromeDriver(ch);

		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arjun\\Desktop\\firefoxdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Arjun\\Desktop\\ied2\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
}
