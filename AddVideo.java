package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddVideo {

WebDriver driver;
	
	
	public AddVideo(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void addvideo() {
		driver.findElement(By.xpath("//*[@id=\"step_2\"]/div/div[2]/div[1]/div[2]/button[1]")).click();
	}
	public void devicevideo() {
		driver.findElement(By.name("up_video_computer")).click();
	}
//	public void saveandexit() {
//		driver.findElement(By.xpath("//*[@id=\"save_and_exit\"]")).click();
//	}
//	public void saveandexit() {
//		// TODO Auto-generated method stub
//		
//	}
//	
	public void saveandexit() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"save_and_exit\"]")).click();
		
	}
}
