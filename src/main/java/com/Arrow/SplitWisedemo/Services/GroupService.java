package com.Arrow.SplitWisedemo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arrow.SplitWisedemo.Models.Group;
import com.Arrow.SplitWisedemo.Repository.GroupRepository;
import com.Arrow.SplitWisedemo.Repository.UserRepository;

@Service
public class GroupService {
	
	@Autowired
	private GroupRepository groupRepository;
	
	@Autowired
	private UserRepository userRepository;

	public boolean createGroup(Group group) {
		if (userRepository.findById(group.getCreatedBy()) == null) {
			groupRepository.save(group);
			return true;
		}
		return false;
	}
	
	public List<Group> getAllUserGroups(long userId){
		return groupRepository.findAllByCreatedBy(userId);
	}
 
}
