package com.flight.booking.ServiceImpl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.flight.booking.Service.UserService;
import com.flight.booking.entities.Booking;
import com.flight.booking.entities.Flight;
import com.flight.booking.entities.User;
import com.flight.booking.repository.BookingRepository;
import com.flight.booking.repository.FlightRepository;
import com.flight.booking.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	UserRepository userRepo = new UserRepository();
	FlightRepository flightRepo = new FlightRepository();
	BookingRepository bookRepo = new BookingRepository();
	

	@Override
	public void addUser(int userId, String userName, int Funds) {
		// TODO Auto-generated method stub
		userRepo.addUser(userId, userName, Funds);
	}
	

	@Override
	public List<Flight> searchFlights(String departingFrom, String ArrivalTo, int paxCount) {
		// TODO Auto-generated method stub
//		--Comment
//		check for paxCound and refactor
		return flightRepo.getAvailableFlights();
	}
//	book flight

	@Override
	public int bookAFlight(int userId, int flightNumber, String airline, Date departDate, String fareType,
			List<String> seats) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.getUser(userId);
		
//		Calculate total fare type as every seat is same price
		Integer totalFareType = Integer.parseInt(fareType) * seats.size();
		
		
		if(user.get().getFunds() >= totalFareType) {
//			book directly
//			in future need to check clash of flights
			Booking booking = new Booking(userId, flightNumber, 1, new Date(), "10:00 AM", 300, 1, Arrays.asList("1A", "2D", "5E"), true);
//			bookRepo.getAllBookingDetailsForUser(userId);
			BookingRepository.bookingList.add(booking);
			System.out.println("Flight is booked successfully !!");
			return booking.getBooking_id();
			
		}
		else {
			System.out.println("Your funds are not sufficient to go through the trasaction. Please add accordingly");
		}
		return 0;
	}
	
//	cancel flight
	
	public void cancelBookingForUser(int user_id, int booking_id) {
		bookRepo.cancelBookingForUser(user_id, booking_id);
	}
	

}
