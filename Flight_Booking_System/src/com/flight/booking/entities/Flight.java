package com.flight.booking.entities;

import java.util.List;

public class Flight {
	
	private int Flight_Num;
	private String airLine;
	private String departDate;
	private String departTime;
	private int price;
	private String fareType;
	private List<String> seatsAvailable;
	
	
	public Flight(int flight_Num, String airLine, String departDate, String departTime, int price, String fareType,
			List<String> seatsAvailable) {
		super();
		Flight_Num = flight_Num;
		this.airLine = airLine;
		this.departDate = departDate;
		this.departTime = departTime;
		this.price = price;
		this.fareType = fareType;
		this.seatsAvailable = seatsAvailable;
	}


	@Override
	public String toString() {
		return "Flight [Flight_Num=" + Flight_Num + ", airLine=" + airLine + ", departDate=" + departDate
				+ ", departTime=" + departTime + ", price=" + price + ", fareType=" + fareType + ", seatsAvailable="
				+ seatsAvailable + "]";
	}

}
