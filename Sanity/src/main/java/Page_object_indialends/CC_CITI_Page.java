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
import org.testng.Assert;
import Utilities.Base;

public class CC_CITI_Page extends Base {

	protected WebDriver driver;
	String Conversion = "803650867";
	String Conversion2 = "955414164";
	String gtag = "AW-955414164";
	String RemarketingTag1 = "803650867";
	String RemarketingTag2 = "803650924";
	String RemarketingTag3 = "955414164";
	String Google_Analytics = "UA-58036769-1";

	// =========================== Short Form Page Locators
	// =============================================================== //

	@FindBy(how = How.XPATH, using = "//li[@class='dropdown']")
	private WebElement clickCClink;

	// ============ click CC Generic link =====================

	@FindBy(how = How.XPATH, using = ("//*[@id=\"mainNav\"]/div[6]/div[1]/div[2]/ul/li[2]/ul/li[1]/a"))
	private WebElement clickCCGeneric;

	@FindBy(how = How.CSS, using = "#li_name")
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

	/*
	 * @FindBy(how=How.CSS, using="#a_loc1") private WebElement employment;
	 */

	// =========================== Basic Details Page Locators End
	// =============================================================== //

	// =========================== Otp Screen & I-lite Locators
	// =============================================================== //

	@FindBy(how = How.XPATH, using = "//*[@id=\"txt_otp\"]")
	private WebElement otptake;

	@FindBy(how = How.XPATH, using = "//*[@id=\"btn_mobile_verify\"]")
	private WebElement otpVerify;

	@FindBy(how = How.CSS, using = "#control-indicator")
	private WebElement terms;

	// ============================= Check Eligibility
	// =======================================//

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

	// #dv_karza_buttons > div.col-sm-5.col-xs-5.pad0.pad20t > span

	@FindBy(how = How.CSS, using = "#dv_karza_buttons > div.col-sm-5.col-xs-5.pad0.pad20t > span")
	// @FindBy(how=How.CSS, using="#dv_karza_buttons >
	// div.col-sm-6.text-center.pad10.pad15t > span")
	private WebElement PanKarza;

	// ============= General Information =========================================
	// //
	@FindBy(how = How.CSS, using = "#view_more_section > a")
	private WebElement ViewMore;

	@FindBy(how = How.CSS, using = "#btn_501")
	private WebElement ClickCard;

	@FindBy(how = How.CSS, using = "#married")
	private WebElement MaritalStatus;

	// @FindBy(how=How.CSS, using="#pg")
	// private WebElement Qualification;
	// //*[@id="employmentSelect"]

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

	// ====================== Contact Details
	// =====================================//
	@FindBy(how = How.CSS, using = "#li_office")
	private WebElement Office;

	@FindBy(how = How.CSS, using = "#landine_number")
	private WebElement landlineNo;

	@FindBy(how = How.CSS, using = "#fathers_name")
	private WebElement fatherName;

	@FindBy(how = How.CSS, using = "#mothers_name")
	private WebElement motherName;

	@FindBy(how = How.CSS, using = "#office_address")
	private WebElement officeAddress;

	@FindBy(how = How.CSS, using = "#li_aadhaar")
	private WebElement aadhaar;

	@FindBy(how = How.CSS, using = "#yes")
	private WebElement currentAddr;

	@FindBy(how = How.CSS, using = "#div_nationality > label:nth-child(2) > input[type=\"radio\"]")
	private WebElement nationality;

	@FindBy(how = How.CSS, using = "#yes_senior_officer")
	private WebElement seniorOff;

	@FindBy(how = How.CSS, using = "#director_name")
	private WebElement directorName;

	@FindBy(how = How.CSS, using = "#bankwise_controls_submit")
	private WebElement finalSubmit;

