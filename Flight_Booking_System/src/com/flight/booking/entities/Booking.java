package com.flight.booking.entities;

import java.util.Date;
import java.util.List;

public class Booking {
	
	private int user_id;
	private int booking_id;
	private int flight_id;
	private Date departDate;
	
	private String time;
	
	private int amount;
	private int FareType;
	private List<String> seat;
	private boolean status;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking(int user_id, int booking_id, int flight_id, Date departDate, String time, int amount, int fareType,
			List<String> seat, boolean status) {
		super();
		this.user_id = user_id;
		this.booking_id = booking_id;
		this.flight_id = flight_id;
		this.departDate = departDate;
		this.time = time;
		this.amount = amount;
		FareType = fareType;
		this.seat = seat;
		this.status = status;
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getFareType() {
		return FareType;
	}
	public void setFareType(int fareType) {
		FareType = fareType;
	}
	public List<String> getSeat() {
		return seat;
	}
	public void setSeat(List<String> seat) {
		this.seat = seat;
	}
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Booking [user_id=" + user_id + ", booking_id=" + booking_id + ", flight_id=" + flight_id
				+ ", departDate=" + departDate + ", time=" + time + ", amount=" + amount + ", FareType=" + FareType
				+ ", seat=" + seat + ", status=" + status + "]";
	}

	
	
	
	
}
