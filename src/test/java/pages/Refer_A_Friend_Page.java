//package pages;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class Refer_A_Friend_Page {
//	private static final Logger logger = LogManager.getLogger(Refer_A_Friend_Page.class);
//
//	protected WebDriver driver;
//
////	----------------signup------------
////	private By link_Login = By.xpath("//a[@class='login']");
////	---------------------------------------------------
////	private By link_Email = By.id("email");
////	private By txt_Password = By.id("passwd");
////	private By btn_Signin = By.id("SubmitLogin");
////	private By link_Category = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
//	private By link_Category = By.xpath("//div[@id='page']/div/header/div[3]/div/div/div[6]/ul/li[3]/a");
//	private By link_Product = By.xpath("//*[@title='Faded Short Sleeve T-shirts']");
//	private By link_Send_a_friend = By.id("send_friend_button");//By.id("SubmitLogin");
//	private By txt_Name = By.id("friend_name");
//	private By txt_Email = By.id("friend_email");
//	private By btn_Submit = By.id("sendEmail");
//	private By btn_Ok = By.xpath("//input[@value='OK']");
//
//	public Refer_A_Friend_Page(WebDriver driver) {
//		this.driver = driver;
//
//	}
//
////---------------------sign up------------------
////	public void Clk_Login_Link() {
////		driver.findElement(link_Login).click();
////		logger.info("Clicked on Login link");
////
////	}
//
//// ---------------------------------------
////	public void Clk_Sign_In() {
////		driver.findElement(link_Email).sendKeys(email);
////		driver.findElement(txt_Password).sendKeys(password);	
////		driver.findElement(btn_Signin).click();
////		logger.info("========== User enters Email id and password ==================");
////	}
//
//	public void Clk_link_Category() {
//		driver.findElement(link_Category).click();
//		driver.findElement(link_Product).click();
//	}
//
//	public void Clk_link_Send_a_friend() {
//		driver.findElement(link_Send_a_friend).click();
//	}
//
//	public void Send_Product() {
//		driver.findElement(txt_Name).sendKeys("test");
//		driver.findElement(txt_Email).sendKeys("abc@gmail.com");
//		driver.findElement(btn_Submit).click();
//	}
//
//	public void Btn_popupok() {
//		driver.findElement(btn_Ok).click();
//	}
//}
