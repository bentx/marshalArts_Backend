package com.marshal.arts.backend.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marshal.arts.backend.bean.ActiveUser;
import com.marshal.arts.backend.bean.User;

public interface UserRepo  extends MongoRepository<User, String> { 
	List<User> findByMobile(String Mobile);
	
	List<User> findByNameContains(String name);

	
	
	

}
