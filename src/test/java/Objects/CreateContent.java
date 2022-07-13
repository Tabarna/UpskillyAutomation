package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateContent {

	
	
WebDriver driver;
	
	
	public CreateContent(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void verifycontent() {
		driver.findElement(By.xpath("/html/body/div[3]/div/a[3]/i")).click();
	}
	public void content() {
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[3]/a[1]")).click();
	}
	public void create() {
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div[18]/div[1]/div[5]/a")).click();
	}
	public void createdata() {
		driver.findElement(By.xpath("//*[@id=\"new_course_modal\"]/div/div[2]/div/button")).click();
	}
	public void addtitle() {
		driver.findElement(By.name("course_name")).sendKeys("Agile");
	}
	public void adddescription() {
		driver.findElement(By.name("course_short_desc")).sendKeys("agile tutorial");
	}
	public void addlesson() {
		driver.findElement(By.xpath("//*[@id=\"step_2\"]/div/div[1]/div[2]/ol/li/button[2]")).click();
	}
	public void addcontent() {
		driver.findElement(By.xpath("//*[@id=\"step_2\"]/div/div[1]/div[2]/ol/li/ol/li/button[2]")).click();
	}
}
