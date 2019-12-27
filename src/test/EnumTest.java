/**
 * 
 */
package test;

import enumeration.Conversion;

/**
 * @author fercosmig
 *
 */
public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Conversion.KKH);
		System.out.println(Conversion.KKH.getDescription());
		
		for (Conversion desc : Conversion.values()) {
			
			System.out.println(desc);
			System.out.println(desc.getDescription());
			
		}
		
	}

}
