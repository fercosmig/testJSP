package math;

public class PrimeNumbers {

	public static String listPrimeNumbers(Integer qtd) {

		String retorno = "";
		int counter;
		int number = 0;
		for (int i = 0; i <= qtd; i++) {
			counter = 0;
			for (int u = 1; u <= i; u++) {
				if (i % u == 0) {
					counter++;
					number = u;
				}
			}
			if (counter == 2) {
				retorno += " | " + number;
			}
		}
		return retorno;
	}

}