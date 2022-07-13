package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Userdetails {

	
WebDriver driver;
	
	
	public Userdetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

//	By employeeid = By.name("employee_id");
//	By name = By.name("name");
//	By email = By.name("email");
//	By managerID = By.name("manager_id");
//	By radio = By.name("role");
	By submit = By.xpath("//*[@id=\"edit_user\"]/input[7]");
	By gotit  = By.xpath("//*[@id=\"status_msg_modal\"]/div/div[2]/div/button");
	
	public void Enteruserdetails() {
		driver.findElement(By.xpath("//*[@id=\"edit_user\"]/input[3]")).sendKeys("STUDENT4");
	}
	public void eu1() {
		
			driver.findElement(By.xpath("//*[@id=\"edit_user\"]/input[4]")).sendKeys("student4");
		}
	public void eu2() {
		
		driver.findElement(By.xpath("//*[@id=\"edit_user\"]/input[5]")).sendKeys("student4@gmail.com");
	}public void eu3() {
			driver.findElement(By.name("manager_id")).sendKeys("ADM1");
		
		
	}
	
	public void radiobutton() {
		//driver.findElement(radio).click();
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"edit_user\"]/div[3]/span[2]"));
        radio.click();
	}
   public void verifyLogin() {
	   driver.findElement(submit).click();
	   
   }
   
   public void clickgotit() {
	   driver.findElement(gotit).click();
   }
  
}
