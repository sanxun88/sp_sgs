package com.jt.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import com.jt.service.UserService;
@Service
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		List<User> findAll = userMapper.findAll();
		return findAll;
	}

	@Override
	public int insertObject(User user) {
		int insertObject = userMapper.insertObject(user);
		return insertObject;
	}

	@Override
	public int updateObject(User user) {
		int updateObject = userMapper.updateObject(user);
		return updateObject;
	}

	@Override
	public int deleteObject(Integer id) {
		int deleteObject = userMapper.deleteObject(id);
		return deleteObject;
	}

}
