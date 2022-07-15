package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.AddVideo;
import Objects.CreateContent;
import Objects.Loginupskilly;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddVideoContentMethod {

	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://infodemo.upskilly.com/");
	}
	@Test(priority = 0)
	public void verifylogin() {
		Loginupskilly login = new Loginupskilly(driver);
		login.Enterusername();
		login.Enterpassword();
		login.verifyLogin();
	}
	//click content
	@Test(priority = 1)
	public void verifycontentdata() {
		CreateContent content = new CreateContent(driver);
		content.verifycontent();
	}
	//click courses
	@Test(priority = 2)
	public void verifycontent() {
		CreateContent content1 = new CreateContent(driver);
		content1.content();	
	}
	//click create new course
	@Test(priority = 3)
	public void verifycontent1() {
		CreateContent content2 = new CreateContent(driver);
		content2.create();
	}
	@Test(priority = 4)
	public void clickgotit() {
		CreateContent content3 = new CreateContent(driver);
		content3.gotit();
	}
//	@Test(priority = 4)
//	public void verifycontent2() {
//		CreateContent content3 = new CreateContent(driver);
//		content3.createdata();
//	}
	@Test(priority = 5)
	public void addTitle() {
		CreateContent title = new CreateContent(driver);
		title.addtitle();
	}
	@Test(priority = 6)
	public void saveTitle() {
		CreateContent save = new CreateContent(driver);
		save.savetitle();
	}
	@Test(priority = 7)
	public void addDescription() {
		CreateContent description = new CreateContent(driver);
		description.adddescription();
	}
	@Test(priority = 8)
	public void savedes() {
		CreateContent savedescr = new CreateContent(driver);
		savedescr.savedescription();
		}
	@Test(priority = 9)
	public void addlesson1() {
		CreateContent addless = new CreateContent(driver);
		addless.addlesson();
	}
	@Test(priority = 10)
	public void addcont() {
		CreateContent addcon = new CreateContent(driver);
		addcon.addcontent();
	}
	@Test(priority = 11)
	public void addvideo() {
		AddVideo video = new AddVideo(driver);
		video.addvideo();
	}
	@Test(priority = 12)
	public void devicevdo() {
		AddVideo dvc = new AddVideo(driver);
		dvc.devicevideo();
	}
	@Test(priority = 13)
	public void save() {
		AddVideo save1 = new AddVideo(driver);
	    save1.saveandexit();
	}
	@AfterTest
	public void aftertest() {
		//driver.quit();
	}
}
