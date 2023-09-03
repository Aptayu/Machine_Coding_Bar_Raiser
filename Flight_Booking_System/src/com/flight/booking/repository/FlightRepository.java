package com.flight.booking.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.flight.booking.entities.Flight;

public class FlightRepository {
	
//	This is coming from an API so just have in memory data for testing purposes
	
	public List<Flight> getAvailableFlights(){
		
		List<Flight> allAvailableFlights = new ArrayList<>();
		
		
		allAvailableFlights.add(new Flight(1, "Airline A", "2023-09-04", "10:00 AM", 250, "Economy", Arrays.asList("1A", "2D", "5E")));
        allAvailableFlights.add(new Flight(2, "Airline B", "2023-09-05", "11:30 AM", 300, "Business", Arrays.asList("2A", "2D", "5E")));
        allAvailableFlights.add(new Flight(3, "Airline C", "2023-09-06", "02:15 PM", 200, "Economy", Arrays.asList("3A", "5g", "5E")));
        allAvailableFlights.add(new Flight(4, "Airline D", "2023-09-07", "05:45 PM", 350, "Business", Arrays.asList("4A", "27f", "5E")));
		
		
		return allAvailableFlights;
					
	}

}
