package com.flight.booking.repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.flight.booking.entities.*;
public class BookingRepository {
	
	public static List<Booking> bookingList = new ArrayList<>();
	static {
		
		bookingList.add(new Booking(1, 101, 1, new Date(), "10:00 AM", 300, 1, Arrays.asList("1A", "2D", "5E"), true));
	}
	
	public List<Booking> getAllBookingDetailsForUser(int userId){
		
		List<Booking> bookingDetailsForUser = bookingList.stream().filter(booking -> booking.getUser_id() == userId).toList();
		return bookingDetailsForUser;
		
	}
	public List<Booking> cancelBookingForUser(int userId, int booking_id){
		
		List<Booking> bookingDetailsForUserToCancel = bookingList.stream().filter(booking -> (booking.getUser_id() == userId &&
												booking.getBooking_id() == booking_id)).toList();
		bookingDetailsForUserToCancel.forEach(booking -> booking.setStatus(false));
		
		return bookingDetailsForUserToCancel;
		
	}
}
