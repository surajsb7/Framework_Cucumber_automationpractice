//package StepDef;
//
//import java.util.concurrent.TimeUnit;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import Base.WebDriverFactory;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.*;
////import pages.Refer_A_Friend_Page;
//import pages.Sign_Up_Page;
//
//public class Sign_Up_Pom extends WebDriverFactory {
//
//	private static final Logger logger = LogManager.getLogger(Sign_Up_Pom.class);
//
//	Sign_Up_Page sign_Up_Page;
////	Refer_A_Friend_Page refer_A_Friend_Page;
//	
//	 @Before
//	    public void setUp(Scenario scn) throws Exception {
//	        this.scn = scn; 
//	        String browserName = WebDriverFactory.getBrowserName();
//	        driver = WebDriverFactory.getWebDriverForBrowser(browserName);
//	        logger.info("Browser invoked.");
//	        sign_Up_Page = new Sign_Up_Page(driver);
////	        refer_A_Friend_Page = new Refer_A_Friend_Page(driver);
//	    }
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
//		sign_Up_Page.Clk_Login_Link();
//	}
//
//	@When("User enters valid email address and click on create an account button")
//	public void user_enters_valid_email_address_and_click_on_create_an_account_button() {
//		sign_Up_Page.Txt_Sign_Up();
//		driver.manage().timeouts().implicitlyWait(Wait_Time_Second, TimeUnit.SECONDS);
//	}
//
//	@When("User fill the sign up form")
//	public void User_fill_the_sign_up_form() {
//		driver.manage().timeouts().implicitlyWait(Wait_Time_Second, TimeUnit.SECONDS);
//		sign_Up_Page.Sign_Up_Form();
//		driver.manage().timeouts().implicitlyWait(Wait_Time_Second, TimeUnit.SECONDS);
//
//	}
//
//	@Then("User is sign up successfully")
//	public void user_is_sign_up_successfully() {
//		System.out.println("test5");
//		logger.info("Sign Up Successfully");
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
//
