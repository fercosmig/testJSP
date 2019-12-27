package math;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	static long fibo(int n) {
		return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
	}

	public static List<Integer> listaFibonacci(Integer qtd) {

		List<Integer> sequencia = new ArrayList<Integer>();
		for (int i = 0; i < qtd; i++) {
			sequencia.add((int) Fibonacci.fibo(i));
		}
		return sequencia;
	}

}
