package com.Arrow.SplitWisedemo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Arrow.SplitWisedemo.Models.Group;
import com.Arrow.SplitWisedemo.Services.GroupService;

@RestController
@RequestMapping("/group")
public class GroupController {
	
	@Autowired
	private GroupService groupService;
	
	@RequestMapping("/create")
	public String createGroup(@RequestBody Group group) {
		return groupService.createGroup(group) ? "groupCreated" : "notCreated";
	}

	@RequestMapping("/get")
	public List<Group> getAllUserGroups(@RequestParam long userId){
		return groupService.getAllUserGroups(userId);
	}
}
