package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_Cucumber {

	private static WebDriver driver = null;
    @Given("browser is open and application is in login page")
    public void browser_is_open_and_application_is_in_login_page()  {
        
        System.setProperty("webdriver.chrome.driver", "C:\\sana\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
    }
   @When("user enters user name and password")
    public void user_enters_user_name_and_password() {
        
         driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
}
    @Then("home page is displayed")
    public void home_page_is_displayed() {
           String actualresult, expectedresult;
            expectedresult="PIM";
            actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
            SoftAssert soft= new SoftAssert();
            soft.assertEquals(actualresult, expectedresult);
    }
    
 //Apply leave in leave section
	@Given("Click Leave element")
	public void click_leave_element() {
		driver.findElement(By.linkText("Leave")).click();
	}

	@Then("Click on Apply option")
	public void click_on_apply_option() {
		driver.findElement(By.linkText("Apply")).click();
	}

	@Then("Select leave type")
	public void select_leave_type() {
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	}

	@Then("Choose the dates")
	public void choose_the_dates() {
		driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-02-09");
	}

	@Then("give the reason")
	public void give_the_reason() {
		driver.findElement(By.xpath("//textarea")).sendKeys("Personal leave");
	}

	@Then("click Apply button")
	public void click_apply_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	
 //Search function using method overload in employee section
 	@Given("Click on Admin element")
 	public void clicl_on_admin_element(){
 		driver.findElement(By.xpath("//a/span")).click();
 	}
 	
 	@Then("Give Username as {string}")
 	public void search(String string) {
 		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(string);
 		driver.findElement(By.xpath("//form//div//button[2]")).click();
 	}
 	
 	
 	@Then("Give Username as {string} and employeeName as {string}")
 	public void search(String string, String string2) {
 		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(string);
 		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(string2);
 		driver.findElement(By.xpath("//form//div//button[2]")).click();	
 	
 	 }
 	}      


