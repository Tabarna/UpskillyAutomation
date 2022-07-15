package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUtube {

		WebDriver driver;
	
	public AddUtube(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void utube() {
		driver.findElement(By.xpath("//*[@id=\"step_2\"]/div/div[2]/div[1]/div[3]/button[3]")).click();
	}
	public void addvideo() {
		driver.findElement(By.xpath("//*[@id=\"video_embed_modal\"]/div/div[2]/div/div/div[4]/div[1]/a[1]")).click();
	}
	public void insert() {
		driver.findElement(By.xpath("//*[@id=\"video_embed_modal\"]/div/div[2]/div/div/div[1]/button")).click();
	}
}
