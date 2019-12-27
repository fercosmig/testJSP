package math;

import java.text.DecimalFormat;

public class SquareRoot {

	public static String retrieveSquareRoot(int number) {

		double raiz = Math.sqrt(number);
		DecimalFormat df = new DecimalFormat("#.####");
		return df.format(raiz);
	}

}