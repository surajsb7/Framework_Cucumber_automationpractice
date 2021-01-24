package StepDef;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pages.End_To_End_Journey;

public class End_To_End_Journey_Pom extends WebDriverFactory {
	private static final Logger logger = LogManager.getLogger(End_To_End_Journey_Pom.class);
	End_To_End_Journey end_To_End_Journey;
	WebDriverWait Wait;

	@Before
	public void setUp(Scenario scn) throws Exception {
		this.scn = scn;
		String browserName = WebDriverFactory.getBrowserName();
		driver = WebDriverFactory.getWebDriverForBrowser(browserName);
		logger.info("Browser invoked.");
		end_To_End_Journey = new End_To_End_Journey(driver);
	}

	@Given("User opened browser")
	@Deprecated
	public void User_opened_browser() {

		/*
		 * System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().implicitlyWait(Wait_Time_Second,
		 * TimeUnit.SECONDS);
		 */
	}

	@Given("User navigates to the application url")
	public void user_navigates_to_the_application_url() {

		driver.get(Base_Url);
		scn.log("Browser navigated to URL: " + Base_Url);
		String expected = "http://automationpractice.com/index.php";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals("Page URL validation", expected, actual);
		scn.log("Page url validation successfull. Actual Url: " + actual);
		logger.info("Page Url validation successfull. Expected and actual text matched. Text: " + actual);
		logger.info("<User is navigates to the application url>");
	}

	@Given("User clicks on Sign in link at the top right corner of the application")
	public void User_clicks_on_Sign_in_link_at_the_top_right_corner_of_the_application() {
		end_To_End_Journey.clklogin();
	}

	@When("User enters the valid email id and password to click on sign in button")
	public void user_enters_the_valid_email_id_and_password_to_click_on_sign_in_button() {
		end_To_End_Journey.signin();
	}

	@When("User click on T-SHIRTS category to select Faded Short Sleeve T-shirts product")
	public void user_click_on_t_shirts_category_to_select_faded_short_sleeve_t_shirts_product() {
		end_To_End_Journey.productcategory();
	}

	@When("Fetching the Amount of the product as per user is selected")
	public void fetching_the_amount_of_the_product_as_per_user_is_selected() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		System.out.println("-------------- Price of product Is -------------------------------------");
		end_To_End_Journey.fetchprice();
		System.out.println("------------------------------------------------------------------------");
	}

	@When("User is increase the Quantity to {int}")
	public void user_is_increase_the_quantity_to(Integer int1) {
		end_To_End_Journey.quantity();
	}

	@When("User is increase the size to L")
	public void user_is_increase_the_size_to_l() {
		end_To_End_Journey.size();
	}

	@When("User click on Add to Cart")
	public void user_click_on_add_to_cart() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		end_To_End_Journey.addtocart();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.switchTo().defaultContent();
	}

	@Then("User should display a message as product added to cart and selected product should display in cart")
	public void user_should_display_a_message_as_product_added_to_cart_and_selected_product_should_display_in_cart() {
		Wait = new WebDriverWait(driver,3);
		WebElement msg = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2")));
		String cartproduct = msg.getText();
		Assert.assertTrue(cartproduct.contains("Product successfully added to your shopping cart"));
		scn.log("Product successfully added to your shopping cart");
	}

	@After(order = 1)
	public void Clean_Up() {
		WebDriverFactory.quitDriver();
	}

	@After(order = 2)
	public void takeScreenShot(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot scrnShot = (TakesScreenshot) driver;
			byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png", "Failed Step Name: " + s.getName());
		} else {
			scn.log("Test case is passed, no screen shot captured");
		}
	}

}
