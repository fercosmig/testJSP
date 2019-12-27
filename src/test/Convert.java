/**
 * 
 */
package test;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import math.Conversor;

/**
 * @author fercosmig
 *
 */
public class Convert {
	private static final Logger LOGGER = LogManager.getLogger(Convert.class.getName());

	/**
	 * 
	 */
	public Convert() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.info("main method");

		DecimalFormat df = new DecimalFormat("#.####");
		Double inputValue = null;
		Double returnValue = null;
		String title = "";
		String message = "";
		String stringValue = "";

		LOGGER.info("knot => kilometer per hour");
		title = "Conversão de nós em quilometros por hora.";
		message = "Digite o valor em nós:";
		stringValue = JOptionPane.showInputDialog(null, message, title, 0);
		inputValue = Double.parseDouble(stringValue);
		returnValue = Conversor.KnotToKilometerPerHour(inputValue);
		message = df.format(inputValue) + " nós é equivalente a " + df.format(returnValue) + " quilometros por hora.";
		JOptionPane.showMessageDialog(null, message, title, 0);

		LOGGER.info("kilometer per hour => knot");
		title = "Conversão de quilometros por hora em nós.";
		message = "Digite o valor em quilômetros por hora:";
		stringValue = JOptionPane.showInputDialog(null, message, title, 0);
		inputValue = Double.parseDouble(stringValue);
		returnValue = Conversor.kilometerPerHourToKnot(inputValue);
		message = df.format(inputValue) + " quilômetros por hora é equivalente a " + df.format(returnValue) + " nós.";
		JOptionPane.showMessageDialog(null, message, title, 0);

	}

}
