package com.jungwon.domain;

import java.sql.Date;

public class Post {
	int id;
	String email;
	String name;
	String title;
	String password;
	String contents;
	Date regDate;
	Date updateDate;

	public Post() {

	}

	public Post(String email, String name, String password, String contents) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.contents = contents;
	}

	public Post(int id, String email, String name, String password, String contents) {
		this(email, name, password, contents);
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	

}
