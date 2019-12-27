/**
 * 
 */
package model;

/**
 * @author fercosmig
 *
 */
public class MenuLinks {
	private String name;
	private String url;
	private String target;

	/** constructors */
	public MenuLinks() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param url
	 * @param target
	 */
	public MenuLinks(String name, String url, String target) {
		super();
		this.name = name;
		this.url = url;
		this.target = target;
	}

	/** Getters and Setters */

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @param target the target to set
	 */
	public void setTarget(String target) {
		this.target = target;
	}

}
