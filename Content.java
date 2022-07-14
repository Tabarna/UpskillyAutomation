package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Content {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	        // WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        //driver.manage().window().maximize();
	       // driver.get("https://infodemo.upskilly.com/admin/#content-management/course-list/");
	     //   driver.findElement(By.name("//*[@id="course_info_wrapper"]/div[4]/div/div[1]/h1")).sendKeys("ADM1");
	       // driver.findElement(By.name("pswd")).sendKeys("1");
	        driver.get("http://infodemo.upskilly.com");
	        driver.findElement(By.name("employee_id")).sendKeys("ADM1");
	        driver.findElement(By.name("pswd")).sendKeys("1");
	        driver.findElement(By.xpath("//*[@id=\"login_form\"]/input[4]")).click();
	        driver.findElement(By.xpath("/html/body/div[3]/div/a[3]")).click();
	        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[3]/a[1]/span")).click();
	        driver.findElement(By.xpath("/html/body/div[7]/div/div/div[18]/div[1]/div[5]/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"new_course_modal\"]/div/div[2]/div/button")).click();
	        driver.findElement(By.xpath("//*[@id=\"course_info_wrapper\"]/div[4]/div/div[1]/h1")).sendKeys("Testing");
	        driver.findElement(By.xpath("//*[@id=\"course_info_wrapper\"]/div[4]/div/div[1]/div[1]")).click();
	        driver.findElement(By.xpath("//*[@id=\"course_info_wrapper\"]/div[4]/div/div[2]/h2")).sendKeys("Testing tutorial");
	        driver.findElement(By.xpath("//*[@id=\"course_info_wrapper\"]/div[4]/div/div[2]/div[1]")).click();  
	    //    String u = driver.getCurrentUrl();
//	        if (u.equals("https://infodemo.upskilly.com/admin/#summary/")) {
//	            System.out.println("Testcase Passed");
//	        } else {
//	            System.out.println("Testcase Failed");
//	        }
	      //*[@id="new_course_modal"]/div/div[2]/div/button
	    }
	}


