package AlertMachenisum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.testng.annotations.Test;
import Utilities.Base;

public class SpamIpAlert {
	
	String dbURL = Base.loadPropertiesFile("DB.properties", "URL4");
	String user = Base.loadPropertiesFile("DB.properties", "user4");
	String password = Base.loadPropertiesFile("DB.properties", "password4");
@Test	
public void verify_SpamIp() {
	try {
		Connection connection = DriverManager.getConnection(dbURL, user, password);
		if (connection != null) {
			// System.out.println("Connected to the database");
			try {

					String query = "SELECT top 10 SUBSTRING(IpAddress, 1, CHARINDEX(':', IpAddress)-1) as ip from  spamblockerdetails (nolock) order by CrDate desc";
					PreparedStatement pstmtmv = connection.prepareStatement(query);
					ResultSet rs = pstmtmv.executeQuery();
					while(rs.next()) {
					String errorMsg = (String) rs.getObject("ip");
					System.out.println("Error message is:"+errorMsg);
					
					long s = rs.getLong("EhsCreatedDate");
					//String dateAsString = String.valueOf(s);
					 Date date = new Date(s*1000);
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
			        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
			        String formattedDate = sdf.format(date);
			       // System.out.println(formattedDate);
			        
					DateFormat df = new SimpleDateFormat("dd/MM/yy");
					Calendar calobj = Calendar.getInstance();
					//System.out.println(df.format(calobj.getTime()));
                    
					/*String sysDate=df.format(calobj.getTime());
					if(sysDate.compareTo(formattedDate) == 0) {
						
						String errorMsg1 = "MobileNo is:"+rs.getObject("UmobileNo")+" EhsStatus: "+rs.getObject("EhsStatus")+ " Error is: "+rs.getString("EhsMessage");
						System.out.println("Error message (expHardpullDetails) is:"+errorMsg1);
						System.out.println("DB Date is:"+formattedDate +" current date is: "+sysDate);
						//SendMail.sendmail("Error message (expHardpullDetails): "+errorMsg1);
					}*/
					}
					pstmtmv.close();
			} finally {
				connection.close();
			}

		} else {
			System.out.println("not able to Connect database");
		}
	} catch (SQLException e) {
		System.out.println("Exception is:" + e.getMessage());
		e.printStackTrace();
	}
}

}
