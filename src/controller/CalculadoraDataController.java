/**
 * 
 */
package controller;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 26, 2019
 * @file controller.CalculadoraDataController.java
 */
public class CalculadoraDataController {
	private static final long MILLISECONDS_IN_ONE_SECOND = 1000;
	private static final long MILLISECONDS_IN_ONE_MINUTE = 60 * 1000; // 60,000
	private static final long MILLISECONDS_IN_ONE_HOUR = 60 * 60 * 1000; // 3,600,000
	private static final long MILLISECONDS_IN_ONE_DAY = 24 * 60 * 60 * 1000; // 86,400,000

	public static Calendar convertStringToCalendar(String strDate) {

		strDate = strDate.replace("T", "-");
		strDate = strDate.replace(":", "-");

		String[] strDateArray = strDate.split("-");

		Calendar c = Calendar.getInstance();

		c.set(Calendar.YEAR, Integer.parseInt(strDateArray[0]));
		c.set(Calendar.MONTH, (Integer.parseInt(strDateArray[1]) - 1));
		c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(strDateArray[2]));
		c.set(Calendar.HOUR_OF_DAY, Integer.parseInt(strDateArray[3]));
		c.set(Calendar.MINUTE, Integer.parseInt(strDateArray[4]));
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);

		return c;
	}

	public static String retrieveInterval(Calendar startDate, Calendar endDate) {

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(0);

		String pattern = "EEE, MMM dd, yyyy HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		long sd = startDate.getTimeInMillis();
		long ed = endDate.getTimeInMillis();

		long diffInMillis = ed - sd;

		float days = diffInMillis / MILLISECONDS_IN_ONE_DAY;
		float restDays = diffInMillis % MILLISECONDS_IN_ONE_DAY;
		
		float hours = restDays / MILLISECONDS_IN_ONE_HOUR;
		float restHours = restDays % MILLISECONDS_IN_ONE_HOUR;

		float minutes = restHours / MILLISECONDS_IN_ONE_MINUTE;
		float restMinutes = restHours % MILLISECONDS_IN_ONE_MINUTE;

		float seconds = restMinutes / MILLISECONDS_IN_ONE_SECOND;
		@SuppressWarnings("unused")
		float restSeconds = restMinutes % MILLISECONDS_IN_ONE_SECOND;

		String msg = "";
		msg += "Data inicial: " + sdf.format(startDate.getTime());
		msg += "<br />";
		msg += "Data final: " + sdf.format(endDate.getTime());
		msg += "<br /><br />";
		msg += "A diferença entre as datas acima é: ";
		msg += nf.format(days) + " dias, ";
		msg += nf.format(hours) + " horas, ";
		msg += nf.format(minutes) + " minutos e ";
		msg += nf.format(seconds) + " segundos.";

		return msg;
	}

}
