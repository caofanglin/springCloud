package com.ysj.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HiServiceHystrix implements HiService {
	@Override
	public String sayHi(String name) throws Exception{
		return "抱歉";
	}
}
