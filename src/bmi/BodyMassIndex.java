package bmi;

public class BodyMassIndex {

	public static Double calculateBodyMassIndex(double height, double weight) {
		double result = weight / Math.pow(height, 2);
		return result;
	}

}
