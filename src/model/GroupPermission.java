/*
CREATE TABLE tbGroupPermission(
	groupId BIGINT NOT NULL,
	permissionId BIGINT NOT NULL,
	PRIMARY KEY (groupId, permissionId)
);
 */
package model;

import java.io.Serializable;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 28, 2019
 * @file model.GroupPermission.java
 */
public class GroupPermission implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Attributes
	 */
	private int groupId;
	private int permissionId;

	/**
	 * Constructors
	 */
	public GroupPermission() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param groupId
	 * @param permissionId
	 */
	public GroupPermission(int groupId, int permissionId) {
		super();
		this.groupId = groupId;
		this.permissionId = permissionId;
	}

	/**
	 * Getters and Setters
	 */

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

	/**
	 * @return the permissionId
	 */
	public int getPermissionId() {
		return permissionId;
	}

	/**
	 * @param permissionId the permissionId to set
	 */
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

}
