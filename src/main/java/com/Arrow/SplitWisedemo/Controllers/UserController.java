package com.Arrow.SplitWisedemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arrow.SplitWisedemo.Models.User;
import com.Arrow.SplitWisedemo.Services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/signup")
	public String createUser(@RequestBody User user) {
		return userService.createUser(user) ? "userCreated" : "failed";
	}
	
}
