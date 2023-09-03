package com.flight.booking.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.flight.booking.entities.*;

public class UserRepository {
	
//	addUser
	static List<User> listOfUsers = new ArrayList<>(); 
	static {
		listOfUsers.add(new User(1, "Sam", 5000));
		listOfUsers.add(new User(2, "Arpit", 2000));
	}
	
	public void addUser(int userId, String userName, int Funds) {
//		write your add logic here
		boolean isPresentUser = listOfUsers.stream().anyMatch(user -> user.getUser_id() == userId);
		
		if(!isPresentUser) {
			listOfUsers.add(new User(userId, userName, Funds));
		}
		
	}
	public Optional<User> getUser(int user_id) {
		Optional<User> user = listOfUsers.stream().filter(userfind -> userfind.getUser_id() == user_id).findFirst();
		if(user.isPresent()) {
			return user;
		}
		else {
			return user;
		}
	}

}
