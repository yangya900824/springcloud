package com.yangya.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.yangya.entity.User;
import com.yangya.service.UserService;
@RestController
public class UserServiceImpl implements UserService{

	@Override
	public List<User> getUserList() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setId(1L);
		user.setName("yangya");
		users.add(user);
		return users;
	}

}
