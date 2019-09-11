package com.ysj.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-hi", fallback = HiServiceHystrix.class)
public interface HiService {

	@GetMapping("/hi")
	String sayHi(@RequestParam("name") String name) throws Exception;
}
