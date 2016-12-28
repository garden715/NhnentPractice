package com.jungwon.domain;

import java.sql.Date;

public class MemberVO {
	String userid;
	String userpw;
	String username;
	String email;
	Date regdate;
	Date updatedate;

	public MemberVO() {
		
	}
	
	public MemberVO(String userid, String userpw, String username, String email) {
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : "+this.getUsername()+" Email : "+this.getEmail()+ " ID : "+this.getUserid();
	}
}
