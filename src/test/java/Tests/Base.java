package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Factories.GreenCardFactroy;

public class Base {

	protected WebDriver driver;
	protected Properties prop;
	protected Actions act;
	protected GreenCardFactroy gr;
	@BeforeClass
	public void setUp() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\Properties\\mainProperties.properties");
		FileInputStream greenprop = new FileInputStream("src\\main\\java\\Properties\\propgr.properties");
		//prop.load(fis);
		prop.load(greenprop);
		String browser = prop.getProperty("browser");
		if(browser.equals("ie")) {
	System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	}else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		driver=new InternetExplorerDriver();	
	}else {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
		act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	    gr = new GreenCardFactroy(driver);
	}

	
	//@AfterClass
public void closeDriver() {
driver.close();


	}
}
