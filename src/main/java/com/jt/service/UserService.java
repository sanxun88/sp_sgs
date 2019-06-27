package com.jt.service;

import java.util.List;


import com.jt.pojo.User;

public interface UserService {
	List<User> findAll();
	int insertObject(User user);
	
	int updateObject(User user);
	
	int deleteObject(Integer id);
}
