package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CourseAssign {

WebDriver driver;
	
	
	public CourseAssign(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void courseassign() {
		driver.findElement(By.xpath("//*[@id=\"course_list_table\"]/tbody/tr[9]/td[5]/span/button/span[3]")).click();
	}

	public void assignall() {
		//driver.findElement(radio).click();
	//	if (driver.findElement(By.xpath("//*[@id=\"course_list_table\"]/tbody/tr[8]/td[6]/div/span")) != null) {
			
			WebElement assign = driver.findElement(By.xpath("//*[@id=\"course_list_table\"]/tbody/tr[11]/td[5]/span/ul/li[1]"));
		       assign.click();
	//	}else {
			
		//	System.out.println("Assigncontent : ACTIVE Already");
		//}		
	}
	public void clickok() {
		driver.findElement(By.xpath("//*[@id=\"confirmation_modal\"]/div/div[2]/div/div[1]/div[2]/button[1]")).click();
	}
	public void courseactive(){
		driver.findElement(By.xpath("//*[@id=\"course_status_msg_modal\"]/div/div[2]/div/div[2]/button[1]")).click();
	}
}