	public CC_CITI_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ========== Verify Basic Details Page Header
	// =================================//
	public void enterBasicdetailsToCheckLoanEligibility() {

		try {

			driver.findElement(By.cssSelector(
					"#mainNav > div.container-fluid.md-pad10b.sm-pad0b > div.col-xs-12.col-sm-12.col-md-9.pad0 > div.collapse.navbar-collapse.navbar-ex1-collapse.pad10t.sm-pad0t.full-width > ul > li.dropdown > a"))
					.click();
			driver.findElement(By.cssSelector(
					"#mainNav > div.container-fluid.md-pad10b.sm-pad0b > div.col-xs-12.col-sm-12.col-md-9.pad0 > div.collapse.navbar-collapse.navbar-ex1-collapse.pad10t.sm-pad0t.full-width > ul > li.dropdown.open > ul > li:nth-child(1) > a"))
					.click();

			driver.findElement(By.cssSelector("#btnnoscreen")).click();
			Thread.sleep(2000);

			mobile.sendKeys(mobileno);
			System.out.println("Mobile_No is:" + mobileno);
			driver.findElement(By.cssSelector("#btnSendOTP")).click();

			try {
				// OTP Verify

				String passwrd = Utilities.Otp_Call.request_otp(otpURL, mobileno);
				System.out.println("OTP Is:" + passwrd);

				driver.findElement(By.cssSelector("#txt_otp0")).sendKeys(passwrd);

				driver.findElement(By.xpath("//*[@id=\"mobile_verification\"]/div[1]/div/div/div[2]/label/span"))
						.click();
				driver.findElement(By.cssSelector("#mobile_verification > div > div > div > a")).click();

				Thread.sleep(3000);
				System.out.println("Sucessfully submitted OTP");
			} catch (Exception e) {

				System.out.println("Otp screen failure " + e.getMessage());
				// tearDown();
			}

			boolean TextPresentNoIndex = driver.getPageSource().contains("nofollow, noindex");
			Assert.assertFalse(TextPresentNoIndex, "NO index present in pagesource");

			boolean isTheTextPresent = driver.getPageSource().contains(gtag);
			Assert.assertTrue(isTheTextPresent, "gtag Pixel is Not fired " + gtag);

			boolean TextPresent = driver.getPageSource().contains(RemarketingTag1);
			Assert.assertTrue(TextPresent, "Remarketing Tag1 Pixel is Not fired " + RemarketingTag1);

			boolean TextPresent1 = driver.getPageSource().contains(RemarketingTag2);
			Assert.assertTrue(TextPresent1, "Remarketing Tag2 Pixel is Not fired " + RemarketingTag2);

			boolean TextPresent2 = driver.getPageSource().contains(RemarketingTag3);
			Assert.assertTrue(TextPresent2, "Remarketing Tag3 Pixel is Not fired " + RemarketingTag3);

			boolean TextPresent3 = driver.getPageSource().contains(Google_Analytics);
			Assert.assertTrue(TextPresent3, "Google_Analytics Pixel is Not fired " + Google_Analytics);

			fname.sendKeys(Base.loadPropertiesFile("CC_Data.properties", "full_name"));
			email.sendKeys(Base.loadPropertiesFile("CC_Data.properties", "email"));
			driver.findElement(By.cssSelector("#btnproceeduj")).click();

			pincode.sendKeys(Base.loadPropertiesFile("CC_Data.properties", "pincode"));
			empType.click();
			Select employeeTyp = new Select(empType);
			employeeTyp.selectByIndex(1);

			companyname.sendKeys(Base.loadPropertiesFile("CC_Data.properties", "company"));
			Thread.sleep(6000);
			driver.findElement(By.cssSelector("#a_loc1")).click();
			salary.sendKeys("30000");
			clickNextBtn.click();

			Thread.sleep(4000);

		} catch (Exception e1) {

			System.out.println("Failed on Baisc Detailed Page :" + e1.getMessage());
		}

	}

