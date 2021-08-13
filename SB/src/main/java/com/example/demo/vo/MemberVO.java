package com.example.demo.vo;


public class MemberVO {
	
	public String id;
	
	public String user_id;
	
	public String user_pw;
	
	public String user_name;
	
	public String user_email;
	
	public String user_author;
	
	public String reg_date;
	
	public String del_yn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_author() {
		return user_author;
	}

	public void setUser_author(String user_author) {
		this.user_author = user_author;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getDel_yn() {
		return del_yn;
	}

	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}

	@Override
	public String toString() {
		return "Member2VO [id=" + id + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name
				+ ", user_email=" + user_email + ", user_author=" + user_author + ", reg_date=" + reg_date + ", del_yn="
				+ del_yn + "]";
	}
	
	
}
 