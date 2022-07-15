package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Objects.AddUtube;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddutubeMethod {

	

	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://infodemo.upskilly.com/");
	}
	public void verifyutube() {
		AddUtube u1 = new AddUtube(driver);
		u1.utube();
		u1.addvideo();
		u1.insert();
	}
	
}
