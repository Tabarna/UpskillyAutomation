package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateUser {

	
	
WebDriver driver;
	
	
	public CreateUser(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	By users = By.xpath("/html/body/div[3]/div/a[2]/i");
	By usersmanage = By.xpath("/html/body/div[4]/div[1]/div[2]/a[1]");
	By adduser = By.xpath("/html/body/div[7]/div/div/div[14]/div[1]/div[7]/div/div[3]/div/button/span[1]");
	By clickuser = By.xpath("/html/body/div[7]/div/div/div[14]/div[1]/div[7]/div/div[3]/div/ul/li[1]/a");
	//By employeeid = By.name("employee_id");
	By employeeid = By.name("employee_id");
	By name = By.name("name");
	By email = By.name("email");
	By managerID = By.name("manager_id");
//	By location = By.name("attr_7");
//	By batch =  By.name("attr_8");
//	By timing = By.name("attr_8");
//	By course = By.name("attr_10");
//	By class1 = By.name("attr_11");
	By type = By.xpath("//input[@value='Learner/Trainee']");
	By submit = By.xpath("//*[@id=\"edit_user\"]/input[7]");
	
	
	
		  public void verifyadduser() {
			   driver.findElement(users).click();
					 		   }
		   public void verifyusermanage() {
			   driver.findElement(usersmanage).click();
		   }
	
		   public void verifyaddusers() {
			   driver.findElement(adduser).click();
		   }
		   public void verifyclickuser() {
			   driver.findElement(clickuser).click();
		   }
		   public void Enterdetails() {
			   driver.findElement(employeeid).sendKeys("STUDENT1");
		   }
		   public void ed1(){
			   driver.findElement(name).sendKeys("Abarna");
		   }
		   public void ed2(){
			   driver.findElement(email).sendKeys("abarna@gmail.com");
		   }
		   public void ed3(){
			   driver.findElement(managerID).sendKeys("ADM1");
		   }
//			   driver.findElement(location).sendKeys("Trichy");
//			   driver.findElement(batch).sendKeys("2021");
//			   driver.findElement(timing).sendKeys("10AM-4PM");
//			   driver.findElement(course).sendKeys("Information Technology");
//			   driver.findElement(class1).sendKeys("4 sem");
//			  
			  		   
		   public void radiobutton() {
			   driver.findElement(type).click();
		   }
		   public void submit() {
			   
			   driver.findElement(submit).click();
		   }
		   
}
