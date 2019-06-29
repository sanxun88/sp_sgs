package com.jt.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;
import com.jt.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	public void insertUser(User user) {
		userService.insertObject(user);
	}
	public void update(User user) {
		userService.updateObject(user);
	}
	public int delete(Integer id) {
		int deleteObject = userService.deleteObject(id);
		return deleteObject;
	}
	
}
