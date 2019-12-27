/**
 * 
 */
package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author fercosmig
 *
 */
public class TestImport {
	private static final Logger LOGGER = LogManager.getLogger(TestImport.class.getName());

	/**
	 * 
	 */
	public TestImport() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.info("main method.");
		int dia = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
		System.out.println("Hoje é dia: " + dia);
	}

}
