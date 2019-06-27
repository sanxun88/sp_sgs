package com.jt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.pojo.User;

public interface UserMapper extends BaseMapper<User>{
	//查询全部的user表中的数据
	List<User> findAll();
	
	int insertObject(User user);
	
	int updateObject(User user);
	
	int deleteObject(Integer id);
	
}
