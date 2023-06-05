package driver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {

	public static WebDriver driver;
	
	static String path="D:\\AutomationDrivers\\ChromeDriver\\91.0.4472.19\\chromedriver.exe";


	public static WebDriver launch() throws Throwable {

		System.setProperty("webdriver.chrome.driver",path);


//	public WebDriver launch() throws Throwable {

//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neosoft\\Downloads\\chromedriver_win32\\chromedriver.exe");


		driver = new ChromeDriver();
		driver.get("https://omstest.kalelogistics.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		System.out.println("OMS Application launch success");

		return driver;
	}
	
	public WebDriver launch(String chromeDriverPath, String URL)
	{
		  System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(URL);
		  
		  return driver;
	}
	
	public WebDriver launch(String chromeDriverPath, String downloadFilePath, String URL)
	{
		  System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		  ChromeOptions options=new ChromeOptions();
		  HashMap<String, Object> chromePref = new HashMap<String, Object>();
		  chromePref.put("profile.default_content_settings.popups", 0);
		  chromePref.put("download.default_directory", downloadFilePath);
		  options.setExperimentalOption("prefs", chromePref);
		  driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
 		  driver.get(URL);
		  
		  return driver;
	}
	
	public WebDriver launchX()
	{
		  System.setProperty("webdriver.chrome.driver","D:\\AutomationDrivers\\ChromeDriver\\87.0.4280.88\\chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
		  HashMap<String, Object> chromePref = new HashMap<String, Object>();
		  chromePref.put("profile.default_content_settings.popups", 0);
		  chromePref.put("download.default_directory", "E:\\Projects\\NeonOmsWorkspace\\Download\\");
		  options.setExperimentalOption("prefs", chromePref);
		  driver=new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.get("https://omstest.kalelogistics.com/");
		  
		  return driver;
	}
	


}
