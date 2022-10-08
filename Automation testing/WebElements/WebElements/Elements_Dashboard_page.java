package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Dashboard_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sana\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//navigate to the website
		driver.manage().window().maximize();//maximize the window
		driver.findElement(By.name("username")).sendKeys("Admin");//username field
		driver.findElement(By.name("password")).sendKeys("admin123");//password field
		driver.findElement(By.xpath("//button")).click();//login button
	    driver.findElement(By.linkText("PIM")).click();//click on sidebar PIM
	    driver.findElement(By.linkText("Leave")).click();//click on sidebar Leave
	    driver.findElement(By.linkText("Time")).click();//click on sidebar Time
	    driver.findElement(By.linkText("Recruitment")).click();//click on sidebar Recruitment
	    driver.findElement(By.linkText("My Info")).click();//click on sidebar My Info
	    
	}

}
