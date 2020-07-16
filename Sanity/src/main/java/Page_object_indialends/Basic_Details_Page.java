package Page_object_indialends;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Base;

public class Basic_Details_Page extends Base{
	
	protected WebDriver driver;
	
	@FindBy(how=How.CSS, using="#mainNav > div.container-fluid.md-pad10b.sm-pad0b > div.col-xs-12.col-sm-12.col-md-9.pad0 > div.collapse.navbar-collapse.navbar-ex1-collapse.pad10t.sm-pad0t.full-width > ul > li:nth-child(1) > a")
	private WebElement clickPl;
	
	@FindBy(how=How.CSS, using="#li_display_name")
	private WebElement FullName;
	
	/*@FindBy(how=How.CSS, using="#div_frmc>div>div>div:nth-child(4)>h1")
	private WebElement header;*/
	
	@FindBy(how=How.CSS, using="#email")
	private WebElement email;
	
	@FindBy(how=How.CSS, using="#pincode")
	private WebElement pincode;
	
	@FindBy(how=How.CSS, using="#companyName")
	private WebElement companyname;
	
	@FindBy(how=How.CSS, using="#monthlyIncome")
	private WebElement salary;
	
	@FindBy(how=How.CSS, using="#mobile")
	private WebElement mobile;
	
	@FindBy(how=How.CSS, using="#li_submit")
	private WebElement clickNextBtn;

	public Basic_Details_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterBasicdetailsToCheckLoanEligibility(ArrayList<String> list) 
	{
		// Verify Basic Details Page Header
	/*	WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(header));
		String headerText = header.getText();
		Assert.assertEquals(headerText, "Check Loan Eligibility by providing your basic details");*/
		try {
			clickPl.click();
			FullName.sendKeys("Test User");
			email.sendKeys(list.get(1));
			pincode.sendKeys(list.get(2));
			companyname.sendKeys(list.get(3));
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#companyName"))));
			
			WebElement textbox = driver.findElement(By.cssSelector("#companyName"));
			textbox.sendKeys(Keys.ENTER);
			
			Thread.sleep(8000);
			salary.sendKeys(list.get(4));
			mobile.sendKeys(list.get(5));
			clickNextBtn.click();
			driver.get("https://indialends.com/personal-loan");
		} catch (Exception e) {
			System.out.println("Failed on Baisc Detailed Page :"+e.getMessage());
		}
	  //  wait.until(ExpectedConditions.visibilityOf(header));
	}



}
