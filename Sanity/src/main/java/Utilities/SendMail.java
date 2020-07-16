package Utilities;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class SendMail {

	public static void sendmail(String message) {
		final String fromEmail = "itreports@indialends.com";      
		final String password =  "IT@reports@123";      
		final String toEmail = "deepakkumar@indialends.com,ravindrakumar@indialends.com,adityayadav@indialends.com"; // can be any email id ,athi@indialends.com,mahadevan@indialends.com,kamalakannan@indialends.com,aliakbar@indialends.com,qa@indialends.com,

		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
		props.put("mail.smtp.port", "587"); // TLS Port
		//props.put("mail.smtp.port", "465");
		props.put("mail.smtp.auth", "true"); // enable authentication
		props.put("mail.smtp.starttls.enable", "true"); // enable STARTTLS

		// create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			// override the getPasswordAuthentication method
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(props, auth);

		EmailUtil.sendEmail(session, toEmail, "Alert Details", message);
	}

}
