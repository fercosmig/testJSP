/**
 * 
 */
package math;

import java.text.DecimalFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author fercosmig
 *
 */
public class Conversor {
	private static final Logger LOGGER = LogManager.getLogger(Conversor.class.getName());
	private static DecimalFormat df = new DecimalFormat("#.####");

	public static Double mileToKilometer(Double mile) {
		LOGGER.info("method mileToKilometer");
		Double kilometer = mile / 0.62138;
		return Double.parseDouble(df.format(kilometer));
	}

	public static Double kilometerToMile(Double kilometer) {
		LOGGER.info("method kilometerToMile");
		Double mile = kilometer * 0.62137;
		return Double.parseDouble(df.format(mile));
	}

	public static Double meterPerSecondToKilometerPerHour(Double meterPerSecond) {
		LOGGER.info("method meterPerSecondToKilometerPerHour");
		Double kilometerPerHour = meterPerSecond * 3.6;
		return Double.parseDouble(df.format(kilometerPerHour));
	}

	public static Double kilometerPerHourToMeterPerSecond(Double kilometerPerHour) {
		LOGGER.info("method kilometerPerHourToMeterPerSecond");
		Double meterPerSecond = kilometerPerHour / 3.6;
		return Double.parseDouble(df.format(meterPerSecond));
	}

	public static Double KnotToKilometerPerHour(Double knot) {
		LOGGER.info("method KnotToKilometerPerHour");
		Double kilometerPerHour = knot * 1.852;
		return Double.parseDouble(df.format(kilometerPerHour));
	}

	public static Double kilometerPerHourToKnot(Double KilometerPerHour) {
		LOGGER.info("method kilometerPerHourToKnot");
		Double knot = KilometerPerHour / 1.852;
		return Double.parseDouble(df.format(knot));
	}

	public static Double nauticalMileToKilometer(Double nauticalMile) {
		LOGGER.info("method nauticalMileToKilometer");
		Double kilometer = nauticalMile / 0.53995680345572;
		return Double.parseDouble(df.format(kilometer));
	}

	public static Double kilometerToNauticalMile(Double kilometer) {
		LOGGER.info("method kilometerToNauticalMile");
		Double nauticalMile = kilometer * 1.852;
		return Double.parseDouble(df.format(nauticalMile));
	}

}
