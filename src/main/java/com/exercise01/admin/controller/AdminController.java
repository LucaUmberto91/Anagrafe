package com.exercise01.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercise01.admin.model.Admin;
import com.exercise01.admin.repository.AdminRepo;

@RestController

@RequestMapping(path = "/admin")
public class AdminController {

	@Autowired
	AdminRepo adminRepo;
	
	@PostMapping(path = "/register")
	public @ResponseBody String register(@RequestParam(value = "nickname") String nickname,
			@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
		
		Admin admin = new Admin(username,password,nickname);
		adminRepo.save(admin);
		return "Utente "+nickname+" User now online!";
	}
	
	@GetMapping(path = "/login")
	public @ResponseBody String login(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		String msg;
		Admin admin = adminRepo.findByUsernameAndPassword(username, password);
		if(admin!=null) msg = "Welcome "+admin.getNickname()+" !";
		else msg = "User or Password not correct!";

		return msg;
	}
	
	
}

