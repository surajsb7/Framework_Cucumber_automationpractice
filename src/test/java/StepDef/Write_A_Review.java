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
//import pages.Write_A_Review_Page;
//
//public class Write_A_Review extends WebDriverFactory {
//	private static final Logger logger = LogManager.getLogger(Write_A_Review.class);
//	Write_A_Review_Page write_A_Review_Page;
//
//	@Before
//	public void setUp(Scenario scn) throws Exception {
//		this.scn = scn;
//		String browserName = WebDriverFactory.getBrowserName();
//		driver = WebDriverFactory.getWebDriverForBrowser(browserName);
//		logger.info("Browser invoked.");
//		write_A_Review_Page = new Write_A_Review_Page(driver);
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
//
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
//		write_A_Review_Page.Clk_Sign_In(email, password);
//	}
//
//	@When("User click on T-SHIRTS category to select Faded Short Sleeve T-shirts")
//	public void user_click_on_t_shirts_category_to_select_faded_short_sleeve_t_shirts() {
//		driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a")).click();
//		driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
//		logger.info("T-Shirt category is selected");
//	}
//
//	@When("User click on Reviews to write a review for product")
//	public void user_click_on_reviews_to_write_a_review_for_product() {
//		driver.findElement(By.xpath("//a[@class='open-comment-form']")).click();
//		driver.findElement(By.xpath("//div[@class='star']")).click();
//		driver.findElement(By.xpath("//input[@id='comment_title']")).sendKeys("Nice Cloth");
//		driver.findElement(By.xpath("//*[@id='content']")).sendKeys("Useful product");
//		driver.findElement(By.xpath("//*[@id='submitNewMessage']")).click();
//	}
//
//	@Then("The messge should be display as New comment added")
//	public void the_messge_should_be_display_as_new_comment_added() {
//		System.out.println("Review Comment added");
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
