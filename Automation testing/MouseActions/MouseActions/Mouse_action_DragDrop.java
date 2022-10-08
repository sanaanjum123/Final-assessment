package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sana\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");//navigate to the page
		driver.manage().window().maximize();//maximize the window
		Actions actions = new Actions(driver);//Instantiate Action Class
		WebElement draggable = driver.findElement(By.id("draggable"));//Retrieve WebElement 'draggable' to drag that element and put in droppable section
	    WebElement droppable = driver.findElement(By.id("droppable"));//Retrieve WebElement 'droppable' to drag the draggable element and put in it  
	    actions.dragAndDrop(draggable, droppable).perform();//perform the drag&drop action
	     
	}

}
