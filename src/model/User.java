/**
 * 
 */
package model;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author fercosmig
 *
 */
public class User {
	private static final Logger LOGGER = LogManager.getLogger(User.class.getName());
	private Integer id;
	private String login;
	private String password;
	private Boolean Status;
	private Date registrationDate;

	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
		LOGGER.info("object instance.");
	}

	/**
	 * @param id
	 * @param login
	 * @param password
	 * @param status
	 * @param registrationDate
	 */
	public User(Integer id, String login, String password, Boolean status, Date registrationDate) {
		this.id = id;
		this.login = login;
		this.password = password;
		Status = status;
		this.registrationDate = registrationDate;
	}

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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return Status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		Status = status;
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
