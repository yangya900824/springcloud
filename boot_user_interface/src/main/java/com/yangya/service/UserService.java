package com.yangya.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.yangya.entity.User;

public interface UserService {
	
	@GetMapping("/getUserList")
	List<User> getUserList();

}
