package com.jungwon.domain;

import java.sql.Date;

public class Post {
	int id;
	String email;
	String name;
	String password;
	String contents;
	Date regdate;
	Date updatedate;

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

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

}
