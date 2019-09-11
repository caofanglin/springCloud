package com.ysj.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService{

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "errorHi")
	public String hiService(String name){
		return restTemplate.getForObject("http://EUREKA-HI/hi?name="+name, String.class);
	}

	String errorHi(String name){
		return "hi,"+name+",sorry,error!";
	}
}
