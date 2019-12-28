/**
CREATE TABLE tbGroup(
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	description VARCHAR(50),
	status BOOLEAN NOT NULL DEFAULT TRUE,
	registrationDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (id)
);
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 28, 2019
 * @file model.Group.java
 */
public class Group implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Attributes
	 */
	private int id;
	private String name;
	private String description;
	private Boolean status;
	private Date registrationDate;

	/**
	 * Constructors
	 */
	public Group() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param status
	 * @param registrationDate
	 */
	public Group(int id, String name, String description, Boolean status, Date registrationDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.registrationDate = registrationDate;
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
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
