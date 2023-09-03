package com.flight.booking.Service;

import java.util.Date;
import java.util.List;

import com.flight.booking.entities.Flight;

public interface UserService {
	
	public void addUser(int userId, String userName, int Funds);
	
//	show the flights which are having seats more than or equal to asked seats(paxCount)
//	<flightNumber, airline, from, to, departDate, departTime, price, fareType, List<seat>> 
	public List<Flight> searchFlights(String departingFrom, String ArrivalTo, int paxCount);
	
	public int bookAFlight(int userId, int flightNumber, String airline, Date departDate,String fareType, List<String> seats);


}
