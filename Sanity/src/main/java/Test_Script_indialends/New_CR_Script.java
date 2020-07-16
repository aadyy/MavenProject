package Test_Script_indialends;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Utilities.Base;

public class New_CR_Script extends Base{
	
	@Test()
	public void VerifyCRBasicDetails() 
	{
			System.out.println("Driver value inside fillBasicDetailsPage() method is "+ driver);
			Page_object_indialends.New_CR_Page detailsPage = PageFactory.initElements(driver, Page_object_indialends.New_CR_Page.class);
			detailsPage.enterCRdetails();
		
	}

}
