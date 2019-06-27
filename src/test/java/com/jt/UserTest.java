package com.jt;

import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jt.controller.UserController;
import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	@Autowired
	private UserController userController;
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void insertTest() {
		User user=new User();
		user.setId(123).setName("123").setAge(12).setSex("测试");
		userController.insertUser(user);
	}
	@Test
	public void updateTest() {
		User user=new User();
		user.setAge(18);
		user.setName("苏妲己");
		userController.update(user);
	}
	@Test
	public void DeleteTest() {
		User user=new User();
		user.setId(21);
		userController.delete(user.getId());
	}
	
	@Test
	public void Testupdate() {
		User user=new User();
		user.setAge(11);
		user.setId(21);
		int updateById = userMapper.updateById(user);
		System.out.println("返回"+updateById);
	}
	/**
	 * 从这开始 是使用了 BaseMapper
	 */
	@Test
	public void TestFind() {
//		User user=new User();
//		user.setAge(18);
		QueryWrapper<User> queryWrapper=new QueryWrapper<>();
//		queryWrapper.eq("age", 18);
		queryWrapper.ge("age", 18);	
		queryWrapper.le("age", 20);
		List<User> selectList = userMapper.selectList(queryWrapper);
		System.out.println(selectList);
	}
	@Test
	public void TestDelete() {
		QueryWrapper<User> queryWrapper=new QueryWrapper<>();
		queryWrapper.isNull("name");	//判断指定字段是否为空
		int delete = userMapper.delete(queryWrapper);
		System.out.println("删除了"+delete+"行");
	}
	@Test
	public void TestUpdate() {
		User user=new User();
		user.setAge(19);
		UpdateWrapper<User> updateWrapper=new UpdateWrapper<>();
		updateWrapper.eq("id", 17);
		userMapper.update(user, updateWrapper);
	}

}
