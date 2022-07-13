package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.CreateContent;
import Objects.CreateUser;
import Objects.Loginupskilly;
import Objects.Userdetails;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod {

	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
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
	@Test(priority = 5)
	public void verifyuserdetails() {
		Userdetails userdetail = new Userdetails(driver);
		userdetail.Enteruserdetails();
		userdetail.eu1();
		userdetail.eu2();
		userdetail.eu3();
		
	}
		
	@Test(priority = 1)
	public void verifyAdduser() {
		CreateUser user = new CreateUser(driver);
		user.verifyadduser();
		}
	@Test(priority = 2)
	public void verifyUsermanage() {
		CreateUser user1 = new CreateUser(driver);
		user1.verifyusermanage();
	}
	@Test(priority = 3)
	public void verifyAddusers() {
		CreateUser user2 = new CreateUser(driver);
		user2.verifyaddusers();
	}
	@Test(priority = 4)
	public void verifyClickuser() {
		CreateUser user3 = new CreateUser(driver);
		user3.verifyclickuser();
	}
	@Test(priority = 6)
	public void radio() {
		Userdetails us = new Userdetails(driver); 
			us.radiobutton();
		}
	@Test(priority = 7)
	public void verifyl() {
		Userdetails uslogin = new Userdetails(driver);
		uslogin.verifyLogin();
	}
	
	@Test(priority = 8)
	public void verifygot() {
		Userdetails gotit = new Userdetails(driver);
		gotit.clickgotit();
	}
	@Test(priority = 9)
	public void verifycontentdata() {
		CreateContent content = new CreateContent(driver);
		content.verifycontent();
		
	}
	@Test(priority = 10)
	public void verifycontent() {
		CreateContent content1 = new CreateContent(driver);
		content1.content();	
	}
	@Test(priority = 11)
	public void verifycontent1() {
		CreateContent content2 = new CreateContent(driver);
		content2.create();
	}
	@Test(priority = 12)
	public void verifycontent2() {
		CreateContent content3 = new CreateContent(driver);
		content3.createdata();
	}
	
	@AfterTest
	public void aftertest() {
		//driver.quit();
	}
}
