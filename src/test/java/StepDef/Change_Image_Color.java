//package StepDef;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebElement;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import Base.WebDriverFactory;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.*;
//
//public class Change_Image_Color extends WebDriverFactory {
//	
//	private static final Logger logger = LogManager.getLogger(Change_Image_Color.class);
//	
//	@Before
//	public void setUp(Scenario scn) throws Exception {
//		this.scn = scn;
//		String browserName = WebDriverFactory.getBrowserName();
//		driver = WebDriverFactory.getWebDriverForBrowser(browserName);
//		logger.info("Browser invoked.");
//	}
//
//	@Given("User opened browser")
//	@Deprecated
//	public void User_opened_browser() {
//
//		/*
//		 * System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
//		 * driver = new ChromeDriver(); driver.manage().window().maximize();
//		 * driver.manage().deleteAllCookies();
//		 * driver.manage().timeouts().implicitlyWait(Wait_Time_Second,
//		 * TimeUnit.SECONDS);
//		 */
//	}
//
//	@Given("User navigates to the application url")
//	public void user_navigates_to_the_application_url() {
//		driver.get(Base_Url);
//		scn.log("Browser navigated to URL: " + Base_Url);
//		String expected = "http://automationpractice.com/index.php";
//		String actual = driver.getCurrentUrl();
//		Assert.assertEquals("Page URL validation", expected, actual);
//		scn.log("Page url validation successfull. Actual Url: " + actual);
//		logger.info("Page Url validation successfull. Expected and actual text matched. Text: " + actual);
//		logger.info("<User is navigates to the application url>");
//	}
//
//	@Given("User clicks on Sign in link at the top right corner of the application")
//	public void user_clicks_on_sign_in_link_at_the_top_right_corner_of_the_application() {
//		WebElement clklogin = driver.findElement(By.xpath("//a[@class='login']"));
//		clklogin.click();
//	}
//
//	@When("^User enters the valid (.*) id and (.*) to click on sign in button$")
//	public void user_enters_the_valid_email_id_and_password_to_click_on_sign_in_button(String email, String password) {
//		System.out.println("Color - 4");
//	}
//	
//	@When("User click on T-SHIRTS category to select Faded Short Sleeve T-shirts")
//	public void user_click_on_t_shirts_category_to_select_faded_short_sleeve_t_shirts() {
//		driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a")).click();
//		driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
//		logger.info("T-Shirt category is selected");
//	}
//
//	@When("User click on change the image color")
//	public void User_click_on_change_the_image_color() {
//		driver.findElement(By.id("//a[@id='color_14']")).click();
//	}
//
//	@Then("Product image color should be changed")
//	public void product_image_color_should_be_changed() {
//		System.out.println("Colored is changed");
//	}
//	
//	@After(order = 1)
//	public void Clean_Up() {
//		WebDriverFactory.quitDriver();
//	}
//	
//	@After(order = 2)
//	public void takeScreenShot(Scenario s) {
//		if (s.isFailed()) {
//			TakesScreenshot scrnShot = (TakesScreenshot) driver;
//			byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
//			scn.attach(data, "image/png", "Failed Step Name: " + s.getName());
//		} else {
//			scn.log("Test case is passed, no screen shot captured");
//		}
//	}
//}
