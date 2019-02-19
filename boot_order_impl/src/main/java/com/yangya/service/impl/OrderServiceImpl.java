package com.yangya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.yangya.entity.User;
import com.yangya.service.OrderService;
import com.yangya.service.feign.OrderServiceFeign;
@RestController
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderServiceFeign orderServiceFeign;

	@Override
	public Object getOrderByUser() {
		List<User> userList = orderServiceFeign.getUserList();
		if(userList==null){
			return "null";
		}
		return userList;
	}


}
