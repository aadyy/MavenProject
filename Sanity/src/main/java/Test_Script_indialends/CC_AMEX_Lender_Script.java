package Test_Script_indialends;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Utilities.Base;

public class CC_AMEX_Lender_Script extends Base {
	
	@Test(priority=1)
	public void fillBasicDetailsPage() throws Exception 
	{
		
		System.out.println("Driver valueE inside fillBasicDetailsPage() method is "+ driver);
		Page_object_indialends.CC_AMEX_Lender_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.CC_AMEX_Lender_Page.class);
		detailsPage.enterBasicdetailsToCheckLoanEligibility();
				
	}
	
	@Test(priority=2 , enabled = true)
	public void verify_Eligibility() throws Exception {
		Page_object_indialends.CC_AMEX_Lender_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.CC_AMEX_Lender_Page.class);
		detailsPage.check_Eligibility();
		
	}
	
	@Test(priority=3)
	public void verify_General_Info() throws Exception {
		Page_object_indialends.CC_AMEX_Lender_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.CC_AMEX_Lender_Page.class);
		detailsPage.general_Information();
	}
	
	@Test(priority=4)
	public void verify_Contact_details() throws Exception {
		Page_object_indialends.CC_AMEX_Lender_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.CC_AMEX_Lender_Page.class);
		detailsPage.contact_Details();
		
	}

}
