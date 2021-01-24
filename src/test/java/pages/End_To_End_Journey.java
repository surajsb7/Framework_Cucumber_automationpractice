package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class End_To_End_Journey {

	private static final Logger logger = LogManager.getLogger(End_To_End_Journey.class);
	protected WebDriver driver;
	WebDriverWait Wait;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement clklogin;

	@FindBy(id = "email")
	private WebElement emailid;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement login;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement category;

	@FindBy(xpath = "//*[@title='Faded Short Sleeve T-shirts']")
	private WebElement selectedcategory;

	@FindBy(xpath = "//span[@id='our_price_display']")
	private WebElement price;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;

	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement sizes;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement cart;
	
	public End_To_End_Journey(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clklogin() {
		clklogin.click();
		logger.info("User clik on sign-in link");
	}

	public void signin() {
		emailid.sendKeys("sachin92@gmail.com");
		password.sendKeys("Mysachin@12345");
		login.click();
		Wait = new WebDriverWait(driver,3);
		WebElement login = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='account']")));
		String loginname = login.getText();
		Assert.assertTrue(loginname.contains("sachin testing"));
		logger.info("User entered valid login details");
	}

	public void productcategory() {
		category.click();
//		Wait = new WebDriverWait(driver,3);
//		WebElement stock = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='availability']/span")));
//		String actual = stock.getText().trim();
//		String expected = "In Stock";
//		Assert.assertEquals(expected, actual);
		selectedcategory.click();
		logger.info("Faded Short Sleeve T-shirts is selected");
	}

	public void fetchprice() {
		System.out.println("Selected product price is " + " : " + " "+ price.getText());
	}

	public void quantity() {
		quantity.click();
	}

	public void size() {
		Select size = new Select(sizes);
		size.selectByValue("3");
	}

	public void addtocart() {
		cart.click();
	}
}
