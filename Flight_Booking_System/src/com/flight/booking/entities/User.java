package com.flight.booking.entities;

public class User {
	
	private int user_id;
	private String user_name;
	private int funds;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String user_name, int funds) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.funds = funds;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getFunds() {
		return funds;
	}
	public void setFunds(int funds) {
		this.funds = funds;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", funds=" + funds + "]";
	}
	
	

}
