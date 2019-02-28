package com.yangya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@SpringBootApplication
@EnableApolloConfig
@RestController
@EnableEurekaClient
public class ApolloConfigApp {
	public static void main(String[] args) {
		SpringApplication.run(ApolloConfigApp.class, args);
	}
	
	@ApolloConfig
	private Config config;
	
	@GetMapping("/test")
	public String test(){
		String property = config.getProperty("name", "name");
		return property;
	}

}
