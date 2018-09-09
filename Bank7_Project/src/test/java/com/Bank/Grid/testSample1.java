package com.Bank.Grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


/*Hub :
java -jar selenium-server-standalone-2.53.0.jar -role hub

Node:
Java -Dwebdriver.chrome.driver=C:\Softwares\chromedriver.exe -Dwebdriver.ie.driver=C:\Softwares\IEDriverServer.exee  -jar selenium-server-standalone-2.53.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 5555 -browser browserName=firefox,maxInstances=4 -browser browserName=iexplore -browser browserName=chrome,maxInstances=3 -maxSession 4

*
*
*/

public class testSample1 {
	

	
	@Test
	public void Facebooklogin() throws MalformedURLException, InterruptedException  {
		
		
		
	
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		
		
		cap.setBrowserName("chrome");
					
		cap.setPlatform(Platform.ANY);
		
	
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			
		
		driver.get("https://www.facebook.com/");

		
		Thread.sleep(4000);
		//String a=driver.getTitle();
	//System.out.println(a);
	driver.close();
		
	}

}
