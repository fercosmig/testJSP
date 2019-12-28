/**
CREATE TABLE tbPermission(
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	description VARCHAR(50),
	url VARCHAR(50) NOT NULL,
	PRIMARY KEY (id)
);
 */
package model;

import java.io.Serializable;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 28, 2019
 * @file model.Permission.java
 */
public class Permission implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Attributes
	 */
	private int id;
	private String name;
	private String description;
	private String url;

	/**
	 * Constructors
	 */
	public Permission() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param url
	 */
	public Permission(int id, String name, String description, String url) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.url = url;
	}

	/**
	 * Getters and Setters
	 */

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
