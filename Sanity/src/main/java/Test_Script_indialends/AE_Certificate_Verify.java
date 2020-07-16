package Test_Script_indialends;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.SendMail;

public class AE_Certificate_Verify {
	
	WebDriver driver;
	@Test
	public void verify_AE_certificate()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
			
	
			driver = new ChromeDriver();
			driver.navigate().to("https://staging.indialends.com/ae.aspx");
			
			driver.manage().window().maximize();
			
			String ele=driver.findElement(By.cssSelector("body")).getText();
						
			if(ele.isEmpty()) {
				
				System.out.println("Working as expected");
			}else {
				
				System.out.println("AE page showing SQL server error is : "+ele);
				String error="Satging ae.aspx page showing SQL error is : "+ele;
				SendMail.sendmail(error);
				
			}
	}

}
