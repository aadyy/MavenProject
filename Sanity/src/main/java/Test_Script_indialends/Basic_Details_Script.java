package Test_Script_indialends;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import Page_object_indialends.Basic_Details_Page;
import Utilities.Base;

public class Basic_Details_Script extends Base
{
	@Test(dataProvider = "create", dataProviderClass = Utilities.ExcelRead.class)
	public void fillBasicDetailsPage(String FullName, String EmailAddress, String Pincode, String Company, String Salary, String MobileNumber) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(FullName, EmailAddress, Pincode, Company, Salary, MobileNumber));
		System.out.println("Driver value inside fillBasicDetailsPage() method is "+ driver);
		Basic_Details_Page detailsPage = new Basic_Details_Page(driver);
		detailsPage.enterBasicdetailsToCheckLoanEligibility(list);
	}
}
