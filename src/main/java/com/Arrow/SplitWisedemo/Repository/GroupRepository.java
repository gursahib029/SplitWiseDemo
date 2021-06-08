package com.Arrow.SplitWisedemo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Arrow.SplitWisedemo.Models.Group;

@Repository
public interface GroupRepository extends CrudRepository<Group,Long>{
	
	public List<Group> findAllByCreatedBy(long userId);  
}
