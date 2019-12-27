package bmi;

public class IdealWeight {
	private static final double BMI_MINIMUM = 18.5;
	private static final double BMI_IDEAL = 23;
	private static final double BMI_MAXIMUM = 25;

	public static Double calculateMinimumWeight(double height) {
		double result = BMI_MINIMUM * Math.pow(height, 2);
		return result;
	}

	public static Double calculateIdealWeight(double height) {
		double result = BMI_IDEAL * Math.pow(height, 2);
		return result;
	}

	public static Double calculateMaximumWeight(double height) {
		double result = BMI_MAXIMUM * Math.pow(height, 2);
		return result;
	}

}