package Pixel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Verify_Pixel {
	WebDriver driver;
	
	//String Tag="AW-955414164";
	String Tag="6133998821374731";
	String gtag="AW-955414164";
	String RemarketingTag1="803650867";
	String RemarketingTag2="803650924";
	String RemarketingTag3="955414164";
	String Google_Analytics="UA-58036769-1";
	
	String mobileno="6230410002";
	//String otpURL="http://v.indialends.com/test/get_otp_user_registration_encrypt.ashx?type=json&mobileno=";
	String otpURL="http://v.indialends.com/test/get_otp.ashx?type=json&mobileno=";

	String salary="65000";
	String pincode="110020";
	String company="IBM";
	
	String loanamount="100000";
	String DOB_year="1988";
	
	String Salry_type="#div_payment_mode > div:nth-child(1) > label > span > span"; //BT
	//String Salry_type="#div_payment_mode > div:nth-child(2) > label > span";  //By Cash
	//String Salry_type="#div_payment_mode > div:nth-child(3) > label > span"; //By cheque
	String Pan_NO="AAAPA1234A";
	
	//String exp_year="#scroll_off_year > div:nth-child(3) > div > div.select-items > div:nth-child(1)";    //0 Year
	String exp_year="#scroll_off_year > div:nth-child(3) > div > div.select-items > div:nth-child(1)";    // 01 year
	
	String exp_month="#lbl_currentExpmMonths > div.select-items > div:nth-child(7)"; //06 month
	//String exp_month="#lbl_currentExpmMonths > div.select-items > div:nth-child(1)"; //00 month
	
	String total_exp_yr="#lbl_totalExpYrs > div.select-items > div:nth-child(1)"; //0 Year
	//String total_exp_yr="#lbl_totalExpYrs > div.select-items > div:nth-child(2)"; //1 year
	
	//String total_exp_mn="#lbl_totalExpMonths > div.select-items > div:nth-child(1)"; //00 month
	String total_exp_mn="#lbl_totalExpMonths > div.select-items > div:nth-child(7)"; //06 month
	
	public void verify() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ilproduction.indialends.com/personal-loan");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#li_display_name")).sendKeys("Test test");	
		driver.findElement(By.cssSelector("#email")).sendKeys("testuser@gmail.com");
		driver.findElement(By.cssSelector("#pincode")).sendKeys(pincode);
		driver.findElement(By.cssSelector("#employment")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#salaried12")).click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,400)");
		 
		driver.findElement(By.cssSelector("#companyName")).sendKeys(company);
		
		Thread.sleep(3000);
		
		WebElement textbox = driver.findElement(By.cssSelector("#companyName"));
		textbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#monthlyIncome")).sendKeys(salary);
		driver.findElement(By.cssSelector("#mobile")).sendKeys(mobileno);
		System.out.println(mobileno);
		driver.findElement(By.cssSelector("#li_submit")).click();
		
		Thread.sleep(4000);
		
	}
	@Test(priority=1)
	public void verify_OTP() throws Exception {
		
		//OTP Verify
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"txt_otp\"]"))));
		
		String passwrd = Utilities.Otp_Call.request_otp(otpURL, mobileno);
		System.out.println("OTP Is:"+passwrd);
	    driver.findElement(By.xpath("//*[@id=\"txt_otp\"]")).sendKeys(passwrd);
	    driver.findElement(By.cssSelector("#control-indicator")).click();
		driver.findElement(By.xpath("//*[@id=\"btn_mobile_verify\"]")).click();
		
		Thread.sleep(7000);
		System.out.println("Sucessfully submitted OTP");
		
		 
		 boolean isTheTextPresent = driver.getPageSource().contains(gtag);
		 Assert.assertTrue(isTheTextPresent, "gtag Pixel is Not fired "+gtag);
		 
		 boolean TextPresent = driver.getPageSource().contains(RemarketingTag1);
		 Assert.assertTrue(TextPresent, "Remarketing Tag1 Pixel is Not fired "+RemarketingTag1);
		
		 boolean TextPresent1 = driver.getPageSource().contains(RemarketingTag2);
		 Assert.assertTrue(TextPresent1, "Remarketing Tag2 Pixel is Not fired "+RemarketingTag2);
		 
		 boolean TextPresent2 = driver.getPageSource().contains(RemarketingTag3);
		 Assert.assertTrue(TextPresent2, "Remarketing Tag3 Pixel is Not fired "+RemarketingTag3);
		 
		 boolean TextPresent3 = driver.getPageSource().contains(Google_Analytics);
		 Assert.assertTrue(TextPresent3, "Google_Analytics Pixel is Not fired "+Google_Analytics);
		 
			List<WebElement> scriptList = driver.findElements(By.tagName("script"));
			boolean scriptFound = false;
			for (WebElement item : scriptList) {
				scriptFound = item.getAttribute("src").contains(gtag);
				if (scriptFound)
					break;

			}
			try {
				if (scriptFound) {
					System.out.println("Pixel is fire."+gtag);

				} else {
					System.out.println("Pixel is not fire."+gtag);
					 throw new Exception ("Pixel is not coming in I-lite screen.");

				}
			} catch (Exception e) {
				
				System.out.println("Pixel exception is: "+e.getMessage());
			}
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 js1.executeScript("window.scrollBy(0,400)");
			
		driver.findElement(By.cssSelector("#btn_call_now_continue")).click();

	try {
		driver.findElement(By.cssSelector("#loanAmt")).sendKeys("100000");
		driver.findElement(By.cssSelector("#div_gender > label > span")).click();

		// DOB Fileds
		driver.findElement(By.cssSelector(
				"#frm > div > div > div:nth-child(2) > div.col-xs-4.pad0l > div > div.select-selected")).click();
		driver.findElement(By.cssSelector(
				"#frm > div > div > div:nth-child(2) > div.col-xs-4.pad0l > div > div.select-items > div:nth-child(3)"))
				.click();

		driver.findElement(By
				.cssSelector("#frm > div > div > div:nth-child(2) > div.col-xs-4.pad0 > div > div.select-selected"))
				.click();
		driver.findElement(By.cssSelector(
				"#frm > div > div > div:nth-child(2) > div.col-xs-4.pad0 > div > div.select-items > div:nth-child(3)"))
				.click();

		WebElement DOBYr = driver.findElement(By.xpath("//*[@id=\"dobYear\"]"));
		Select dropdown = new Select(DOBYr);
		dropdown.selectByVisibleText("1988");
		// Thread.sleep(4000);

		driver.findElement(By.cssSelector("#panNo")).sendKeys("ABCPD1234E");
		driver.findElement(By.cssSelector("#div_payment_mode > div:nth-child(1) > label > span")).click();
		driver.findElement(By.cssSelector("#bankName")).sendKeys("HDFC");
		driver.findElement(By.cssSelector("#address")).sendKeys("Delhi");
		driver.findElement(By.cssSelector("#locality")).sendKeys("Delhi");
		// Thread.sleep(4000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,400)");

		
		driver.findElement(By.cssSelector("#btn_continue")).click();
		Thread.sleep(4000);

		//driver.findElement(By.cssSelector("#btn_update_continue")).click();

		System.out.println("Additional details form submited");

		Thread.sleep(5000);
		// Select Offer
		driver.findElement(By.cssSelector("body > div.col-md-6.col-sm-8.xs-pad0.xs-pad30b > div > div > div:nth-child(4) > div > label > span > div > div > div > div.wrapping > div.col-lg-12.col-md-12.col-sm-12.pad0r.sm-pad0l > div.wrapping.text-l-sm.sm-marg10l.border-right-none-sm")).click();
		driver.findElement(By.cssSelector("#div_offer_selected")).click();
		

		System.out.println("Offer screen submitted");
		Thread.sleep(2000);

	} catch (Exception e) {
		// SendMail.sendmail(e.getMessage());
		System.out.println("Additional details page failure " + e.getMessage());
		driver.close();
		
		
	}
		
	}}


