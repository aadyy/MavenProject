package Test_Script_indialends;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utilities.Base;

public class CC_CITI_Script extends Base {
	
	@Test(priority=1)
	public void fillBasicDetailsPage() throws Exception 
	{
		
		System.out.println("Driver valueE inside fillBasicDetailsPage() method is "+ driver);
		Page_object_indialends.CC_CITI_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.CC_CITI_Page.class);
		detailsPage.enterBasicdetailsToCheckLoanEligibility();
				
	}
	
	@Test(priority=2)
	public void CC_Eligibility_check() throws Exception {
		Page_object_indialends.CC_CITI_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.CC_CITI_Page.class);
		detailsPage.check_Eligibility();
	}
	@Test(priority=3)
	public void CC_general_information() throws Exception {
		Page_object_indialends.CC_CITI_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.CC_CITI_Page.class);
		detailsPage.general_Information();
	}
	
	@Test(priority=4)
	public void CC_contact_Details() throws Exception {
		Page_object_indialends.CC_CITI_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.CC_CITI_Page.class);
		detailsPage.contact_Details();
	}

}
