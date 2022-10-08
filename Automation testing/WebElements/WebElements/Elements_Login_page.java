package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Login_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sana\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//navigate to the website
		driver.manage().window().maximize();//maximize the window
		driver.findElement(By.xpath("//div//img[1]"));//image in the top-center of page
		driver.findElement(By.xpath("//div//img[@src='/web/images/ohrm_logo.png']"));//image above "Login" text
		driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"));//Login title
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]"));//text"Username:Admin"
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]"));//text"Password:admin123"
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-person oxd-input-group__label-icon']"));//icon near username
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-key oxd-input-group__label-icon']"));//icon near password
		driver.findElement(By.name("username")).sendKeys("Admin");//username field
		driver.findElement(By.name("password")).sendKeys("admin123");//password field
		driver.findElement(By.xpath("//button")).click();//login button
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));//forgot password field
		driver.findElement(By.xpath("//div/a[@target='_blank'][1]"));//linkdIn hyperlink
		driver.findElement(By.xpath("//div/a[@target='_blank'][2]"));//facebook hyperlink
		driver.findElement(By.xpath("//div/a[@target='_blank'][3]"));//twitter hyperlink
		driver.findElement(By.xpath("//div/a[@target='_blank'][4]"));//youtube hyperlink
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-copyright'][1]"));//text"OrangeHRM OS 5.1"
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-copyright'][2]"));//Copyright text
		
		
		
		
	}

}
