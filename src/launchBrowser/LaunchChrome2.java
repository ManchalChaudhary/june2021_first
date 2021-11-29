package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome2 {

	public static void main(String[] args) throws InterruptedException {
	
		

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\sep2021_selenium\\1stSeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		//	driver.get("https://www.selenium.dev/downloads/");
			
			//Thread.sleep(3000);
		//	driver.close();
		
	}

}
