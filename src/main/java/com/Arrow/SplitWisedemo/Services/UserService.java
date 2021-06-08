package com.Arrow.SplitWisedemo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arrow.SplitWisedemo.Models.User;
import com.Arrow.SplitWisedemo.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean createUser(User user) {
		List<User> existingUser = userRepository.findByMobileNumOrEmail(user.getMobileNum(), user.getEmail());
		if(existingUser.isEmpty()) {
			userRepository.save(user);
			return true;
		}
		return false;
	}
	

}
