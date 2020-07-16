package Pixel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Verify_Meta_Tag {

	WebDriver driver;
   // String Tag="AW-955414164";
	String Tag="613399882137473";
   // String Tag="AW-803650924";
   // String Tag="AW-803650867";
	public void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://ilproduction.indialends.com/");
		driver.manage().window().maximize();
		// String data=driver.getPageSource();
		// System.out.println("Page source is:"+data);
		String URL = driver.getCurrentUrl();
		System.out.println("URL is:" + URL);

		List<WebElement> scriptList = driver.findElements(By.tagName("script"));
		boolean scriptFound = false;
		for (WebElement item : scriptList) {
			scriptFound = item.getAttribute("src").contains(Tag);
			if (scriptFound)
				break;

		}
		if (scriptFound) {
			System.out.println("PASS");
			System.out.println("Pixel is fire:"+Tag);

		} else {
			System.out.println("FAIL");
			System.out.println("Pixel is not fire: "+Tag);

		}
		
	     driver.navigate().to("https://indialends.com/free-credit-report"); String
	     URL2=driver.getCurrentUrl(); System.out.println("URL2:"+URL2);
		 List<WebElement> scriptList2 = driver.findElements(By.tagName("script"));
		 boolean scriptFound2 = false; 
		 for(WebElement item2 : scriptList2){
		 scriptFound2 = item2.getAttribute("src").contains(Tag);
			if (scriptFound2)
				break;

		}
		if (scriptFound2) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");

		}
		
	    driver.navigate().to("https://indialends.com/personal-loan");
	    String URL3=driver.getCurrentUrl(); 
	    System.out.println("URL3:"+URL3);
		 List<WebElement> scriptList3 = driver.findElements(By.tagName("script"));
		 boolean scriptFound3 = false; 
		 for(WebElement item3 : scriptList3){
		 scriptFound3 = item3.getAttribute("src").contains(Tag);
			if (scriptFound3)
				break;

		}
		if (scriptFound3) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");

		}
		
		    driver.navigate().to("https://indialends.com/credit-card");
		    String URL4=driver.getCurrentUrl(); 
		    System.out.println("URL4:"+URL4);
			 List<WebElement> scriptList4 = driver.findElements(By.tagName("script"));
			 boolean scriptFound4 = false; 
			 for(WebElement item4 : scriptList4){
			 scriptFound4 = item4.getAttribute("src").contains(Tag);
				if (scriptFound4)
					break;

			}
			if (scriptFound4) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/sbi-credit-card");
		    String URL5=driver.getCurrentUrl(); 
		    System.out.println("URL5:"+URL5);
			 List<WebElement> scriptList5 = driver.findElements(By.tagName("script"));
			 boolean scriptFound5 = false; 
			 for(WebElement item5 : scriptList5){
			 scriptFound5 = item5.getAttribute("src").contains(Tag);
				if (scriptFound5)
					break;

			}
			if (scriptFound5) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
		 
            
		    driver.navigate().to("https://indialends.com/amex-credit-card");
		    String URL6=driver.getCurrentUrl(); 
		    System.out.println("URL6:"+URL6);
			 List<WebElement> scriptList6 = driver.findElements(By.tagName("script"));
			 boolean scriptFound6 = false; 
			 for(WebElement item6 : scriptList6){
			 scriptFound6 = item6.getAttribute("src").contains(Tag);
				if (scriptFound6)
					break;

			}
			if (scriptFound6) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/citi-bank-credit-card");
		    String URL7=driver.getCurrentUrl(); 
		    System.out.println("URL7:"+URL7);
			 List<WebElement> scriptList7 = driver.findElements(By.tagName("script"));
			 boolean scriptFound7 = false; 
			 for(WebElement item7 : scriptList7){
			 scriptFound7 = item7.getAttribute("src").contains(Tag);
				if (scriptFound7)
					break;

			}
			if (scriptFound7) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/icici-bank-credit-card");
		    String URL8=driver.getCurrentUrl(); 
		    System.out.println("URL8:"+URL8);
			 List<WebElement> scriptList8 = driver.findElements(By.tagName("script"));
			 boolean scriptFound8 = false; 
			 for(WebElement item8 : scriptList8){
			 scriptFound8 = item8.getAttribute("src").contains(Tag);
				if (scriptFound8)
					break;

			}
			if (scriptFound8) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/hdfc-bank-credit-card");
		    String URL9=driver.getCurrentUrl(); 
		    System.out.println("URL9:"+URL9);
			 List<WebElement> scriptList9 = driver.findElements(By.tagName("script"));
			 boolean scriptFound9 = false; 
			 for(WebElement item9 : scriptList9){
			 scriptFound9 = item9.getAttribute("src").contains(Tag);
				if (scriptFound9)
					break;

			}
			if (scriptFound9) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/personal-loan-delhi");
		    String URL10=driver.getCurrentUrl(); 
		    System.out.println("URL10:"+URL10);
			 List<WebElement> scriptList10 = driver.findElements(By.tagName("script"));
			 boolean scriptFound10 = false; 
			 for(WebElement item10 : scriptList10){
			 scriptFound10 = item10.getAttribute("src").contains(Tag);
				if (scriptFound10)
					break;

			}
			if (scriptFound10) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/bajaj-personal-loan");
		    String URL11=driver.getCurrentUrl(); 
		    System.out.println("URL11:"+URL11);
			 List<WebElement> scriptList11 = driver.findElements(By.tagName("script"));
			 boolean scriptFound11 = false; 
			 for(WebElement item11 : scriptList11){
			 scriptFound11 = item11.getAttribute("src").contains(Tag);
				if (scriptFound11)
					break;

			}
			if (scriptFound11) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/personal-loan-emi-calculator");
		    String URL12=driver.getCurrentUrl(); 
		    System.out.println("URL12:"+URL12);
			 List<WebElement> scriptList12 = driver.findElements(By.tagName("script"));
			 boolean scriptFound12 = false; 
			 for(WebElement item12 : scriptList12){
			 scriptFound12 = item12.getAttribute("src").contains(Tag);
				if (scriptFound12)
					break;

			}
			if (scriptFound12) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/about-us");
		    String URL13=driver.getCurrentUrl(); 
		    System.out.println("URL13:"+URL13);
			 List<WebElement> scriptList13 = driver.findElements(By.tagName("script"));
			 boolean scriptFound13 = false; 
			 for(WebElement item13 : scriptList13){
			 scriptFound13 = item13.getAttribute("src").contains(Tag);
				if (scriptFound13)
					break;

			}
			if (scriptFound13) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/contact-us");
		    String URL14=driver.getCurrentUrl(); 
		    System.out.println("URL14:"+URL14);
			 List<WebElement> scriptList14 = driver.findElements(By.tagName("script"));
			 boolean scriptFound14 = false; 
			 for(WebElement item14 : scriptList14){
			 scriptFound14 = item14.getAttribute("src").contains(Tag);
				if (scriptFound14)
					break;

			}
			if (scriptFound14) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/faqs");
		    String URL15=driver.getCurrentUrl(); 
		    System.out.println("URL15:"+URL15);
			 List<WebElement> scriptList15 = driver.findElements(By.tagName("script"));
			 boolean scriptFound15 = false; 
			 for(WebElement item15 : scriptList15){
			 scriptFound15 = item15.getAttribute("src").contains(Tag);
				if (scriptFound15)
					break;

			}
			if (scriptFound15) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/privacy-policy");
		    String URL16=driver.getCurrentUrl(); 
		    System.out.println("URL16:"+URL16);
			 List<WebElement> scriptList16 = driver.findElements(By.tagName("script"));
			 boolean scriptFound16 = false; 
			 for(WebElement item16 : scriptList16){
			 scriptFound16 = item16.getAttribute("src").contains(Tag);
				if (scriptFound16)
					break;

			}
			if (scriptFound16) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/terms-conditions");
		    String URL17=driver.getCurrentUrl(); 
		    System.out.println("URL17:"+URL17);
			 List<WebElement> scriptList17 = driver.findElements(By.tagName("script"));
			 boolean scriptFound17 = false; 
			 for(WebElement item17 : scriptList17){
			 scriptFound17 = item17.getAttribute("src").contains(Tag);
				if (scriptFound17)
					break;

			}
			if (scriptFound17) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
		    driver.navigate().to("https://indialends.com/unsubscribe.aspx");
		    String URL18=driver.getCurrentUrl(); 
		    System.out.println("URL18:"+URL18);
			 List<WebElement> scriptList18 = driver.findElements(By.tagName("script"));
			 boolean scriptFound18 = false; 
			 for(WebElement item18 : scriptList18){
			 scriptFound18 = item18.getAttribute("src").contains(Tag);
				if (scriptFound18)
					break;

			}
			if (scriptFound18) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/login.aspx");
		    String URL19=driver.getCurrentUrl(); 
		    System.out.println("URL19:"+URL19);
			 List<WebElement> scriptList19 = driver.findElements(By.tagName("script"));
			 boolean scriptFound19 = false; 
			 for(WebElement item19 : scriptList19){
			 scriptFound19 = item19.getAttribute("src").contains(Tag);
				if (scriptFound19)
					break;

			}
			if (scriptFound19) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-kolkata");
		    String URL20=driver.getCurrentUrl(); 
		    System.out.println("URL20:"+URL20);
			 List<WebElement> scriptList20 = driver.findElements(By.tagName("script"));
			 boolean scriptFound20 = false; 
			 for(WebElement item20 : scriptList20){
			 scriptFound20 = item20.getAttribute("src").contains(Tag);
				if (scriptFound20)
					break;

			}
			if (scriptFound20) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-hyderabad");
		    String URL21=driver.getCurrentUrl(); 
		    System.out.println("URL21:"+URL21);
			 List<WebElement> scriptList21 = driver.findElements(By.tagName("script"));
			 boolean scriptFound21 = false; 
			 for(WebElement item21 : scriptList21){
			 scriptFound21 = item21.getAttribute("src").contains(Tag);
				if (scriptFound21)
					break;

			}
			if (scriptFound21) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			driver.navigate().to("https://indialends.com/personal-loan-chennai ");
		    String URL22=driver.getCurrentUrl(); 
		    System.out.println("URL22:"+URL22);
			 List<WebElement> scriptList22 = driver.findElements(By.tagName("script"));
			 boolean scriptFound22 = false; 
			 for(WebElement item22 : scriptList22){
			 scriptFound22 = item22.getAttribute("src").contains(Tag);
				if (scriptFound22)
					break;

			}
			if (scriptFound22) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-mumbai");
		    String URL23=driver.getCurrentUrl(); 
		    System.out.println("URL23:"+URL23);
			 List<WebElement> scriptList23 = driver.findElements(By.tagName("script"));
			 boolean scriptFound23 = false; 
			 for(WebElement item23 : scriptList23){
			 scriptFound23 = item23.getAttribute("src").contains(Tag);
				if (scriptFound23)
					break;

			}
			if (scriptFound23) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-delhi");
		    String URL24=driver.getCurrentUrl(); 
		    System.out.println("URL24:"+URL24);
			 List<WebElement> scriptList24 = driver.findElements(By.tagName("script"));
			 boolean scriptFound24 = false; 
			 for(WebElement item24 : scriptList24){
			 scriptFound24 = item24.getAttribute("src").contains(Tag);
				if (scriptFound24)
					break;

			}
			if (scriptFound24) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-pune");
		    String URL25=driver.getCurrentUrl(); 
		    System.out.println("URL25:"+URL25);
			 List<WebElement> scriptList25 = driver.findElements(By.tagName("script"));
			 boolean scriptFound25 = false; 
			 for(WebElement item25 : scriptList25){
			 scriptFound25 = item25.getAttribute("src").contains(Tag);
				if (scriptFound25)
					break;

			}
			if (scriptFound25) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			driver.navigate().to("https://indialends.com/personal-loan-bangalore");
		    String URL26=driver.getCurrentUrl(); 
		    System.out.println("URL26:"+URL26);
			 List<WebElement> scriptList26 = driver.findElements(By.tagName("script"));
			 boolean scriptFound26 = false; 
			 for(WebElement item26 : scriptList26){
			 scriptFound26 = item26.getAttribute("src").contains(Tag);
				if (scriptFound26)
					break;

			}
			if (scriptFound26) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-jaipur");
		    String URL27=driver.getCurrentUrl(); 
		    System.out.println("URL27:"+URL27);
			 List<WebElement> scriptList27 = driver.findElements(By.tagName("script"));
			 boolean scriptFound27 = false; 
			 for(WebElement item27 : scriptList27){
			 scriptFound27 = item27.getAttribute("src").contains(Tag);
				if (scriptFound27)
					break;

			}
			if (scriptFound27) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-ahmedabad");
		    String URL28=driver.getCurrentUrl(); 
		    System.out.println("URL28:"+URL28);
			 List<WebElement> scriptList28 = driver.findElements(By.tagName("script"));
			 boolean scriptFound28 = false; 
			 for(WebElement item28 : scriptList28){
			 scriptFound28 = item28.getAttribute("src").contains(Tag);
				if (scriptFound28)
					break;

			}
			if (scriptFound28) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-hubli");
		    String URL29=driver.getCurrentUrl(); 
		    System.out.println("URL29:"+URL29);
			 List<WebElement> scriptList29 = driver.findElements(By.tagName("script"));
			 boolean scriptFound29 = false; 
			 for(WebElement item29 : scriptList29){
			 scriptFound29 = item29.getAttribute("src").contains(Tag);
				if (scriptFound29)
					break;

			}
			if (scriptFound29) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-coimbatore");
		    String URL30=driver.getCurrentUrl(); 
		    System.out.println("URL30:"+URL30);
			 List<WebElement> scriptList30 = driver.findElements(By.tagName("script"));
			 boolean scriptFound30 = false; 
			 for(WebElement item30 : scriptList30){
			 scriptFound30 = item30.getAttribute("src").contains(Tag);
				if (scriptFound30)
					break;

			}
			if (scriptFound30) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-surat");
		    String URL31=driver.getCurrentUrl(); 
		    System.out.println("URL31:"+URL31);
			 List<WebElement> scriptList31 = driver.findElements(By.tagName("script"));
			 boolean scriptFound31 = false; 
			 for(WebElement item31 : scriptList31){
			 scriptFound31 = item31.getAttribute("src").contains(Tag);
				if (scriptFound31)
					break;

			}
			if (scriptFound31) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-nagpur ");
		    String URL32=driver.getCurrentUrl(); 
		    System.out.println("URL32:"+URL32);
			 List<WebElement> scriptList32 = driver.findElements(By.tagName("script"));
			 boolean scriptFound32 = false; 
			 for(WebElement item32 : scriptList32){
			 scriptFound32 = item32.getAttribute("src").contains(Tag);
				if (scriptFound32)
					break;

			}
			if (scriptFound32) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-indore");
		    String URL33=driver.getCurrentUrl(); 
		    System.out.println("URL33:"+URL33);
			 List<WebElement> scriptList33 = driver.findElements(By.tagName("script"));
			 boolean scriptFound33 = false; 
			 for(WebElement item33 : scriptList33){
			 scriptFound33 = item33.getAttribute("src").contains(Tag);
				if (scriptFound33)
					break;

			}
			if (scriptFound33) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-vijayawada");
		    String URL34=driver.getCurrentUrl(); 
		    System.out.println("URL34:"+URL34);
			 List<WebElement> scriptList34 = driver.findElements(By.tagName("script"));
			 boolean scriptFound34 = false; 
			 for(WebElement item34 : scriptList34){
			 scriptFound34 = item34.getAttribute("src").contains(Tag);
				if (scriptFound34)
					break;

			}
			if (scriptFound34) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-baroda");
		    String URL35=driver.getCurrentUrl(); 
		    System.out.println("URL35:"+URL35);
			 List<WebElement> scriptList35 = driver.findElements(By.tagName("script"));
			 boolean scriptFound35 = false; 
			 for(WebElement item35 : scriptList35){
			 scriptFound35 = item35.getAttribute("src").contains(Tag);
				if (scriptFound35)
					break;

			}
			if (scriptFound35) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-kochi");
		    String URL36=driver.getCurrentUrl(); 
		    System.out.println("URL36:"+URL36);
			 List<WebElement> scriptList36 = driver.findElements(By.tagName("script"));
			 boolean scriptFound36 = false; 
			 for(WebElement item36 : scriptList36){
			 scriptFound36 = item36.getAttribute("src").contains(Tag);
				if (scriptFound36)
					break;

			}
			if (scriptFound36) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-gwalior");
		    String URL37=driver.getCurrentUrl(); 
		    System.out.println("URL37:"+URL37);
			 List<WebElement> scriptList37 = driver.findElements(By.tagName("script"));
			 boolean scriptFound37 = false; 
			 for(WebElement item37 : scriptList37){
			 scriptFound37 = item37.getAttribute("src").contains(Tag);
				if (scriptFound37)
					break;

			}
			if (scriptFound37) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-varanasi");
		    String URL38=driver.getCurrentUrl(); 
		    System.out.println("URL38:"+URL38);
			 List<WebElement> scriptList38 = driver.findElements(By.tagName("script"));
			 boolean scriptFound38 = false; 
			 for(WebElement item38 : scriptList38){
			 scriptFound38 = item38.getAttribute("src").contains(Tag);
				if (scriptFound38)
					break;

			}
			if (scriptFound38) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-patna");
		    String URL39=driver.getCurrentUrl(); 
		    System.out.println("URL39:"+URL39);
			 List<WebElement> scriptList39 = driver.findElements(By.tagName("script"));
			 boolean scriptFound39 = false; 
			 for(WebElement item39 : scriptList39){
			 scriptFound39 = item39.getAttribute("src").contains(Tag);
				if (scriptFound39)
					break;

			}
			if (scriptFound39) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-dehradun");
		    String URL40=driver.getCurrentUrl(); 
		    System.out.println("URL40:"+URL40);
			 List<WebElement> scriptList40 = driver.findElements(By.tagName("script"));
			 boolean scriptFound40 = false; 
			 for(WebElement item40 : scriptList40){
			 scriptFound40 = item40.getAttribute("src").contains(Tag);
				if (scriptFound40)
					break;

			}
			if (scriptFound40) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-chandigarh");
		    String URL41=driver.getCurrentUrl(); 
		    System.out.println("URL41:"+URL41);
			 List<WebElement> scriptList41 = driver.findElements(By.tagName("script"));
			 boolean scriptFound41 = false; 
			 for(WebElement item41 : scriptList41){
			 scriptFound41 = item41.getAttribute("src").contains(Tag);
				if (scriptFound41)
					break;

			}
			if (scriptFound41) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-lucknow");
		    String URL42=driver.getCurrentUrl(); 
		    System.out.println("URL42:"+URL42);
			 List<WebElement> scriptList42 = driver.findElements(By.tagName("script"));
			 boolean scriptFound42 = false; 
			 for(WebElement item42 : scriptList42){
			 scriptFound42 = item42.getAttribute("src").contains(Tag);
				if (scriptFound42)
					break;

			}
			if (scriptFound42) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-mysore");
		    String URL43=driver.getCurrentUrl(); 
		    System.out.println("URL43:"+URL43);
			 List<WebElement> scriptList43 = driver.findElements(By.tagName("script"));
			 boolean scriptFound43 = false; 
			 for(WebElement item43 : scriptList43){
			 scriptFound43 = item43.getAttribute("src").contains(Tag);
				if (scriptFound43)
					break;

			}
			if (scriptFound43) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-trivandrum");
		    String URL44=driver.getCurrentUrl(); 
		    System.out.println("URL44:"+URL44);
			 List<WebElement> scriptList44 = driver.findElements(By.tagName("script"));
			 boolean scriptFound44 = false; 
			 for(WebElement item44 : scriptList44){
			 scriptFound44 = item44.getAttribute("src").contains(Tag);
				if (scriptFound44)
					break;

			}
			if (scriptFound44) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-jamshedpur");
		    String URL45=driver.getCurrentUrl(); 
		    System.out.println("URL45:"+URL45);
			 List<WebElement> scriptList45 = driver.findElements(By.tagName("script"));
			 boolean scriptFound45 = false; 
			 for(WebElement item45 : scriptList45){
			 scriptFound45 = item45.getAttribute("src").contains(Tag);
				if (scriptFound45)
					break;

			}
			if (scriptFound45) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-kanpur");
		    String URL46=driver.getCurrentUrl(); 
		    System.out.println("URL46:"+URL46);
			 List<WebElement> scriptList46 = driver.findElements(By.tagName("script"));
			 boolean scriptFound46 = false; 
			 for(WebElement item46 : scriptList46){
			 scriptFound46 = item46.getAttribute("src").contains(Tag);
				if (scriptFound46)
					break;

			}
			if (scriptFound46) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-visakhapatnam");
		    String URL47=driver.getCurrentUrl(); 
		    System.out.println("URL47:"+URL47);
			 List<WebElement> scriptList47 = driver.findElements(By.tagName("script"));
			 boolean scriptFound47 = false; 
			 for(WebElement item47 : scriptList47){
			 scriptFound47 = item47.getAttribute("src").contains(Tag);
				if (scriptFound47)
					break;

			}
			if (scriptFound47) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-raipur");
		    String URL48=driver.getCurrentUrl(); 
		    System.out.println("URL48:"+URL48);
			 List<WebElement> scriptList48 = driver.findElements(By.tagName("script"));
			 boolean scriptFound48 = false; 
			 for(WebElement item48 : scriptList48){
			 scriptFound48 = item48.getAttribute("src").contains(Tag);
				if (scriptFound48)
					break;

			}
			if (scriptFound48) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-bhopal");
		    String URL49=driver.getCurrentUrl(); 
		    System.out.println("URL49:"+URL49);
			 List<WebElement> scriptList49 = driver.findElements(By.tagName("script"));
			 boolean scriptFound49 = false; 
			 for(WebElement item49 : scriptList49){
			 scriptFound49 = item49.getAttribute("src").contains(Tag);
				if (scriptFound49)
					break;

			}
			if (scriptFound49) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-jodhpur");
		    String URL50=driver.getCurrentUrl(); 
		    System.out.println("URL50:"+URL50);
			 List<WebElement> scriptList50 = driver.findElements(By.tagName("script"));
			 boolean scriptFound50 = false; 
			 for(WebElement item50 : scriptList50){
			 scriptFound50 = item50.getAttribute("src").contains(Tag);
				if (scriptFound50)
					break;

			}
			if (scriptFound50) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-cuttack");
		    String URL51=driver.getCurrentUrl(); 
		    System.out.println("URL51:"+URL51);
			 List<WebElement> scriptList51 = driver.findElements(By.tagName("script"));
			 boolean scriptFound51 = false; 
			 for(WebElement item51 : scriptList51){
			 scriptFound51 = item51.getAttribute("src").contains(Tag);
				if (scriptFound51)
					break;

			}
			if (scriptFound51) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-bhubaneswar");
		    String URL52=driver.getCurrentUrl(); 
		    System.out.println("URL52:"+URL52);
			 List<WebElement> scriptList52 = driver.findElements(By.tagName("script"));
			 boolean scriptFound52 = false; 
			 for(WebElement item52 : scriptList52){
			 scriptFound52 = item52.getAttribute("src").contains(Tag);
				if (scriptFound52)
					break;

			}
			if (scriptFound52) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/hdfc-personal-loan");
		    String URL53=driver.getCurrentUrl(); 
		    System.out.println("URL53:"+URL53);
			 List<WebElement> scriptList53 = driver.findElements(By.tagName("script"));
			 boolean scriptFound53 = false; 
			 for(WebElement item53 : scriptList53){
			 scriptFound53 = item53.getAttribute("src").contains(Tag);
				if (scriptFound53)
					break;

			}
			if (scriptFound53) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/idfc-personal-loan");
		    String URL54=driver.getCurrentUrl(); 
		    System.out.println("URL54:"+URL54);
			 List<WebElement> scriptList54 = driver.findElements(By.tagName("script"));
			 boolean scriptFound54 = false; 
			 for(WebElement item54 : scriptList54){
			 scriptFound54 = item54.getAttribute("src").contains(Tag);
				if (scriptFound54)
					break;

			}
			if (scriptFound54) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/capital-first-personal-loan");
		    String URL55=driver.getCurrentUrl(); 
		    System.out.println("URL55:"+URL55);
			 List<WebElement> scriptList55 = driver.findElements(By.tagName("script"));
			 boolean scriptFound55 = false; 
			 for(WebElement item55 : scriptList55){
			 scriptFound55 = item55.getAttribute("src").contains(Tag);
				if (scriptFound55)
					break;

			}
			if (scriptFound55) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/bajaj-personal-loan ");
		    String URL56=driver.getCurrentUrl(); 
		    System.out.println("URL56:"+URL56);
			 List<WebElement> scriptList56 = driver.findElements(By.tagName("script"));
			 boolean scriptFound56 = false; 
			 for(WebElement item56 : scriptList56){
			 scriptFound56 = item56.getAttribute("src").contains(Tag);
				if (scriptFound56)
					break;

			}
			if (scriptFound56) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/icici-personal-loan");
		    String URL57=driver.getCurrentUrl(); 
		    System.out.println("URL57:"+URL57);
			 List<WebElement> scriptList57 = driver.findElements(By.tagName("script"));
			 boolean scriptFound57 = false; 
			 for(WebElement item57 : scriptList57){
			 scriptFound57 = item57.getAttribute("src").contains(Tag);
				if (scriptFound57)
					break;

			}
			if (scriptFound57) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/Kotak-personal-loan");
		    String URL58=driver.getCurrentUrl(); 
		    System.out.println("URL58:"+URL58);
			 List<WebElement> scriptList58 = driver.findElements(By.tagName("script"));
			 boolean scriptFound58 = false; 
			 for(WebElement item58 : scriptList58){
			 scriptFound58 = item58.getAttribute("src").contains(Tag);
				if (scriptFound58)
					break;

			}
			if (scriptFound58) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/yes-bank-personal-loan");
		    String URL59=driver.getCurrentUrl(); 
		    System.out.println("URL59:"+URL59);
			 List<WebElement> scriptList59 = driver.findElements(By.tagName("script"));
			 boolean scriptFound59 = false; 
			 for(WebElement item59 : scriptList59){
			 scriptFound59 = item59.getAttribute("src").contains(Tag);
				if (scriptFound59)
					break;

			}
			if (scriptFound59) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-balance-transfer");
		    String URL60=driver.getCurrentUrl(); 
		    System.out.println("URL60:"+URL60);
			 List<WebElement> scriptList60 = driver.findElements(By.tagName("script"));
			 boolean scriptFound60 = false; 
			 for(WebElement item60 : scriptList60){
			 scriptFound60 = item60.getAttribute("src").contains(Tag);
				if (scriptFound60)
					break;

			}
			if (scriptFound60) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/small-amount-personal-loan");
		    String URL61=driver.getCurrentUrl(); 
		    System.out.println("URL61:"+URL61);
			 List<WebElement> scriptList61 = driver.findElements(By.tagName("script"));
			 boolean scriptFound61 = false; 
			 for(WebElement item61 : scriptList61){
			 scriptFound61 = item61.getAttribute("src").contains(Tag);
				if (scriptFound61)
					break;

			}
			if (scriptFound61) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/personal-loan-emi-calculator ");
		    String URL62=driver.getCurrentUrl(); 
		    System.out.println("URL62:"+URL62);
			 List<WebElement> scriptList62 = driver.findElements(By.tagName("script"));
			 boolean scriptFound62 = false; 
			 for(WebElement item62 : scriptList62){
			 scriptFound62 = item62.getAttribute("src").contains(Tag);
				if (scriptFound62)
					break;

			}
			if (scriptFound62) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/free-credit-report#video-link");
		    String URL63=driver.getCurrentUrl(); 
		    System.out.println("URL63:"+URL63);
			 List<WebElement> scriptList63 = driver.findElements(By.tagName("script"));
			 boolean scriptFound63 = false; 
			 for(WebElement item63 : scriptList63){
			 scriptFound63 = item63.getAttribute("src").contains(Tag);
				if (scriptFound63)
					break;

			}
			if (scriptFound63) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			driver.navigate().to("https://indialends.com/about-us");
		    String URL64=driver.getCurrentUrl(); 
		    System.out.println("URL64:"+URL64);
			 List<WebElement> scriptList64 = driver.findElements(By.tagName("script"));
			 boolean scriptFound64 = false; 
			 for(WebElement item64 : scriptList64){
			 scriptFound64 = item64.getAttribute("src").contains(Tag);
				if (scriptFound64)
					break;

			}
			if (scriptFound64) {
				System.out.println("PASS");

			} else {
				System.out.println("FAIL");

			}
			
			
			driver.navigate().to("https://indialends.com/privacy-policy ");
		    String URL65=driver.getCurrentUrl(); 
		    System.out.println("URL65:"+URL65);
			 List<WebElement> scriptList65 = driver.findElements(By.tagName("script"));
			 boolean scriptFound65 = false; 
			 for(WebElement item65 : scriptList65){
			 scriptFound65 = item65.getAttribute("src").contains(Tag);
				if (scriptFound65)
					break;

			}
			if (scriptFound65) {
				System.out.println("PASS");
				System.out.println("Pixel is fire: AW-955414164");

			} else {
				System.out.println("FAIL");
				System.out.println("Pixel is not fire: AW-955414164");

			}
			
	
	}
}
