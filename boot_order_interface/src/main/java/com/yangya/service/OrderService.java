package com.yangya.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface OrderService {
	
	@GetMapping("/getOrderByUser")
	Object getOrderByUser();

}
