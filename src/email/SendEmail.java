/**
 * 
 */
package email;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author fercosmig
 *
 */
public class SendEmail {
	private static final Logger LOGGER = LogManager.getLogger(SendEmail.class.getName());
	private static final String SMTP = "smtp.gmail.com";
	private static final String PORT = "587";
	private static final String USERNAME = "";
	private static final String PASSWORD = "";

	public void sendEmail(String email, String name, String msg) {

		Properties prop = new Properties();
		prop.put("mail.smtp.host", SMTP);
		prop.put("mail.smtp.port", PORT);
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(USERNAME, PASSWORD);
			}
		});
		
		String pattern = "EEE, MMM dd, yyyy HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Calendar c = Calendar.getInstance();

		String subject = sdf.format(c.getTime()) + " - Contato - " + name + " - " + email;
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(USERNAME));
			message.setRecipients(Message.RecipientType.CC,  InternetAddress.parse(email));
			message.setSubject(subject);
			message.setText(msg);
			Transport.send(message);
			LOGGER.info("Mensagem enviada com sucesso!");
		} catch (MessagingException e) {
			LOGGER.error(e);
		}
	}

}
