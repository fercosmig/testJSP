/**
 * 
 */
package enumeration;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 4, 2020
 * @file enumeration.Group.java
 */
public enum Group {
	ROLE_ADMIN("Administrators"),
	ROLE_USERS("Usuarios cadastrados");

	private String description;

	/**
	 * Constructors
	 */
	
	/**
	 * @param description
	 */
	private Group(String description) {
		this.description = description;
	}

	/**
	 * Getters and Setters
	 */
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	} 
	
	
}
