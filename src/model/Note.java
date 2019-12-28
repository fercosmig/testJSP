/**
CREATE TABLE tbNote
	id BIGINT NOT NULL AUTO_INCREMENT,
	description VARCHAR(256) NOT NULL,
	status BOOLEAN NOT NULL DEFAULT TRUE,
	registrationDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (id)
);
 */
package model;

import java.util.Date;

/**
 * @author fercosmig
 *
 */
public class Note {
	private Integer id;
	private String description;
	private Boolean status;
	private Date registrationdate;

	/** Constructors */
	public Note() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param description
	 * @param status
	 * @param registrationdate
	 */
	public Note(Integer id, String description, Boolean status, Date registrationdate) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
		this.registrationdate = registrationdate;
	}

	/** Methods */

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the registrationdate
	 */
	public Date getRegistrationdate() {
		return registrationdate;
	}

	/**
	 * @param registrationdate the registrationdate to set
	 */
	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

}
