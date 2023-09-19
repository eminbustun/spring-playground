package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@GetMapping(path = "/users/{userId}") // Path variable'daki isimle aynı olması gerek
	public User getUserById(@PathVariable("userId") Long userId) {
		return null;
	}
}
