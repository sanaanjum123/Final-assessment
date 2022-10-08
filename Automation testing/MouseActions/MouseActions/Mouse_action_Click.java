package MouseActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mouse_action_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sana\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");//navigate to the page
		driver.manage().window().maximize();//maximize the window
		driver.findElement(By.id("click")).click();//click on the element "click for result page"
	     
	}

}
