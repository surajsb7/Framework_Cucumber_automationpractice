//package StepDef;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//
//import io.cucumber.java.en.*;
//import pages.Refer_A_Friend_Page;
//
//public class Refer_A_Friend {
//	WebDriver driver;
//	private static final Logger logger = LogManager.getLogger(Refer_A_Friend_Page.class);
//	
//	@When("User enters the valid email address email and password to click on sign in button")
//	public void user_enters_the_valid_email_address_email_and_password_to_click_on_sign_in_button(
//			String emails,String passwords) {
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("emails");
//		
//		WebElement password = driver.findElement(By.id("passwd"));
//		password.sendKeys("passwords");
//		
//		if (email.equals(email)&& password.equals(password)){
//            Assert.assertTrue(true);
//            logger.info("Email id and password is correct");
//            
//            WebElement button = driver.findElement(By.id("SubmitLogin"));
//    		button.click();
//                   
//        }else{
//        	logger.info("Enter valid Email id and password");
//            Assert.fail("Email id and password is wrong");
//        }
//		
//	}
//
//	@When("User click on T-SHIRTS category to select Faded Short Sleeve T-shirts")
//	public void user_click_on_t_shirts_category_to_select_faded_short_sleeve_t_shirts() {
//		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@title='Faded Short Sleeve T-shirts']")).click();
//	}
//
//	@When("User click on product to see Send to a Friend option")
//	public void user_click_on_product_to_see_send_to_a_friend_option() {
//		driver.findElement(By.id("send_friend_button")).click();
//	}
//
//	@When("User click on link to send the product a friend")
//	public void user_click_on_link_to_send_the_product_a_friend() {
//		driver.findElement(By.id("friend_name")).sendKeys("Test");
//		driver.findElement(By.id("friend_email")).sendKeys("abc@gmail.com");
//		driver.findElement(By.id("sendEmail")).click();
//	}
//
//	@Then("Pop up messge should be display as product link share with friend successfully")
//	public void pop_up_messge_should_be_display_as_product_link_share_with_friend_successfully() {
//		System.out.println("Your e-mail has been sent successfully");
//		driver.findElement(By.xpath("//input[@value='OK']")).click();
//	}
//
//}
