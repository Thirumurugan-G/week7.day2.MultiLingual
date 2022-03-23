package basePage_POM;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static Properties prop1;
	public static String text;
	private static final ThreadLocal<ChromeDriver> tlDriver =new ThreadLocal<ChromeDriver>();
	
	public void setDriver(ChromeDriver driver)
	{tlDriver.set(driver);
	}
	public ChromeDriver  getDriver()
	{
		return tlDriver.get();
	}


	@BeforeMethod
	public void launch() throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream(new File("./src/test/resources/Login.properties"));
		prop.load(fis);
		getDriver().get(prop.getProperty("url"));
		String lang = prop.getProperty("language");
		prop1=new Properties();
		FileInputStream fis1= new FileInputStream(new File("./src/test/resources/"+lang+".properties"));
		prop1.load(fis1);
	}

	@AfterMethod
	public void tearDown() {
		getDriver().close();
	}

}
