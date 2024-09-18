import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemoGoogle {
	@Test
	public void sampleTest() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN11);
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
//		Here we need to pass the IP address of the hub
		WebDriver driver = new RemoteWebDriver(new URI(" http://172.24.208.1:4444").toURL(), caps);
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.getTitle();
		
	}
}

	
