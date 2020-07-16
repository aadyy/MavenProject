package Dashboard;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Verify_CR_Dashboard {
	
	WebDriver driver;
	protected String otpURL="http://v.indialends.com/test/get_otp_user_registration_encrypt.ashx?type=json&mobileno=";
	String mobileno="5555583939";
	@Test
	public void login_CR() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://indialends.com/login.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#txt_mobile_num")).sendKeys(mobileno);
		driver.findElement(By.cssSelector("#btn_otp")).click();
		Thread.sleep(3000);
		String passwrd = Utilities.Otp_Call.request_otp(otpURL, mobileno);
		System.out.println("OTP Is:" + passwrd);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#txt_otp")).sendKeys(passwrd);
		driver.findElement(By.cssSelector("#btn_verify")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-wrapper > div > div.col-md-12.top-page-header.pad0l.pad0r.sm-marg30t > div.col-lg-5.col-md-5.pad0l > h1")));
		
		String myoffer=driver.findElement(By.cssSelector("#page-wrapper > div > div.col-md-12.top-page-header.pad0l.pad0r.sm-marg30t > div.col-lg-5.col-md-5.pad0l > h1")).getText();
		
		if(myoffer.contains("My Offers"))
		{
			System.out.println("Login successfully");
		}else {
			System.out.println("Login failed");
		}
		
		driver.findElement(By.cssSelector("#wrapper > div.sidebar-navbar > nav > div > ul > li:nth-child(1) > a")).click();
		
	    Thread.sleep(2000);
		String dashboardClick=driver.findElement(By.cssSelector("#form1 > div.container-fluid.xs-pad0l.xs-pad0r > div.col-md-12.top-page-header.pad0l.pad0r.xs-marg30t > div.col-lg-5.col-md-5.pad0l.hidden-xs > h1")).getText();
		
		if(dashboardClick.contains("Dashboard")) {
			
			System.out.println("Dashboard click is working fine.");
		}else {
			System.out.println("Dashboard click is not working");
		}
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#wrapper > div.sidebar-navbar > nav > div > ul > li:nth-child(5) > a")).click();
		 Thread.sleep(2000);
		String trackMyApplicationClick=driver.findElement(By.cssSelector("#page-wrapper > div.container-fluid.xs-pad0l.xs-pad0r > div.col-md-12.top-page-header.pad0l.pad0r.sm-marg30t > div.col-lg-5.col-md-5.pad0l.hidden-xs > h1")).getText();
		
		if(trackMyApplicationClick.contains("Track My Applications")) {
			
			System.out.println("Track My Applications Click is working fine");
		}else {
			System.out.println("Track My Applications Click is not working fine");
		}
		
		driver.findElement(By.cssSelector("#wrapper > div.sidebar-navbar > nav > div > ul > li:nth-child(6) > a")).click();
		Thread.sleep(2000);
		
		String MyDocText=driver.findElement(By.cssSelector("#page-wrapper > div > div.col-md-12.top-page-header.pad0l.pad0r > div.col-lg-5.col-md-5.pad0l.hidden-xs > h1")).getText();
		
		if(MyDocText.contains("Upload KYC Documents")) {
			
			System.out.println("My Documents click is working fine.");
		} else {
			
			System.out.println("My Documents click is not working fine.");
		}
		//driver.quit();
		
		driver.findElement(By.cssSelector("#wrapper > div.sidebar-navbar > nav > div > ul > li:nth-child(7) > a")).click();
		Thread.sleep(2000);
		
		String myProfileText=driver.findElement(By.cssSelector("#page-wrapper > div.custom-container-fluid.pad10 > div.col-md-12.top-page-header.pad0l.pad0r > div.col-lg-5.col-md-5.pad0l.hidden-sm.hidden-xs > h1")).getText();
		
		if(myProfileText.contains("My Profile")) {
			
			System.out.println("My Profile click is working fine.");
		}else {
			System.out.println("My profile click is not working fine");
		}
		
		String nameMatch=driver.findElement(By.cssSelector("#page-wrapper > div.custom-container-fluid.pad10 > div.row > div > div > div.panel-body > div > div:nth-child(1) > div.float-l.float-none-xs.pad20l.xs-pad0.text-c-xs > h1")).getText();
		
		if(nameMatch.contains("Sanjeev")) {
			
			System.out.println("Name is matching with corect one.");
			
		}else {
			
			System.out.println("Name is not matching with corect one.");
		}
		
		driver.findElement(By.cssSelector("#tab-menu > ul > li:nth-child(2) > a")).click();
		
		String empText=driver.findElement(By.cssSelector("#professional_block > div > div:nth-child(1) > div > label")).getText();
		
		if(empText.contains("Employment")) {
			
			System.out.println("Professional information click is working fine.");
		}else {
			
			System.out.println("Professional information click is not working fine.");
		}
		
		driver.findElement(By.cssSelector("#wrapper > div.sidebar-navbar > nav > div > ul > li:nth-child(2) > a")).click();
		Thread.sleep(2000);
		
		String score=driver.findElement(By.cssSelector("#main > div.col-xs-12.col-sm-12.col-md-12.bg-grey.pad0 > div.col-xs-12.marg20t.sm-marg0t.sm-pad0 > div.col-xs-12.pad0l.col-md-5.sm-marg15b.sm-pad0r.md-pad0r.hide-mobile > div > div.col-xs-12.pad0.clearfix > div.col-xs-9.pad0 > div.pull-right > p")).getText();
		
		int scoredata=Integer.parseInt(score);
		System.out.println("Score is : "+scoredata);
		if(scoredata > 700) {
			
			System.out.println("Score is coming.");
		}else {
			
			 System.out.println("Score is not Coming");
		}
		
		String name=driver.findElement(By.cssSelector("#main > div.col-xs-12.col-sm-12.col-md-12.bg-grey.pad0 > div.col-xs-12.marg20t.sm-marg0t.sm-pad0 > div.col-xs-12.pad0l.col-md-5.sm-marg15b.sm-pad0r.md-pad0r.hide-mobile > div > div.col-xs-12.pad0.clearfix > div.col-xs-9.pad0 > div.pull-left > p.marg0")).getText();
		
		if(name.contains("Hi Sanjeev"))
		{
			System.out.println("Name is coming and match.");
		}else {
			System.out.println("Name is not coming.");
		}
		
		String yrAccount=driver.findElement(By.cssSelector("#dvAccountWeb > div > div.pull-left > p.clearfix.marg0b.dashboard-heading")).getText();
		
		if(yrAccount.contains("Your Accounts "))
		{
			System.out.println("Your accounts section is coming");
		}else {
			System.out.println("Your accounts section is not coming");
		}
		   
		Thread.sleep(2000);
		//Click Personal loan in Your account section
		driver.findElement(By.cssSelector("#dvAccountWeb > div > div.your-accounts-details.col-xs-12.pad0.pad15t.pad0b.xs-pad0r.clearfix > ul > li:nth-child(1) > a > p > img")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		@SuppressWarnings("unused")
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#main > div > div.accounts-tab > ul > li.active > a")));
		
		String PL=driver.findElement(By.cssSelector("#main > div > div.accounts-tab > ul > li.active > a")).getText();
		System.out.println(PL);
		String expected="Active Accounts";
		if(PL.contains(expected)) {
			System.out.println("Successfully click on Personal Loan");
		}else {
			System.out.println("Persoanl loan click is not working.");
		}
		
		driver.findElement(By.cssSelector("#main > div > div.accounts-tab > ul > li:nth-child(2) > a")).click();
		Thread.sleep(1000);		
		driver.findElement(By.cssSelector("#InActiveAccounts > div")).click();
		Thread.sleep(3000);
		
	     driver.findElement(By.cssSelector("#dvPaymentDetails > div.col-xs-12.pad0.hide-mobile > div > div.col-xs-6.credit-dashboard.pad20t.hide-mobile > span")).click();
		 Thread.sleep(3000);
		// driver.findElement(By.cssSelector("#main > div > div.col-xs-12.pad20t.bg-white.account-section > div.col-xs-8.pad0l > p")).click();
		 
		 driver.findElement(By.cssSelector("#main > div > div.col-xs-12.pad20t.bg-white.account-section > div.col-xs-8.pad0l > p > a")).click();
		/*String CreditHistory=driver.findElement(By.cssSelector("#dvCreditHistoryWeb > div > div.pull-left > p.display-inline.dashboard-heading")).getText();
		
		System.out.println("CreditHistory text is:"+CreditHistory);
		if(CreditHistory.contains("Credit History")) {
			
			System.out.println("Credit history section is coming");
		}else {
			System.out.println("Credit history section is not coming.");
		}
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		String payHistory=driver.findElement(By.cssSelector("#dvWebPayment > a > div > div > div.pull-left > p")).getText();
		
		if(payHistory.contains("Overall Payment History"))
		{
			System.out.println("Overall Payment History section is coming");
		} else {
			System.out.println("Overall Payment History section is not coming");
		}
		
		String ageAc=driver.findElement(By.cssSelector("#main > div.col-xs-12.col-sm-12.col-md-12.bg-grey.pad0 > div.col-xs-12.marg15b.credit-utilization > div.col-xs-12.col-md-4.pad0r.pad10l.pull-right.sm-pad0l.xs-marg15t > a > div > div.pull-left > p.marg0.dashboard-heading")).getText();
		
		if(ageAc.contains("Age of accounts")) {
			System.out.println("Age of accounts is coming");
		}else {
			System.out.println("Age of accounts is not coming.");
		}
		
		String CreditInquiry=driver.findElement(By.cssSelector("#main > div.col-xs-12.col-sm-12.col-md-12.bg-grey.pad0 > div.col-xs-12.marg15b.credit-utilization > div.col-xs-12.col-md-3.pad5r.pad0l.sm-marg15t.marg0t.sm-pad0r > a > div > div.pull-left > p.marg0.dashboard-heading")).getText();
	    
		if(CreditInquiry.contains("Credit Inquiry")) {
			
			System.out.println("Credit Inquiry section is coming");
		}else {
			System.out.println("Credit Inquiry section is not coming.");
		}*/
		
		
		/*driver.findElement(By.cssSelector("#accordion > div > ul > li:nth-child(1) > a > span")).click();
		Thread.sleep(2000);
		
		WebElement clickCreditScore=driver.findElement(By.cssSelector("#wrapper > div.sidebar-navbar > nav > div > ul > li:nth-child(2) > a"));
		clickCreditScore.click();
		Thread.sleep(2000);
		
		WebElement clickOffer=driver.findElement(By.cssSelector("#accordion > div > ul > li:nth-child(4) > a"));
		clickOffer.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/nav/div/ul/li[2]/a")).click();
		Thread.sleep(2000);*/
           
		
	}

}
