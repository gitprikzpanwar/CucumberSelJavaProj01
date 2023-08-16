package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	public static WebDriver driver = null;
	
	@Given("Browser is launched")
	public void browser_is_launched() {
		
		if(driver == null)
		{				
			  WebDriverManager.chromedriver().setup();
	          ChromeOptions options=new ChromeOptions();
	          options.addArguments("--disable-notifications");
	          driver = new ChromeDriver(options);		
		}			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		
		driver.navigate().to("https://google.com");
		Thread.sleep(2);
	}

	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
       
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		Thread.sleep(5);
	}

	@When("hits enter")
	public void hits_enter() {
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		 
		driver.getPageSource().concat("Online Courses");
		 
		 driver.close();
		 driver.quit();
	}

}
