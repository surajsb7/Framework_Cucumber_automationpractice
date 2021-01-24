//package pages;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class Sign_Up_Page {
//
//	private static final Logger logger = LogManager.getLogger(Sign_Up_Page.class);
//
//	WebDriver driver;
//
//	private By link_Login = By.xpath("//a[@class='login']");
//	private By txt_Signup = By.id("email_create");
//	private By btn_Submit = By.xpath("//button[@id='SubmitCreate']");
//	private By Rbtn_Gender = By.id("uniform-id_gender1");
//	private By txt_FirstName = By.id("customer_firstname");
//	private By txt_LastName = By.id("customer_lastname");
//	private By txt_Password = By.id("passwd");
//	private By cal_Date = By.id("days");
//	private By cal_Month = By.id("months");
//	private By cal_Year = By.id("years");
//	private By txt_Company = By.id("company");
//	private By txt_Address = By.id("address1");
//	private By txt_City = By.id("city");
//	private By drop_State = By.id("id_state");
//	private By txt_Postcode = By.id("postcode");
//	private By drop_Country = By.id("id_country");
//	private By txt_Other = By.id("other");
//	private By txt_Phone = By.id("phone");
//	private By txt_Mobile = By.id("phone_mobile");
//	private By txt_Alias = By.id("alias");
//	//private By txt_Register = By.id("submitAccount");
//
//	public Sign_Up_Page(WebDriver driver) {
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
//	public void Txt_Sign_Up() {
//		driver.findElement(txt_Signup).sendKeys("surajbobade786@gmail.com");
//		driver.findElement(btn_Submit).click();
//		logger.info("Valid email id for sign up");
//	}
//	
//	public void Sign_Up_Form() {
//		driver.findElement(Rbtn_Gender).click();
//		driver.findElement(txt_FirstName).sendKeys("Suraj");
//		driver.findElement(txt_LastName).sendKeys("Bobade");
//		driver.findElement(txt_Password).sendKeys("Mydec@1234");
//		Select date = new Select(driver.findElement(cal_Date));
//		date.selectByValue("15");
//		Select month = new Select(driver.findElement(cal_Month));
//		month.selectByValue("8");
//		Select year = new Select(driver.findElement(cal_Year));
//		year.selectByValue("1947");
//		driver.findElement(txt_Company).sendKeys("Testing Company");
//		driver.findElement(txt_Address).sendKeys("Ravi Nagar Wani");
//		driver.findElement(txt_City).sendKeys("Wani");
//		Select state = new Select(driver.findElement(drop_State));
//		state.selectByValue("1");
//		driver.findElement(txt_Postcode).sendKeys("35226");
//		Select country = new Select(driver.findElement(drop_Country));
//		country.selectByValue("21");
//		driver.findElement(txt_Other).sendKeys("1234567899");
//		driver.findElement(txt_Phone).sendKeys("1122334455");
//		driver.findElement(txt_Mobile).sendKeys("7676333444");
//		driver.findElement(txt_Alias).sendKeys("Address is confirmed");
//		//driver.findElement(txt_Register).click();
//		logger.info("Valid all the information of sign up form");
//		
//	}
//}
