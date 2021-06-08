package com.Arrow.SplitWisedemo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Arrow.SplitWisedemo.Models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	public List<User> findByMobileNumOrEmail(long mobileNum, String email);

}
