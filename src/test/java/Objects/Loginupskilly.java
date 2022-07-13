package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginupskilly {

	WebDriver driver;
	
	
	public Loginupskilly(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By employeeid = By.name("employee_id");
	By password = By.name("pswd");
	By login = By.xpath("//*[@id=\"login_form\"]/input[4]");
	
	
	public void Enterusername() {
		driver.findElement(employeeid).sendKeys("ADM1");
		
	}
	public void Enterpassword() {
		driver.findElement(password).sendKeys("1");
	}
   public void verifyLogin() {
	   driver.findElement(login).click();
	   
   }
   
  
	
}
