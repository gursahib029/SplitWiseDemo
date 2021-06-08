package com.Arrow.SplitWisedemo.Models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.Arrow.SplitWisedemo.Enums.GroupTypeEnum;

@Entity
@Table(name="splitwise_group")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(nullable = false,updatable = false)
	private long createdBy;

	@Column(nullable = false)
	private String groupName;

	@Enumerated
	@Column(nullable = false)
	private GroupTypeEnum type;

	private boolean isSmplifyGroupDepts;
	
	@ManyToMany
	private List<User> users;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	private long updatedBy;
	
	public Group() {
		
	}

	public Group(long id, long createdBy, String groupName, GroupTypeEnum type, boolean isSmplifyGroupDepts,
			List<User> users, LocalDateTime createdAt, LocalDateTime updatedAt, long updatedBy) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.groupName = groupName;
		this.type = type;
		this.isSmplifyGroupDepts = isSmplifyGroupDepts;
		this.users = users;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

}
