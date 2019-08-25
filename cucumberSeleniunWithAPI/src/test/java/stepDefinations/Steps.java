package stepDefinations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("^user is redirect to this \"([^\"]*)\"$")
	public void user_is_redirect_to_this(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DEEP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}

	@When("^clicks on first api$")
	public void clicks_on_first_api() throws Throwable {
		driver.findElement(By.xpath("//div[@class='endpoints']/ul/li/a")).click();
	}

	@When("^execute api in new tab$")
	public void execute_api_in_new_tab() throws Throwable {
		String apiPartialURL=driver.findElement(By.cssSelector(".url")).getText(); 
		apiPartialURL = apiPartialURL.substring(1);
		String baseURL=driver.getCurrentUrl();		
		String apiURL = baseURL + apiPartialURL ;
		System.out.println(apiURL);
		
		
	}

	@Then("^compare the output with ui$")
	public void compare_the_output_with_ui() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
}
