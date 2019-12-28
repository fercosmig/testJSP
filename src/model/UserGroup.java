/**
CREATE TABLE tbUserGroup(
	userId BIGINT NOT NULL,
	groupId BIGINT NOT NULL,
	PRIMARY KEY (userId, groupId)
);
 */
package model;

import java.io.Serializable;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 28, 2019
 * @file model.UserGroup.java
 */
public class UserGroup implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Attributes
	 */
	private int userId;
	private int groupId;

	/**
	 * Constructors
	 */
	public UserGroup() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param groupId
	 */
	public UserGroup(int userId, int groupId) {
		super();
		this.userId = userId;
		this.groupId = groupId;
	}

	/**
	 * Getters and Setters
	 */

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the groupId
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

}
