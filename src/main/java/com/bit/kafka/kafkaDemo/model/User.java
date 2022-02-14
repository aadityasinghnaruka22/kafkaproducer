package com.bit.kafka.kafkaDemo.model;

public class User {

	private String u_Id;
	private String u_Name;
	private String u_Password;
	public User(String u_Id, String u_Name, String u_Password) {
		super();
		this.u_Id = u_Id;
		this.u_Name = u_Name;
		this.u_Password = u_Password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getU_Id() {
		return u_Id;
	}
	public void setU_Id(String u_Id) {
		this.u_Id = u_Id;
	}
	public String getU_Name() {
		return u_Name;
	}
	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}
	public String getU_Password() {
		return u_Password;
	}
	public void setU_Password(String u_Password) {
		this.u_Password = u_Password;
	}
	@Override
	public String toString() {
		return "User [u_Id=" + u_Id + ", u_Name=" + u_Name + ", u_Password=" + u_Password + "]";
	}
	
	
}
