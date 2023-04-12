package com.Tns.userservice1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	private Integer u_id;
	private String user_name;
	private String password;
	private String location;
	private String gender;
	private String mail_id;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer u_id, String user_name, String password, String location, String gender, String mail_id) {
		super();
		this.u_id = u_id;
		this.user_name = user_name;
		this.password = password;
		this.location = location;
		this.gender = gender;
		this.mail_id = mail_id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", user_name=" + user_name + ", password=" + password + ", location=" + location
				+ ", gender=" + gender + ", mail_id=" + mail_id + "]";
	}
	
	

}
