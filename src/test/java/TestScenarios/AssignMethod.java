package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.CourseAssign;
import Objects.CreateContent;
import Objects.Loginupskilly;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignMethod {


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
	@Test(priority = 1)
	public void verifycontentdata() {
		CreateContent content = new CreateContent(driver);
		content.verifycontent();
	}
	@Test(priority = 2)
	public void verifycontent() {
		CreateContent content1 = new CreateContent(driver);
		content1.content();	
	}
	@Test(priority = 3)
	public void assigncourses() {
		CourseAssign assign = new CourseAssign(driver);
		assign.courseassign();
	}
	@Test(priority = 4)
	public void assignall() {
		CourseAssign allassign = new CourseAssign(driver);
		allassign.assignall();
	}
	@Test(priority = 5)
	public void click() {
		CourseAssign clickassign = new CourseAssign(driver);
		clickassign.clickok();
	}
	@Test(priority = 6)
	public void courseactv() {
		CourseAssign cactive = new CourseAssign(driver);
		cactive.courseactive();
	}
	@AfterTest
	public void aftertest() {
		//driver.quit();
	}
}