	public void check_Eligibility() throws Exception {

		try {
			boolean isTheTextPresent4 = driver.getPageSource().contains(Conversion);
			Assert.assertTrue(isTheTextPresent4, "Conversion Pixel is Not fired " + Conversion);

			boolean isTheTextPresent = driver.getPageSource().contains(gtag);
			Assert.assertTrue(isTheTextPresent, "gtag Pixel is Not fired " + gtag);

			boolean TextPresent = driver.getPageSource().contains(RemarketingTag1);
			Assert.assertTrue(TextPresent, "Remarketing Tag1 Pixel is Not fired " + RemarketingTag1);

			boolean TextPresent1 = driver.getPageSource().contains(RemarketingTag2);
			Assert.assertTrue(TextPresent1, "Remarketing Tag2 Pixel is Not fired " + RemarketingTag2);

			boolean TextPresent2 = driver.getPageSource().contains(RemarketingTag3);
			Assert.assertTrue(TextPresent2, "Remarketing Tag3 Pixel is Not fired " + RemarketingTag3);

			boolean TextPresent3 = driver.getPageSource().contains(Google_Analytics);
			Assert.assertTrue(TextPresent3, "Google_Analytics Pixel is Not fired " + Google_Analytics);
			System.out.println("Pixel is fired");
		} catch (Exception e) {

			System.out.println("Pixel is not fire :" + e.getMessage());
		}

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
		Officepincode.sendKeys("110040");
		PanNo.sendKeys(Base.randommPAN());
		Submit.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 70);
		wait.until(ExpectedConditions.visibilityOf(PanKarza));

		// Thread.sleep(12000);
		PanKarza.click();

		Thread.sleep(4000);

	}

	public void general_Information() throws Exception {

		/*
		 * ViewMore.click(); Thread.sleep(2000);
		 */

		ClickCard.click();

		// Marital Status
		MaritalStatus.click();
		Qualification.click();

		Select Qualificationtype = new Select(Qualification);
		Qualificationtype.selectByIndex(2);

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
		fatherName.sendKeys("Father Name");
		motherName.sendKeys("Mother Name");

		WebElement designation = driver.findElement(By.cssSelector("#li_designation"));
		Select dropdown10 = new Select(designation);
		dropdown10.selectByVisibleText("Engineer");

		officeAddress.click();
		aadhaar.sendKeys("523412348754");
		currentAddr.click();

		WebElement addProof = driver.findElement(By.cssSelector("#li_add_proof"));
		Select dropdown12 = new Select(addProof);
		dropdown12.selectByVisibleText("Passport");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");

		nationality.click();
		seniorOff.click();

		directorName.sendKeys("Test Direcctor");

		WebElement dirBank = driver.findElement(By.cssSelector("#li_dir_bank_name"));
		Select dropdown13 = new Select(dirBank);
		dropdown13.selectByVisibleText("Andhra Bank");

		WebElement dirRel = driver.findElement(By.cssSelector("#li_director_rel"));
		Select dropdown14 = new Select(dirRel);
		dropdown14.selectByVisibleText("Brother");

		finalSubmit.click();

		Thread.sleep(2000);

		boolean isTheTextPresent4 = driver.getPageSource().contains(Conversion);
		Assert.assertTrue(isTheTextPresent4, "Conversion Pixel is Not fired " + Conversion);

		boolean isTheTextPresent = driver.getPageSource().contains(gtag);
		Assert.assertTrue(isTheTextPresent, "gtag Pixel is Not fired " + gtag);

		boolean TextPresent = driver.getPageSource().contains(RemarketingTag1);
		Assert.assertTrue(TextPresent, "Remarketing Tag1 Pixel is Not fired " + RemarketingTag1);

		boolean TextPresent1 = driver.getPageSource().contains(RemarketingTag2);
		Assert.assertTrue(TextPresent1, "Remarketing Tag2 Pixel is Not fired " + RemarketingTag2);

		boolean TextPresent2 = driver.getPageSource().contains(RemarketingTag3);
		Assert.assertTrue(TextPresent2, "Remarketing Tag3 Pixel is Not fired " + RemarketingTag3);

		boolean TextPresent3 = driver.getPageSource().contains(Google_Analytics);
		Assert.assertTrue(TextPresent3, "Google_Analytics Pixel is Not fired " + Google_Analytics);
		System.out.println("Contact details form submitted successfully");

	}
}
