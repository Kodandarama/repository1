package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driverQuit_close {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:\\Softwares\\Selenium_Installers\\To_Work_with_IE_browser\\IEDriverServer.exe");
		
		
  WebDriver driver = new InternetExplorerDriver();
  
  driver.get("https://www.yahoo.com");


	}

}
