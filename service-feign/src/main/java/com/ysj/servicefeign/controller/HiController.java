package com.ysj.servicefeign.controller;

import com.ysj.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Autowired
	private HiService hiService;

	@GetMapping("/hi")
	public String sayHi(@RequestParam String name) throws Exception{
		return hiService.sayHi(name);
	}
}
