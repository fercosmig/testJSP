/**
 * 
 */
package test;

import repository.MegaSenaRepository;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 29, 2019
 * @file test.MegaSenaTest.java
 */
public class MegaSenaTest {

	/**
	 * 
	 */
	public MegaSenaTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MegaSenaRepository msr = new MegaSenaRepository();
		Integer qtd = msr.getAmountDraw(1);
		System.out.println(qtd);
	}

}
