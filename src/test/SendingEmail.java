/**
 * 
 */
package test;

import email.SendEmail;

/**
 * @author fercosmig
 *
 */
public class SendingEmail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Fernando";
		String email = "fercosmig@gmail.com";
		String body = null;

		body = "Olá, Testando envio de e-mail com java, Tive que entrar nas configurações"
				+ " de conta do gmail e alterar para on a configuração de \"Less secure app access\"";

		SendEmail se = new SendEmail();
		se.sendEmail(email, name, body);

	}

}
