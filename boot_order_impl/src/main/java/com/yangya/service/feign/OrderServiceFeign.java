package com.yangya.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.yangya.service.UserService;

@FeignClient(value = "boot-user",fallback=UserServiceHiHystric.class)
public interface OrderServiceFeign extends UserService{

}
