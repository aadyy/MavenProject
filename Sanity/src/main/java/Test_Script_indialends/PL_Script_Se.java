package Test_Script_indialends;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Utilities.Base;

public class PL_Script_Se extends Base
{
	@Test(priority=1,enabled=true)
	public void verifyBasicDetails() throws Exception {
		
		System.out.println("Driver valueE inside fillBasicDetailsPage() method is " + driver);
		Page_object_indialends.PL_Page_SE detailsPage = PageFactory.initElements(driver, Page_object_indialends.PL_Page_SE.class);
		detailsPage.enterBasicdetailsToCheckLoanEligibility();
	}
	@Test(priority=2,enabled=true)
	public void verifyAdditionalDetails() {
		Page_object_indialends.PL_Page_SE detailsPage = PageFactory.initElements(driver, Page_object_indialends.PL_Page_SE.class);
		detailsPage.enterAdditionaldetailsToCheckLoanEligibility();
	}
	@Test(priority=3,enabled=true)
	public void verifyGeneralDetails() throws Exception {
		Page_object_indialends.PL_Page_SE detailsPage = PageFactory.initElements(driver, Page_object_indialends.PL_Page_SE.class);
		detailsPage.enterGeneralInformation();
	}
	@Test(priority=4,enabled=true)
	public void verifyOfficeDetails() throws Exception {
		Page_object_indialends.PL_Page_SE detailsPage = PageFactory.initElements(driver, Page_object_indialends.PL_Page_SE.class);
		detailsPage.enterOfficeInformation();
	}

}
