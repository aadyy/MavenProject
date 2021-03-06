package Page_object_indialends;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Base;

public class CC_AMEX_Lender_Page  extends Base {

protected WebDriver driver;
	
	//=========================== Short Form Page Locators =============================================================== //
	
@FindBy(how = How.CSS, using = "#li_first_name")
private WebElement fname;

@FindBy(how = How.CSS, using = "#li_res_pin")
private WebElement pincode;

@FindBy(how = How.CSS, using = "#li_emp_type")
private WebElement empType;

@FindBy(how = How.CSS, using = "#li_company_name")
private WebElement companyname;

@FindBy(how = How.CSS, using = "#li_monthly_salary")
private WebElement salary;

@FindBy(how = How.CSS, using = "#li_email_id")
private WebElement email;

@FindBy(how = How.CSS, using = "#li_mobile_number")
private WebElement mobile;

@FindBy(how = How.CSS, using = "#li_submit")
private WebElement clickNextBtn;

// ================== Otp Screen & I-lite Locators================ //

@FindBy(how = How.XPATH, using = "//*[@id=\"txt_otp\"]")
private WebElement otptake;

@FindBy(how = How.XPATH, using = "//*[@id=\"btn_mobile_verify\"]")
private WebElement otpVerify;

@FindBy(how = How.CSS, using = "#control-indicator")
private WebElement terms;

// ============================= Check Eligibility ===============//

@FindBy(how = How.CSS, using = "#male")
private WebElement gender;

@FindBy(how = How.CSS, using = "#radio-8")
private WebElement existingCard;

@FindBy(how = How.CSS, using = "#li_off_pin")
private WebElement Officepincode;

@FindBy(how = How.CSS, using = "#li_pan_number")
private WebElement PanNo;

@FindBy(how = How.CSS, using = "#li_submit_pan_details")
private WebElement Submit;

@FindBy(how = How.CSS, using = "#dv_karza_buttons > div.col-sm-5.col-xs-5.pad0.pad20t > span")
private WebElement PanKarza;

// ============= General Information ======================//

@FindBy(how = How.CSS, using = "#married")
private WebElement MaritalStatus;

@FindBy(how = How.CSS, using = "#employmentSelect")
private WebElement Qualification;

// Present residential address//

@FindBy(how = How.CSS, using = "#li_res_house_no")
private WebElement houseNo;

@FindBy(how = How.CSS, using = "#li_res_street")
private WebElement street;

@FindBy(how = How.CSS, using = "#li_res_area")
private WebElement ResArea;

// Office address

@FindBy(how = How.CSS, using = "#li_off_house_no")
private WebElement OfficeNo;

@FindBy(how = How.CSS, using = "#li_off_street")
private WebElement Officestreet;

@FindBy(how = How.CSS, using = "#li_off_area")
private WebElement OfficeArea;

@FindBy(how = How.CSS, using = "#generic_details_step1")
private WebElement genricCLick;

// ====================== Contact Details ===========//
@FindBy(how = How.CSS, using = "#li_office")
private WebElement Office;

@FindBy(how = How.CSS, using = "#landine_number")
private WebElement landlineNo;

@FindBy(how = How.CSS, using = "#bankwise_controls_submit")
private WebElement finalSubmit;

public CC_AMEX_Lender_Page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

// ========== Verify Basic Details Page Header ============ //
public void enterBasicdetailsToCheckLoanEligibility() throws Exception {

	driver.findElement(By.cssSelector(
			"#mainNav > div.container-fluid.md-pad10b.sm-pad0b > div.col-xs-12.col-sm-12.col-md-9.pad0 > div.collapse.navbar-collapse.navbar-ex1-collapse.pad10t.sm-pad0t.full-width > ul > li.dropdown > a"))
			.click();
	driver.findElement(By.cssSelector(
			"#mainNav > div.container-fluid.md-pad10b.sm-pad0b > div.col-xs-12.col-sm-12.col-md-9.pad0 > div.collapse.navbar-collapse.navbar-ex1-collapse.pad10t.sm-pad0t.full-width > ul > li.dropdown.open > ul > li:nth-child(3) > a"))
			.click();
	fname.sendKeys(Base.loadPropertiesFile("CC_Data.properties", "full_name"));
	// logger.log(LogStatus.INFO,"Enter first name : ");
	pincode.sendKeys(Base.loadPropertiesFile("CC_Data.properties", "pincode"));
	empType.click();
	Select employeeTyp = new Select(empType);
	employeeTyp.selectByIndex(1);

	companyname.sendKeys("I");
	Thread.sleep(8000);
	driver.findElement(By.cssSelector("#a_loc1")).click();
	salary.sendKeys(Base.loadPropertiesFile("CC_Data.properties", "salary"));
	email.sendKeys(Base.randomEmail());
	mobile.sendKeys(mobileno);

	WebElement card = driver.findElement(By.cssSelector("#card_type"));
	Select cardType = new Select(card);
	cardType.selectByIndex(1);

	clickNextBtn.click();

	Thread.sleep(4000);

	// ============== OTP Verify =================================//

	try {
		// OTP Verify

		String passwrd = Utilities.Otp_Call.request_otp(otpURL, mobileno);
		System.out.println("Mobile no is:" + mobileno);
		System.out.println("OTP Is:" + passwrd);

		/*
		 * String string=String.valueOf(passwrd); char[] ch=string.toCharArray();
		 * System.out.println(ch[;3]);
		 */

		driver.findElement(By.cssSelector("#txt_otp0")).sendKeys(passwrd);
		driver.findElement(By.xpath("//*[@id=\"mobile_verification\"]/div[1]/div/div/div[2]/label/span")).click();
		driver.findElement(By.cssSelector("#btn_verifyMobile")).click();

		Thread.sleep(2000);
		System.out.println("Sucessfully submitted OTP");
	} catch (Exception e) {

		System.out.println("Otp screen failure " + e.getMessage());
	}

}

public void check_Eligibility() throws Exception {

	WebDriverWait wait1 = new WebDriverWait(driver, 100);
	@SuppressWarnings("unused")
	WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#li_birthdate")));

	WebElement day = driver.findElement(By.cssSelector("#li_birthdate"));
	Select dropdown11 = new Select(day);
	dropdown11.selectByVisibleText("04");

	WebElement month = driver.findElement(By.cssSelector("#li_birthmonth"));
	Select mon = new Select(month);
	mon.selectByVisibleText("MAR - 03");

	WebElement year = driver.findElement(By.cssSelector("#li_birthyear"));
	Select yy = new Select(year);
	yy.selectByVisibleText("1986");

	gender.click();

	WebElement salry = driver.findElement(By.cssSelector("#li_salary_mode"));
	Select modeSal = new Select(salry);
	modeSal.selectByVisibleText("HDFC Bank");

	existingCard.click();
	Officepincode.sendKeys(Base.loadPropertiesFile("CC_Data.properties", "pincode"));
	PanNo.sendKeys(Base.randommPAN());
	Submit.click();

	WebDriverWait wait = new WebDriverWait(driver, 70);
	wait.until(ExpectedConditions.visibilityOf(PanKarza));

	PanKarza.click();

	Thread.sleep(2000);

}

public void general_Information() throws Exception {

	// Marital Status
	MaritalStatus.click();

	WebElement quali = driver.findElement(By.cssSelector("#employmentSelect"));
	Select education = new Select(quali);
	education.selectByIndex(3);

	JavascriptExecutor js11 = (JavascriptExecutor) driver;
	js11.executeScript("window.scrollBy(0,400)");

	// Present residential address//
	houseNo.sendKeys("10");
	street.sendKeys("Delhi");
	ResArea.sendKeys("Delhi");
	Thread.sleep(2000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,400)");

	// Office address
	OfficeNo.sendKeys("10");
	Officestreet.sendKeys("Delhi");
	OfficeArea.sendKeys("Delhi");

	genricCLick.click();

}

public void contact_Details() throws Exception {
	Thread.sleep(1000);
	Office.click();
	landlineNo.sendKeys("27123468");
	driver.findElement(By.cssSelector("#father-name")).click();
	driver.findElement(By.cssSelector("#fathers_name")).sendKeys("Father Name");
	finalSubmit.click();

}
}
