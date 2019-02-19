package com.yangya.service.feign;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yangya.entity.User;
@Component
public class UserServiceHiHystric implements OrderServiceFeign{

	@Override
	public List<User> getUserList() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setId(1L);
		user.setName("error");
		users.add(user);
		return users;
	}

}
