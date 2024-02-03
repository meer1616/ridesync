package com.ridesync.app.loginPageController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginService {
	@Autowired
	private UserRepository userRepository;
	
	public String addUser(User user) {
		userRepository.save(user);
		return "Saved successfully";
	}
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public User getUser(String email) {
		return userRepository.findByEmailId(email);
	}
	
	
}
