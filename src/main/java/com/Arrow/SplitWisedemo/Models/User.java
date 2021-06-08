package com.Arrow.SplitWisedemo.Models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private long mobileNum;

	@CreationTimestamp
	private LocalDateTime createDate;

	@UpdateTimestamp
	private LocalDateTime updateDate;

	@ManyToMany(mappedBy = "users")
	private List<Group> groups;

	public User() {

	}

	public User(long id, String userName, String email, long mobileNum, LocalDateTime createDate,
			LocalDateTime updateDate, List<Group> groups) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.mobileNum = mobileNum;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.groups = groups;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

}
