package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\DEEP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.shop.demoqa.com");
	}
	
	@When("^he search for \"([^\"]*)\"$")
	 public void he_search_for(String arg1)  {
		driver.navigate().to("http://shop.demoqa.com/?s=" + arg1 + "&post_type=product");
	 }

	@Given("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
		items.get(0).click();  
	}

	@Given("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
		WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
		addToCart.click();	
		driver.quit();
	}
}
