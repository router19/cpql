package com.ms.vibe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPQLController {

	@GetMapping("/cpql")
	public Boolean canAccessServiceId(@RequestParam String userId, @RequestParam String serviceId)
	{
		if(userId.equals("vinikuma") && serviceId.equals("ABCD"))
			return true;
		return false;
	}
}
