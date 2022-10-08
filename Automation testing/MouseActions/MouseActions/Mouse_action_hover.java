package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sana\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");//navigate to the page
		driver.manage().window().maximize();//maximize the window
		Actions actions = new Actions(driver);//Instantiate Action Class
		WebElement web = driver.findElement(By.id("hover")); //Retrieve WebElement 'Hoverable' to perform mouse hover 
    	
    	actions.moveToElement(web).perform();//Mouse hover web 'Hoverable'
	
	}

}
