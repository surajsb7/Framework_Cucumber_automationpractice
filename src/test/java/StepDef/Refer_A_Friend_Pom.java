//package StepDef;
//
//import java.util.concurrent.TimeUnit;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import Base.WebDriverFactory;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.*;
//import pages.Refer_A_Friend_Page;
//
//public class Refer_A_Friend_Pom extends WebDriverFactory {
//
//	private static final Logger logger = LogManager.getLogger(Refer_A_Friend_Page.class);
//
//	Refer_A_Friend_Page refer_A_Friend_Page;
//
////	@Before
////	public void setUp(Scenario scn) throws Exception {
////		logger.info("===========Executing Refer_A_Friend_POM file=======================");
////		this.scn = scn;
////		String browserName = WebDriverFactory.getBrowserName();
////		driver = WebDriverFactory.getWebDriverForBrowser(browserName);
////		logger.info("Browser invoked.");
////		refer_A_Friend_Page = new Refer_A_Friend_Page(driver);
////
////	}
////
////	@Given("User opened browser")
////	@Deprecated
////	public void User_opened_browser() {
////
////		/*
////		 * System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
////		 * driver = new ChromeDriver(); driver.manage().window().maximize();
////		 * driver.manage().deleteAllCookies();
////		 * driver.manage().timeouts().implicitlyWait(Wait_Time_Second,
////		 * TimeUnit.SECONDS);
////		 */
////	}
//
//	// @Before
////	public void Set_Up(Scenario scn) {
////
////		logger.info("===========Executing Refer_A_Friend_POM file=======================");
////		this.scn = scn;
////		System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
////		driver = new ChromeDriver();
////		driver.manage().window().maximize();
////		driver.manage().deleteAllCookies();
////		driver.manage().timeouts().implicitlyWait(Wait_Time_Second, TimeUnit.SECONDS);
////		driver.get(Base_Url);
////		logger.info("Browser Invoked");
////		refer_A_Friend_Page = new Refer_A_Friend_Page(driver);
////	}
//
////	@Given("User navigates to the application url")
////	public void user_navigates_to_the_application_url() {
////
////		driver.get(Base_Url);
////		scn.log("Browser navigated to URL: " + Base_Url);
////		String expected = "http://automationpractice.com/index.php";
////		String actual = driver.getCurrentUrl();
////		Assert.assertEquals("Page URL validation", expected, actual);
////		scn.log("Page url validation successfull. Actual Url: " + actual);
////		logger.info("Page Url validation successfull. Expected and actual text matched. Text: " + actual);
////		logger.info("<User is navigates to the application url>");
////	}
//
////	@Given("User clicks on Sign in link at the top right corner of the application")
////	public void user_clicks_on_sign_in_link_at_the_top_right_corner_of_the_application() {
////		refer_A_Friend_Page.Clk_Login_Link();
////	}
//
//	@When("^User enters the valid (.*) id and (.*) to click on sign in button$")
//	public void user_enters_the_valid_email_id_and_password_to_click_on_sign_in_button(String email, String password) {
//		driver.manage().timeouts().implicitlyWait(Wait_Time_Second, TimeUnit.SECONDS);
//		//refer_A_Friend_Page.Clk_Sign_In(email, password);
//		driver.findElement(By.id("email")).sendKeys(email);
//		driver.findElement(By.id("passwd")).sendKeys(password);	
//		driver.findElement(By.id("SubmitLogin")).click();
//		driver.manage().timeouts().implicitlyWait(Wait_Time_Second, TimeUnit.SECONDS);
//	}
//
//	@When("User click on T-SHIRTS category to select Faded Short Sleeve T-shirts")
//	public void user_click_on_t_shirts_category_to_select_faded_short_sleeve_t_shirts() {
//		refer_A_Friend_Page.Clk_link_Category();
//		logger.info("T-Shirt category is selected");
//	}
//
//	@When("User click on product to see Send to a Friend option")
//	public void user_click_on_product_to_see_send_to_a_friend_option() {
//		refer_A_Friend_Page.Clk_link_Send_a_friend();
//		logger.info("Product is open");
//	}
//
//	@When("User click on link to send the product a friend")
//	public void user_click_on_link_to_send_the_product_a_friend() {
//		refer_A_Friend_Page.Send_Product();
//		logger.info("Valid information");
//	}
//
//	@Then("Pop up messge should be display as product link share with friend successfully")
//	public void pop_up_messge_should_be_display_as_product_link_share_with_friend_successfully() {
//		refer_A_Friend_Page.Btn_popupok();
//		logger.info("Product is refered to friend");
//	}
//
////	@After(order = 1)
////	public void Clean_Up() {
////		WebDriverFactory.quitDriver();
////	}
////
////	@After(order = 2)
////	public void takeScreenShot(Scenario s) {
////		if (s.isFailed()) {
////			TakesScreenshot scrnShot = (TakesScreenshot) driver;
////			byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
////			scn.attach(data, "image/png", "Failed Step Name: " + s.getName());
////		} else {
////			scn.log("Test case is passed, no screen shot captured");
////		}
////	}
//}
