import java.io.File;
import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class OutlookEmailSend {
	public static void main(String[] args) {
		Properties props = new Properties();
		//props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "smtp-mail.outlook.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");

        try
        {
        Authenticator auth = new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("mahendra.maske@nextenture.com", "XXXXX");
            }
          };

        Session session = Session.getInstance(props, auth);
        session.setDebug(true);
        MimeMessage msg = new MimeMessage(session);
        msg.setText("Hey, this is the testing email.");
        msg.setSubject("Testing");
        msg.setFrom(new InternetAddress("mahendra.maske@nextenture.com"));
        msg.addRecipient(Message.RecipientType.TO, new InternetAddress("mahendra.maske@nextenture.com"));
      
        BodyPart messageBodyPart = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();
        DataSource source =null;
       
        String filename = "C://Nextenture//20191015103443_Bestellen_Abholen_Präsenztrainings2.xlsx";
        source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);
        msg.setContent(multipart);
        
       
        
		msg.setContent(multipart);
        Transport.send(msg);
        System.out.println("Send");

        }catch (MessagingException mex) {
           mex.printStackTrace();
        }

	}
}
