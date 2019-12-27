/**
 * 
 */
package enumeration;

/**
 * @author fercosmig
 *
 */
public enum Conversion {
	MK("Mile to Kilometer"),
	KM("Kilometer to Mile"),
	MSKH("Meter per second to Kilometer per hour"),
	KHMS("Kilometer per hour to Meter per second"),
	KKH("Knot to Kilometer per hour"),
	KHK("Kilometer per hour to Knot"),
	NMK("Nautical mile to Kilometer"),
	KNM("Kilometer to Nautical mile");
	
	private String description;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	private Conversion(String description) {
		this.description = description;
	}
	
}
