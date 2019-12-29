/**
 * 
 */
package test;

import java.util.Calendar;

/**
 * @author fercosmig
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());

		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i + 1;
		}
		
		// Percorrendo um array.
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Percorrendo um array de uma forma mais elegante.
		for (int f : a) {
			System.out.println(f);
		}
	}
}
