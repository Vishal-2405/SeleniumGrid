import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemoFirefox {
	
	public void Firefox() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("Firefox");
		caps.setPlatform(Platform.WIN11);
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
//		Here we need to pass the IP address of the hub
		WebDriver driver = new RemoteWebDriver(new URI(" http://172.24.208.1:4444").toURL(), caps);
		driver.get("https://facebook.com");
		driver.getTitle();
		Thread.sleep(2000);
		driver.close();
	}

}
