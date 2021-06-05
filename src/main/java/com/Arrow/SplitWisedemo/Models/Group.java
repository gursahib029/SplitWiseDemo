package com.Arrow.SplitWisedemo.Models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Arrow.SplitWisedemo.Enums.GroupTypeEnum;

@Entity
@Table(name="splitwise_group")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private long userId;

	private String groupName;

	@Enumerated
	private GroupTypeEnum type;

	private boolean isSmplifyGroupDepts;

	public Group(long id, long userId, String groupName, GroupTypeEnum type, boolean isSmplifyGroupDepts) {
		super();
		this.id = id;
		this.userId = userId;
		this.groupName = groupName;
		this.type = type;
		this.isSmplifyGroupDepts = isSmplifyGroupDepts;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public GroupTypeEnum getType() {
		return type;
	}

	public void setType(GroupTypeEnum type) {
		this.type = type;
	}

	public boolean isSmplifyGroupDepts() {
		return isSmplifyGroupDepts;
	}

	public void setSmplifyGroupDepts(boolean isSmplifyGroupDepts) {
		this.isSmplifyGroupDepts = isSmplifyGroupDepts;
	}

}
