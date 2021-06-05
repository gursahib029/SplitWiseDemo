package com.Arrow.SplitWisedemo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Arrow.SplitWisedemo.Models.Group;

@RestController("/group")
public class GroupController {
	
	@RequestMapping("/create")
	public String createGroup(@RequestParam Group group) {
		return "groupCreated";
	}

}
