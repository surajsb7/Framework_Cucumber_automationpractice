//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//public class Write_A_Review_Page {
//	private static final Logger logger = LogManager.getLogger(Write_A_Review_Page.class);
//	protected WebDriver driver;
//
//	// ----------------signup------------
//	private By link_Login = By.xpath("//a[@class='login']");
//	// ---------------
//	private By link_Email = By.id("email");
//	private By txt_Password = By.id("passwd");
//	private By btn_Signin = By.id("SubmitLogin");
//	private By link_Category = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
//	private By link_Product = By.xpath("//*[@title='Faded Short Sleeve T-shirts']");
//	private By link_of_product = By.id("send_friend_button");// By.id("SubmitLogin");
//	private By clk_WriteReview = By.xpath("//a[@class='open-comment-form']");
//	private By clk_RatingStar = By.xpath("//div[@class='star']");
//	private By txt_Title = By.xpath("//input[@id='comment_title']");
//	private By txt_Comment = By.xpath("//*[@id='content']");
//	private By btn_Send = By.xpath("//*[@id='submitNewMessage']");
//
//	public Write_A_Review_Page(WebDriver driver) {
//		this.driver = driver;
//
//	}
//
//	public void Clk_Login_Link() {
//		driver.findElement(link_Login).click();
//		logger.info("Clicked on Login link");
//
//	}
//
//	public void Clk_Sign_In(String email, String password) {
//		driver.findElement(link_Email).sendKeys(email);
//		driver.findElement(txt_Password).sendKeys(password);
//		logger.info("========== User enters Email id and password ==================");
//		driver.findElement(btn_Signin).click();
//	}
//
//	public void Clk_link_Category() {
//		driver.findElement(link_Category).click();
//		driver.findElement(link_Product).click();
//	}
//
//	public void Clk_link_Of_Product() {
//		driver.findElement(link_of_product).click();
//	}
//	
//	public void Comment_Form() {
//		
//		driver.findElement(clk_WriteReview).click();
//		driver.findElement(clk_RatingStar).click();
//		driver.findElement(txt_Title).sendKeys("Nice Cloth");
//		driver.findElement(txt_Comment).sendKeys("Useful product");
//		driver.findElement(btn_Send).click();
//	}
//
//}
