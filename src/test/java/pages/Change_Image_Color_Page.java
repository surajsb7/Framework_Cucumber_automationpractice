package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Change_Image_Color_Page {

	private static final Logger logger = LogManager.getLogger(Change_Image_Color_Page.class);

	protected WebDriver driver;

	private By link_Login = By.xpath("//a[@class='login']");
	private By link_Email = By.id("email");
	private By txt_Password = By.id("passwd");
	private By btn_Signin = By.id("SubmitLogin");
	private By link_Category = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	private By link_Product = By.xpath("//*[@title='Faded Short Sleeve T-shirts']");
	private By img_Color = By.xpath("//a[@id='color_14']");
	
	public Change_Image_Color_Page(WebDriver driver) {
		this.driver = driver;
	}

//---------------------sign up------------------
	public void Clk_Login_Link() {
		driver.findElement(link_Login).click();
		logger.info("Clicked on Login link");

	}

// ---------------------------------------
	public void Clk_Sign_In(String email, String password) {
		driver.findElement(link_Email).sendKeys(email);
		driver.findElement(txt_Password).sendKeys(password);
		logger.info("========== User enters Email id and password ==================");
		driver.findElement(btn_Signin).click();
	}
	
	public void Clk_link_Category() {
		driver.findElement(link_Category).click();
		driver.findElement(link_Product).click();
	}
	
	public void Clk_Change_Color() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		driver.findElement(img_Color).click();
	}
}
